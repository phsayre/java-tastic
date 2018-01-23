package package1;

public class PHSConsumer2c {
	
	public int consumeInt(int sharedValue, int finalValue) {
		//sums the shared value with the final value and returns the final value
		finalValue += sharedValue;
		return finalValue;
	}
}