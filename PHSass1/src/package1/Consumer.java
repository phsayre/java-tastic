package package1;

public class Consumer {
	
	int counter = 0;
	
	public int consumeInt(int sharedValue, int finalValue) {
		finalValue += sharedValue;
		counter++;
		return finalValue;
	}
	
	public int checkCounter() {
		return counter;
	}
}
