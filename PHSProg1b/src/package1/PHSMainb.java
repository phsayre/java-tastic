package package1;

public class PHSMainb{

	static int sharedValue = 0;
	static int finalValue = 0;
	static int sem;
	
	public static void main(String[] args){
		
		//the semaphore
		Semaphore semaphore = new Semaphore();
		semaphore.semSignal();
		
		//the thread for the producer class
		PHSProducerb producer = new PHSProducerb();
		Thread producerThread = new Thread(new Runnable() {

			@Override
			public void run() {
				sharedValue = producer.produceInt(sharedValue);
				semaphore.semWait();
			}
			
		});
		
		//the thread for the consumer class
		PHSConsumerb consumer = new PHSConsumerb();
		Thread consumerThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				finalValue = consumer.consumeInt(sharedValue, finalValue);
				semaphore.semSignal();
			}
		});
		
		//makes sure to stop running after the shared value reaches 10
		while(sharedValue < 10) {
			//check status of the semaphore before producing again
			sem = semaphore.semStatus();
			if(sem == 1) {
				producerThread.run();
			}
			else {
				consumerThread.run();
			}
		}
		
		System.out.println("The final value is: " + consumer.consumeInt(sharedValue, finalValue));
	}
}