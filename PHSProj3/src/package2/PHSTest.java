package package2;

public class PHSTest {
	
	public PHSTest() {}
	
	public static void main(String[] args) {
		PHSList2 myList = new PHSList2("head");
		myList.addToEnd("Blue");
		myList.addToEnd("Orange");
		myList.addToEnd("Purple");
		myList.addToEnd("Green");
		myList.addToEnd("Yellow");
		
		System.out.println("The first element in the list is [" + myList.firstElement());
	}
}
