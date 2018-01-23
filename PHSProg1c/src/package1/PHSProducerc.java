package package1;

public class PHSProducerc {
	
	
	public int produceInt(int value) {
		
		//returns the shared value when it reaches 10
		if (value == 10) {
			return value;
		}
		//otherwise, it increments the shared value
		else {
			value++;
			return value;
		}
	}
}