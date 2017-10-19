package package2;

class PHSList2 {

	private static PHSListNode head;
	private static int numNodes;
	
	
	public PHSList2(Object obj)
	  {
		head = new PHSListNode(obj, null);
		numNodes = 1;
	  }
	
	
	public void addToEnd(Object value) {
		
		PHSListNode temp = head;
		head = new PHSListNode(value, null);
		head.next = temp;
		numNodes++;
	}
	
    
	public static void main(String[] args) {
		PHSListNode <String> myList = new PHSListNode<String>("Honda",
									  new PHSListNode<String>("Toyota",
									  new PHSListNode<String>("Nissan",
									  new PHSListNode<String>("BMW",
									  new PHSListNode<String>("Daihatsu",
									  new PHSListNode<String>("Subaru",
									  new PHSListNode<String>("Chevrolet",
									  new PHSListNode<String>("AMC", null))))))));
		
		myList.Print(myList);
		
	}
}


class PHSListNode <E> {

	PHSListNode<E> next;
	private Object value;
	
	public PHSListNode(Object newVal, PHSListNode<E> nextVal) {
		value = newVal;
		next = nextVal;
	}
	
	public void Print(PHSListNode<String> myNode) {
		String result = "[ ";
		
		while (myNode != null) {
			result += myNode.getValue().toString();
			result += " ";
			myNode = myNode.getNext();
		}
		
		result += "]";
		System.out.println(result);
		
	}

	public Object getValue() {return value;}
	public PHSListNode<E> getNext() {return next;}
	public void setValue(Object newVal) {value = newVal;}
	public void setNext(PHSListNode<E> newNext) {next = newNext;}
	
}