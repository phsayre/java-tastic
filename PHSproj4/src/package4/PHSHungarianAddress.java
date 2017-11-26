package package4;
import java.util.Scanner;
import java.util.ArrayList;

public class PHSHungarianAddress {

	private String title;
	private String fname;
	private String lname;
	private String postCode;
	private String city;
	private String streetName;
	private String streetNumber;
	private String aptFloor;
	private String aptNumber;
	private int isApartment;
	private int addressCount;
	private static ArrayList<ArrayList<String>> addressList = new ArrayList<ArrayList<String>>();

	
	public String getTitle() { return title; }
	public void setTitle(String title) { this.title = title; }
	public String getFirstName() { return fname; }
	public void setFirstName(String fname) { this.fname = fname; }
	public String getLastName() { return lname; }
	public void setLastName(String lname) { this.lname = lname; }
	public String getPostCode() { return postCode; }
	public void setPostCode(String postCode) { this.postCode = postCode; }
	public String getCity() { return city; }
	public void setCity(String city) { this.city = city; }
	public String getStreetName() { return streetName; }
	public void setStreetName(String streetName) { this.streetName = streetName; }
	public String getStreetNumber() { return streetNumber; }
	public void setStreetNumber(String streetNumber) { this.streetNumber = streetNumber; }
	public String getAptFloor() { return aptFloor; }
	public void setAptFloor(String aptFloor) { this.aptFloor = aptFloor; }
	public String getAptNumber() { return aptNumber; }
	public void setAptNumber(String aptNumber) { this.aptNumber = aptNumber; } 
	
	
	public void parseAddress() {
		inputTitle();
		inputName();
		inputPostCode();
		inputCity();
		inputStreetName();
		inputStreetNumber();
		
		if(isApartment()) {
			inputAptFloor();
			inputAptNumber();
			formatAddress();
		}
		else {
			formatAddress();
		}
	}
	
	public void inputTitle() {
		System.out.println("Please enter a title for the addressee");
		
		Scanner sc = new Scanner(System.in);
		title = sc.nextLine();
	}
	
	public void inputName() {
		System.out.println("Please enter the first and last name of the addressee on the same line and in that order");
		
		Scanner sc = new Scanner(System.in);
		fname = sc.next();
		lname = sc.next();
	}	
	
	public void inputPostCode() {
		System.out.println("Please enter the post code");
		
		Scanner sc = new Scanner(System.in);
		postCode = sc.nextLine();
	}
	
	public void inputCity() {
		System.out.println("Please enter the city");
		
		Scanner sc = new Scanner(System.in);
		city = sc.nextLine();
	}
	
	public void inputStreetName() {
		System.out.println("Please enter the street name (ommitting the street number)");
		
		Scanner sc = new Scanner(System.in);
		streetName = sc.nextLine();
	}
	
	public void inputStreetNumber() {
		System.out.println("Please enter the street number");
		
		Scanner sc = new Scanner(System.in);
		streetNumber = sc.nextLine();
	}
	
	public void inputAptFloor() {
		System.out.println("Please enter the apartment floor");
		
		Scanner sc = new Scanner(System.in);
		aptFloor = sc.nextLine();
	}
	
	public void inputAptNumber() {
		System.out.println("Please enter the apartment number");
		
		Scanner sc = new Scanner(System.in);
		aptNumber = sc.nextLine();
	}
	
	public Boolean isApartment() {
		System.out.println("Is this an apartment? (Enter 1 or 2)");
		System.out.println("1: Yes");
		System.out.println("2: No");
		
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		if (i == 1) {
			isApartment = 1;
			return true;
		}
		else {
			isApartment = 0;
			return false;
		}
	}
	
	public Boolean hasAddresses() {
		if (addressList.isEmpty()) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public void displayAddresses() {
		for(int i = 0; i < addressList.size(); i++) {
			System.out.println("[Address " + (i + 1) + "]");
			System.out.println(addressList.get(i).toString());
		}
	}
	
	public void formatAddress() {
		addressCount++;
		
		ArrayList<String> address = new ArrayList<String>();
		address.add(title);
		address.add(lname);
		address.add(fname);
		address.add(postCode);
		address.add(city);
		address.add(streetName); 
		address.add(streetNumber);
		
		if(isApartment == 1) {
			address.add(aptFloor);
			address.add(aptNumber);
		}
		
		addressList.add(address);
	}
}
