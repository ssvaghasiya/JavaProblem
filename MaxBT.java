
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


public class MaxBT
{
	
	public static int getMax(Node root)
	{
		if(root == null)
			return Integer.MIN_VALUE;
		else
			return Math.max(root.data,Math.max(getMax(root.left),getMax(root.right)));
	}
	
	public static void main(String args[])
	{
		
		Node root = new Node(10);
		
		root.left = new Node(30);
		
		root.left.left = new Node(90);
		
		root.right = new Node(40);
		
		root.right.right = new Node(100);
		
		root.right.right.left = new Node(260);
		
		System.out.println(getMax(root));
	}
}
		