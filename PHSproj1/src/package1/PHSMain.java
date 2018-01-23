package package1;

public class PHSMain{

	static int sharedValue = 0;
	static int finalValue = 0;
	
	public static void main(String[] args){
		
		//the thread for the producer class
		PHSProducer producer = new PHSProducer();
		Thread producerThread = new Thread(new Runnable() {

			@Override
			public void run() {
				sharedValue = producer.produceInt(sharedValue);
			}
			
		});
		
		//the thread for the consumer class
		PHSConsumer consumer = new PHSConsumer();
		Thread consumerThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				finalValue = consumer.consumeInt(sharedValue, finalValue);
			}
		});
		
		//makes sure to stop running after the shared value reaches 10
		while(sharedValue < 10) {
			producerThread.run();
			consumerThread.run();
		}
		
		System.out.println("The final value is: " + consumer.consumeInt(sharedValue, finalValue));
	}
}