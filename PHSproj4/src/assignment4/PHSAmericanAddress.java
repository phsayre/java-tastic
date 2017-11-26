package assignment4;

import java.util.ArrayList;
import java.util.Scanner;

public class PHSAmericanAddress extends PHSHungarianAddress {
	private String state;
	private static ArrayList<ArrayList<String>> addressList = new ArrayList<ArrayList<String>>();
	
	public void displayAddresses() {
		for(int i = 0; i < addressList.size(); i++) {
			System.out.println("[Address " + (i + 1) + "]");
			System.out.println(addressList.get(i).get(0).toString() + " " + addressList.get(i).get(2).toString() + " " + addressList.get(i).get(1).toString());
			try {
				System.out.println(addressList.get(i).get(6).toString() + " " + addressList.get(i).get(5).toString() + " " + addressList.get(i).get(7).toString() + " " + addressList.get(i).get(8).toString());
			}
			catch (Exception ex) {
				//apartment floor and number is not set
				System.out.println(addressList.get(i).get(6).toString() + " " + addressList.get(i).get(5).toString());
			}
			System.out.println(addressList.get(i).get(4).toString() + " " + addressList.get(i).get(3).toString());
			
			System.out.println("USA");
		}
	}
	
	public void inputState() {
		System.out.println("Please enter a state for the addressee");
		
		Scanner sc = new Scanner(System.in);
		state = sc.nextLine();
	}
	
}
