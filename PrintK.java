
import java.util.*;

class Node{
	
	int data;
	Node left;
	Node right;
	
	Node(int d)
	{
		data = d;
	}
}


public class PrintK
{
	
	public static void printK(Node root,int k)
	{
		if(root == null)
			return;
		if(k==0)
			System.out.print(root.data+" ");
		else
		{
			printK(root.left,k-1);
			printK(root.right,k-1);
		}
		
	}
	
	public static void main(String args[])
	{
		
		Node root = new Node(10);
		
		root.left = new Node(30);
		
		root.left.left = new Node(90);
		
		root.right = new Node(40);
		
		root.right.right = new Node(100);
		
		root.right.right.left = new Node(260);
		int k = 2;
		
		printK(root,k);
	}
}
		