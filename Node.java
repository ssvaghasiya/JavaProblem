
class Node{
	
	int data;
	Node next;
	Node(int d)
	{
		data = d;
	}
}

class LList{
	
	Node head;
	
	void insertBegin(int x)
	{
		Node temp = new Node(x);
		temp.next = head;
		head = temp;
	}
	
	void printList(){
		
		Node curr = head;
		
		while(curr != null)
		{
			System.out.println(curr.data);
			curr = curr.next;
		}
	}
}

class Test{
	
	public static void main(String args[]){
		
		LList l = new LList();
		l.insertBegin(20);
		l.insertBegin(5);
		l.insertBegin(10);
		l.printList();
	}
}


	
	
	