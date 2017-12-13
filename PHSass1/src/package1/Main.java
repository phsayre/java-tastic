package package1;

public class Main {
	static int sharedValue = 0;
	static int finalValue = 0;
	static int producerCount = 0;
	static int consumerCount = 0;
	
	public static void main(String[] args){
		
		//the thread for the producer class
		Producer producer = new Producer();
		Thread producerThread = new Thread(new Runnable() {

			@Override
			public void run() {
				sharedValue = producer.produceInt(sharedValue);
				producerCount = producer.countCheck();
			}
			
		});
		
		//the thread for the consumer class
		Consumer consumer = new Consumer();
		Thread consumerThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				finalValue = consumer.consumeInt(sharedValue, finalValue);
				consumerCount = consumer.checkCounter();
			}
		});
		
		//makes sure to stop running after 20 times
		while(producerCount < 20) {
			producerThread.run();
		}
		while(consumerCount < 20) {
			consumerThread.run();
		}
		
		System.out.println("Generated number: " + consumer.consumeInt(sharedValue, finalValue));
	}
}
