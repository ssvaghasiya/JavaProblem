import java.util.*;


class Node{
	int data;
	Node next;
	Node(int d)
	{
		data = d;
	}
}


public class QueueLinkedList{
	
	Node head; 
	
	public void enqueue(int x)
	{
		
		Node temp = new Node(x);
		if(head==null)
		{
			head = temp;
			return;
		}
		
		Node curr = head;
		while(curr.next != null)
		{
			curr = curr.next;
		}
		curr.next = temp;
	}
	
	public void dequeue()
	{
		if(head != null)
		{
			head = head.next;
		}
		else
		{
			return;
		}
	}
	
	public void printList()
	{
		Node curr = head;
		while(curr!=null)
		{
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
	}
	
	public static void main(String args[])
	{
		QueueLinkedList q = new QueueLinkedList();
		q.enqueue(10);
		q.enqueue(15);
		q.enqueue(20);
		q.enqueue(25);
		q.enqueue(30);
		
		q.printList();
		q.dequeue();
		System.out.println();
		q.printList();
		
	}
}
