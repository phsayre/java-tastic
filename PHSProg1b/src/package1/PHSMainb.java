package package1;

public class PHSMainb{

	static int sharedValue = 0;
	static int finalValue = 0;
	static int sem;
	
	public static void main(String[] args){
		
		//the semaphore
		Semaphore semaphore = new Semaphore();
		semaphore.semSignal();
		
		//the producer and its thread
		PHSProducerb producer = new PHSProducerb();
		Thread producerThread = new Thread(new Runnable() {

			@Override
			public void run() {
				//produces the shared value
				sharedValue = producer.produceInt(sharedValue);
				//signals the semaphore to change to the wait status
				semaphore.semWait();
			}
			
		});
		
		//the consumer and its thread
		PHSConsumerb consumer = new PHSConsumerb();
		Thread consumerThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				//sums the final value with the shared value
				finalValue = consumer.consumeInt(sharedValue, finalValue);
				//singals the semaphore to change value, allowing the producer to continue
				semaphore.semSignal();
			}
		});
		
		//runs the threads until the shared value reaches 10
		while(sharedValue < 10) {
			//check status of the semaphore before producing again
			sem = semaphore.semStatus();
			//when it's safe, the producer runs
			if(sem == 1) {
				producerThread.run();
			}
			//otherwise, the consumer runs and switches the semaphore when it's finished
			else {
				consumerThread.run();
			}
		}
		
		System.out.println("The final value is: " + consumer.consumeInt(sharedValue, finalValue));
	}
}