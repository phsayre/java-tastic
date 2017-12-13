package package1;

public class PHSConsumerb {
	
	public int consumeInt(int sharedValue, int finalValue) {
		finalValue += sharedValue;
		return finalValue;
	}
}