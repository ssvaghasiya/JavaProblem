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


public class Queue2{
	
	public static void Inorder(Node root)
	{
		int count = 0;
		if(root!=null)
		{
			Inorder(root.left);
			System.out.print(root.data+" ");
			Inorder(root.right);
			count++;
		}
		
		System.out.println();
		System.out.print(count);
	}
/*	
	public static void levelOrder(Node root)
	{
		Queue<Node> q = new LinkedList<Node>();
		
		q.add(root);
		
		while(q.empty() == false)
		{
			Node curr = q.poll();
			System.out.print(curr.data+" ");
			if(curr.left != null)
				q.add(curr.left);
			
			if(curr.right != null)
				q.add(curr.right);
		}
	}
*/	
		
	
	public static void main(String args[])
	{
		Node root = new Node(10);
		
		root.left = new Node(20);
		
		root.right = new Node(30);
		
		root.right.left = new Node(40);
		
		root.right.right = new Node(50);
		
		Inorder(root);
		System.out.println();
		//levelOrder(root);
	}
}