package package2;

class PHSList2 {

	private static PHSListNode head;
	private static int numNodes;
	
	
	public PHSList2(Object obj)
	  {
		head = new PHSListNode(obj);
		numNodes
	  }
	
	
	public void addToEnd(Object obj) {
		
		PHSListNode temp = head;
		head = new PHSListNode(obj);
		head.next = temp;
		numNodes++;
	}
	
	
	public void allocateNewArray() {
		items = Arrays.copyOf(items,  items.length * 2);
	}
	
	
	public void Print() {
		if (items.length == 0) {
			System.out.println("[]");
		}
		else {
			String result = "[ ";
			
			for (int i = 0; i < numItems; i++) {
				result += items[i].toString();
				result += " ";
			}
			
			result += "]";
			
			System.out.println(result);
		}
		
	}
	
	
    public void firstElement() {
    	currentObject = 0;
	}
    
    
    public Object nextElement(int pointer) {
		if (pointer < numItems) {
			return items[pointer];
		} 
		else {
			throw new ArrayIndexOutOfBoundsException();
		}
	}
    
    public boolean hasMoreElements(int currentObject, Object obj) {
    	try {
    		currentObject ++;
    		items[currentObject] = obj;
    		return true;
    	}
    	catch (Exception e){
    		return false;
    	}
    }
	
    
	public static void main(String[] args) {
		PHSList2 obj = new PHSList2();
		
		//Test 1
		obj.addToEnd(new String("Suzy"));
		obj.addToEnd(new String("James"));
		obj.addToEnd(new String("Reginald"));
		
		obj.Print();
		
		//Test2
		obj = null;
		obj = new PHSList2();
	
		obj.Print();
		
		//Test3
		obj = null;
		obj = new PHSList2();
		
		obj.addToEnd(new String("Suzy"));
		obj.addToEnd(new String("James"));
		obj.addToEnd(new String("Reginald"));
		obj.addToEnd(new String("Anne"));
		obj.addToEnd(new String("Joe"));
		obj.addToEnd(new String("Ryan"));
		obj.addToEnd(new String("Matt"));
		obj.addToEnd(new String("Donald"));
		obj.addToEnd(new String("Jennifer"));
		obj.addToEnd(new String("Winston"));
		obj.addToEnd(new String("Camel"));
		obj.addToEnd(new String("Jessica"));
		obj.addToEnd(new String("Sharlene"));
		obj.addToEnd(new String("Victoria"));
		
		obj.Print();
		
	}
}

class PHSListNode {

	PHSListNode next;
	private Object value;
	
	public PHSListNode(Object obj, PHSListNode newNext) {
		value = obj;
		next = newNext;
	}
	
	public Object getValue() {return value;}
	public PHSListNode getNext() {return next;}
	
}