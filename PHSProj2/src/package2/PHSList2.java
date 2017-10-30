package package2;

class PHSList2 {

	private static PHSListNode head;
	private static int numNodes;
	public static int currentObj;
	
	
	public PHSList2(Object obj)
	  {
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
	
	
	public void firstElement() {
		currentObj = 0;
	}
	
	
	public void nextElement() {
		currentObj ++;
	}
	
	
	public boolean hasMoreElements(int curr) {
		try {
			PHSListNode temp = head;
			temp = temp.next;
			return true;
		}
		catch (Exception e) {
			return false;
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
		PHSList2 myList = new PHSList2("head");
		myList.addToEnd("Honda");
		myList.addToEnd("Daihatsu");
		myList.addToEnd("Nissan");
		myList.addToEnd("Mitsubishi");
		myList.addToEnd("Subaru");
		myList.addToEnd("Mazda");
		myList.addToEnd("Suzuki");
		myList.addToEnd("Toyota");
		
		PHSList2.Print();
		
		System.out.print("There are " + numNodes + " items in the list.");
		
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