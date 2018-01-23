package package1;

public class PHSMainc{

	static int sharedValue = 0;
	static int finalValue1 = 0;
	static int finalValue2 = 0;
	static int sem;
	
	public static void main(String[] args){
		
		//the first semaphore
		Semaphorec semaphore = new Semaphorec();
		semaphore.semSignal();
		
		//the producer and its thread
		PHSProducerc producer = new PHSProducerc();
		Thread producerThread = new Thread(new Runnable() {

			@Override
			public void run() {
				//produces the shared value
				sharedValue = producer.produceInt(sharedValue);
				//signals the semaphore to change value to wait status
				semaphore.semWait();
			}
			
		});
		
		//the first consumer and its thread
		PHSConsumer1c consumer1 = new PHSConsumer1c();
		Thread consumer1Thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				//sums the final value with the shared value
				finalValue1 = consumer1.consumeInt(sharedValue, finalValue1);
				//singals the semaphore to change value, allowing the producer to continue
				semaphore.semSignal();
			}
		});

		//the second consumer and its thread
		PHSConsumer2c consumer2 = new PHSConsumer2c();
		Thread consumer2Thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				//sums the final value with the shared value
				finalValue2 = consumer2.consumeInt(sharedValue, finalValue2);
				//singals the semaphore to change value, allowing the producer to continue
				semaphore.semSignal();
			}
		});
		
		//runs the threads until the shared value reaches 10
		while(sharedValue < 10) {
			//check status of the semaphore before producing again
			sem = semaphore.semStatus();
			//when it's safe, the producer runs
			if(sem == 2) {
				producerThread.run();
			}
			//otherwise, the first consumer runs and increments the semaphore when it's finished
			else if (sem == 1) {
				consumer1Thread.run();
			}
			//or the second consumer runs and increments the semaphore when it's finished
			else {
				consumer2Thread.run();
			}
		}
		
		System.out.println("The first final value is: " + consumer1.consumeInt(sharedValue, finalValue1));
		System.out.println("The second final value is: " + consumer2.consumeInt(sharedValue, finalValue2));
	}
}