package package4;
import java.util.Scanner;

public class PHSHungarianAddress {

	private String title;
	private String fname;
	private String lname;
	private int postCode;
	private String city;
	private String streetName;
	private int streetNumber;
	private int aptFloor;
	private int aptNumber;
	
	
	public String getTitle() { return title; }
	public void setTitle(String title) { this.title = title; }
	public String getFirstName() { return fname; }
	public void setFirstName(String fname) { this.fname = fname; }
	public String getLastName() { return lname; }
	public void setLastName(String lname) { this.lname = lname; }
	public int getPostCode() { return postCode; }
	public void setPostCode(int postCode) { this.postCode = postCode; }
	public String getCity() { return city; }
	public void setCity(String city) { this.city = city; }
	public String getStreetName() { return streetName; }
	public void setStreetName(String streetName) { this.streetName = streetName; }
	public int getStreetNumber() { return streetNumber; }
	public void setStreetNumber(int streetNumber) { this.streetNumber = streetNumber; }
	public int getAptFloor() { return aptFloor; }
	public void setAptFloor(int aptFloor) { this.aptFloor = aptFloor; }
	public int getAptNumber() { return aptNumber; }
	public void setAptNumber(int aptNumber) { this.aptNumber = aptNumber; } 
	
	
	public void parseAddress() {
		inputTitle();
		inputName();
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
		postCode = sc.nextInt();
	}
	
	public void inputCity() {
		System.out.println("Please enter the city");
		
		Scanner sc = new Scanner(System.in);
		city = sc.nextLine();
	}
	
	
}
