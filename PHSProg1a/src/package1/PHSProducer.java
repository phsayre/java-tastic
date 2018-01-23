package package1;
/*
 * Author: Philip Sayre
 * Date: Jan 23, 2018
 * For: CSC-403-AR
 */
public class PHSProducer {
	
	
	public int produceInt(int value) {
		
		//the producer stops incrementing the shared value once it reaches 10
		if (value == 10) {
			return value;
		}
		//the producer increments the shared value and returns it
		else {
			value++;
			return value;
		}
	}
}