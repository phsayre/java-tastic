package package1;
/*
 * Author: Philip Sayre
 * Date: Jan 23, 2018
 * For: CSC-403-AR
 */
public class PHSMain{

	static int sharedValue = 0;
	static int finalValue = 0;
	
	public static void main(String[] args){
		
		//the thread for the producer class
		PHSProducer producer = new PHSProducer();
		//the thread for the producer
		Thread producerThread = new Thread(new Runnable() {

			@Override
			public void run() {
				//the producer generates the shared value for the consumer to consume
				sharedValue = producer.produceInt(sharedValue);
			}
			
		});
		
		//the thread for the consumer class
		PHSConsumer consumer = new PHSConsumer();
		//the thread for the consumer
		Thread consumerThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				//summing the shared value with the final value
				finalValue = consumer.consumeInt(sharedValue, finalValue);
			}
		});
		
		//runs the threads until the shared value reaches 10
		while(sharedValue < 10) {
			producerThread.run();
			consumerThread.run();
		}
		
		System.out.println("The final value is: " + consumer.consumeInt(sharedValue, finalValue));
	}
}