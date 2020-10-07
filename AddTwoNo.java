
import java.util.*;
import java.io.*;
import java.lang.*;

class Node{
	int data;
	Node next;
	Node(int d)
	{
		data = d;
	}
}

class List{
	Node head;
	public void insert(int d)
	{
		Node temp = new Node(d);
		if(head == null)
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
	
	public void print1()
	{
		for(Node curr = head;curr!=null;curr = curr.next)
		{
			System.out.print(curr.data+" ");
		}
	}
}
	
public class AddTwoNo{
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
    }

	
	public static void main(String args[]){
		List l1 = new List();
		List l2 = new List();
		l1.insert(2);
		l1.insert(4);
		l1.insert(3);
		l1.print1();
		System.out.println("");
		l2.insert(5);
		l2.insert(6);
		l2.insert(4);
		l2.print1();
		System.out.println("");
		addTwoNumbers(l1.head,l2.head);
		
		
	}
}