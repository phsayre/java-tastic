package package4;
import java.util.Scanner;

public class PHSprog4 {

	public static void mainMenu() {
		System.out.println("Please choose an option by entering 1 or 2 into the console");
		System.out.println("1: View saved addresses");
		System.out.println("2: Create new address");
		
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		if(i == 1) {
			//show saved addresses
		}
		else if(i == 2) {
			addressSelect();
		}
		else {
			System.out.println("Error: invalid input");
		}
	}
	
	public static void addressSelect() {
		System.out.println("Please choose an option by entering 1 or 2 into the console");
		System.out.println("1: Hungarian address");
		System.out.println("2: American address");
		
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		if(i == 1) {
			PHSHungarianAddress hungy = new PHSHungarianAddress();
			hungy.parseAddress();
		}
		else if(i == 2) {
			//do american address
		}
		else {
			System.out.println("Error: invalid input");
		}
	}
	
	public static void main(String args[]) {
		mainMenu();
	}
}
