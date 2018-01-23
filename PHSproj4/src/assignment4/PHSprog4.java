package assignment4;
import java.util.Scanner;

public class PHSprog4 {

	public static void mainMenu() {
		System.out.println("Please choose an option by entering 1 or 2 into the console");
		System.out.println("1: View saved addresses");
		System.out.println("2: Create new address");
		
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		if(i == 1) {
			PHSHungarianAddress hungy = new PHSHungarianAddress();
			PHSAmericanAddress merca = new PHSAmericanAddress();
			
			if(hungy.hasAddresses() && merca.hasAddresses()) {
				hungy.displayAddresses();
				merca.displayAddresses();
				System.out.println("Test 1");
			}
			else if(merca.hasAddresses()) {
				merca.displayAddresses();
				System.out.println("Test 2");
			}
			else if(hungy.hasAddresses()) {
				hungy.displayAddresses();
				System.out.println("HUULLOO");
			}
			else {
				System.out.println("No saved addresses!");
			}
		}
		else if(i == 2) {
			addressSelect();
		}
		else {
			System.out.println("Error: invalid input");
		}
		mainMenu();
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
			PHSAmericanAddress merca = new PHSAmericanAddress();
			merca.parseAddress();
			merca.inputState();
		}
		else {
			System.out.println("Error: invalid input");
		}
	}
	
	public static void main(String args[]) {
		mainMenu();
	}
}
