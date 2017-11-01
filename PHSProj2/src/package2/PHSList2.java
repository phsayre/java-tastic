package package2;

public class PHSList2 {
	
	private static PHSListNode head;
	private static int numNodes;
	public static int currentObj;
	
	
	public PHSList2(Object obj) {
		head = new PHSListNode(obj);
	}
	
	
	public void addToEnd(Object value) {
		PHSListNode temp = head;
		
		while(temp.next != null) {
			temp = temp.next;
		}
		
		temp.next = new PHSListNode(value);
		numNodes++;
	}
	
	
	public static Object findValue(int index) {
		PHSListNode temp = head;
		
		for (int i = 0; i < index; i++) {
			temp = temp.next;
		}
		return temp.value;
	}
	
	
	public void firstElement() {
		currentObj = 0;
	}
	
	
	public boolean hasMoreElements(Object obj) {
		try {
			PHSListNode temp = head;
			temp = temp.next;
			return true;
		}
		catch (Exception ex) {
			return false;
		}
	}
	
	
	public void nextElement(Object obj) {
		try {
			if (hasMoreElements(obj)) {
				currentObj++;			}
			else {
				throw new NoNextElementException();
			}
		}
		catch (NoNextElementException ex) {
			System.out.println("Exception thrown: end of the list.");
		}
	}
	
	
	public static void Print() {
		String result = "[ ";
		
		PHSListNode temp = head;
		while(temp != null)
		{
			result += temp.value;
			result += " ";
			temp = temp.next;
		}
		
		result += "]";
		System.out.println(result);
	}
	
    
	public static void main(String[] args) {
		PHSList2 myList = new PHSList2("Toyota");
		myList.addToEnd("Honda");
		myList.addToEnd("Daihatsu");
		myList.addToEnd("Nissan");
		myList.addToEnd("Mitsubishi");
		myList.addToEnd("Subaru");
		
		PHSList2.Print();
		
		System.out.println("There are " + numNodes + " items in the list");
		
		myList.firstElement();
		
		System.out.println("The first element in the list is [" + findValue(currentObj) +  "]");
	}
}


class PHSListNode {
	
	PHSListNode next;
	Object value;
	
	public PHSListNode(Object val) {
		value = val;
	}

	public Object getValue() {return value;}
	public PHSListNode getNext() {return next;}
	public void setValue(Object newVal) {value = newVal;}
	public void setNext(PHSListNode newNext) {next = newNext;}
}


@SuppressWarnings("serial")
class NoNextElementException extends Exception {
	
	public NoNextElementException() {}
	
	public NoNextElementException(String message) {
		super(message);
	}
}