class Node{
	
	int data;
	Node next;
	Node(int d)
	{
		data = d;
	}
}

class MergeLink{
	
	Node head;
	
	public void insert(int x)
	{
		Node tmp = new Node(x);
		if( head == null)
		{
			head = tmp;
			return;
		}
		Node curr = head;
		
		while(curr.next !=null)
		{
			curr = curr.next;
		}
		
		curr.next = tmp;
	}
	
	public void printList()
	{
		Node curr = head;
		while(curr != null)
		{
			System.out.print(curr.data+"  ");
			curr = curr.next;
		}
	}
	
	
	public static  Node merge(Node head1,Node head2)
	{
		
		Node dummy = new Node(0);
		
		Node temp =  dummy;
		
		while(true)
		{
			if(head1 == null)
			{
				temp.next = head2;
				break;
			}
			if(head2 == null)
			{
				temp.next = head1;
				break;
			}
			
			
			
			if(head1.data<=head2.data)
			{
				temp.next = head1;
				head1 = head1.next;
				temp = temp.next;
				
			}
			else{
				
				temp.next = head2;
				head2 = head2.next;
				temp = temp.next;
			}
		}
		
		return dummy.next;
		
	}

	
	public static void main(String args[])
	{
			MergeLink link1 = new MergeLink();
			MergeLink link2 = new MergeLink();
			link1.insert(2);
			link1.insert(4);
			link1.insert(7);
			
			link2.insert(3);
			link2.insert(5);
			link2.insert(8);
			link2.insert(9);
			
			Node h = merge(link1.head,link2.head);
			
			System.out.print(h.data);
			//link1.printList();
		//	System.out.println(" ");
		//	link2.printList();
			
	}
}

			
			
			
			
			
			
			
			