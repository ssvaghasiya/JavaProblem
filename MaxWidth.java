


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


public class MaxWidth
{
	
	public static int maxWidth(Node root)
	{
		if(root == null)
			return 0;
		
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		int res = 0;
		while(q.isEmpty() == false)
		{
			int count = q.size();
			res = Math.max(res,count);
			for(int i=0;i<count;i++)
			{
				Node curr = q.poll();
				//System.out.print(curr.data+" ");
				
				if(curr.left != null)
					q.add(curr.left);
				if(curr.right != null)
					q.add(curr.right);
			}
		}
		
		return res;
	}
		
	
	
	public static void main(String args[])
	{
		
		Node root = new Node(20);
		
		root.left = new Node(8);
		
		root.left.left = new Node(3);
		
		root.left.right = new Node(5);
		
		root.right = new Node(12);
		
		
		System.out.print(maxWidth(root));
	}
}
		