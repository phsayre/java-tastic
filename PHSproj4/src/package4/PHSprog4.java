package package4;
import java.util.Scanner;

public class PHSprog4 {

	public static void main(String args[]) {
		System.out.println("Please choose an option by entering 1 or 2 into the console");
		System.out.println("1: Hungarian Address");
		System.out.println("2: American Address");
		
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		if(i == 1) {
			PHSHungarianAddress hungyAddress = new PHSHungarianAddress();
			hungyAddress.parseAddress();
		}
		else if(i == 2) {
			//do american stuff
			System.out.println("This is americandiaf");
		}
		else {
			System.out.println("Error: invalid input");
		}
	}
}
