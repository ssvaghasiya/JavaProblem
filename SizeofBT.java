

class Node{
	
	int data;
	Node left;
	Node right;
	
	Node(int d)
	{
		data = d;
	}
}


public class SizeofBT
{
	
	public static int getSize(Node root)
	{
		if(root == null)
			return 0;
		else
			return 1+getSize(root.left)+getSize(root.right);
	}
	
	public static void main(String args[])
	{
		
		Node root = new Node(10);
		
		root.left = new Node(30);
		
		root.left.left = new Node(90);
		
		root.right = new Node(40);
		
		root.right.right = new Node(100);
		
		root.right.right.left = new Node(60);
		
		System.out.println(getSize(root));
	}
}
		