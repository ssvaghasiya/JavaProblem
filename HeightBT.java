
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


public class HeightBT
{
	
	public static int height(Node root)
	{
		if(root == null)
			return 0;
		else
			return Math.max(height(root.left),height(root.right))+1;
	}
	
	public static void main(String args[])
	{
		
		Node root = new Node(10);
		
		root.left = new Node(30);
		
		root.left.left = new Node(90);
		
		root.right = new Node(40);
		
		root.right.right = new Node(100);
		
		root.right.right.left = new Node(260);
		
		System.out.println(height(root));
	}
}
		