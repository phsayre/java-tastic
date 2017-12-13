package package1;
import java.util.Random;

public class Producer {
	
	Random rand = new Random();
	int  n = rand.nextInt(10) + 1;
	int counter = 0;
	
	public int produceInt(int value) {
		
		counter++;
		value =+ n;	
		return value;
	}
	
	public int countCheck() {
		return counter;
	}
}