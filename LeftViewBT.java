
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


public class LeftViewBT
{
	static int maxLevel = 0;
	public static void printLeft(Node root,int level)
	{
		if(root == null)
			return;
		if(maxLevel < level)
		{
			maxLevel = level;
			System.out.print(root.data+" ");
		}
		
		printLeft(root.left,level+1);
		printLeft(root.right,level+1);
	}
		
	
	
	public static void main(String args[])
	{
		
		Node root = new Node(10);
		
		root.left = new Node(30);
		
		root.left.left = new Node(90);
		
		root.right = new Node(40);
		
		root.right.right = new Node(100);
		
		root.right.right.left = new Node(260);
		
		
		printLeft(root,1);
	}
}
		