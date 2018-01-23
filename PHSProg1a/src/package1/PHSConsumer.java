package package1;
/*
 * Author: Philip Sayre
 * Date: Jan 23, 2018
 * For: CSC-403-AR
 */
public class PHSConsumer {
	
	public int consumeInt(int sharedValue, int finalValue) {
		//the consumer sums the shared value to the final value and returns the final value
		finalValue += sharedValue;
		return finalValue;
	}
}