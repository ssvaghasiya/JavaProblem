import java.util.*;
import java.io.*;


class MyHash
{
	int BUCKET;
	LinkedList<Integer> table[];
	
	MyHash(int b)
	{
		BUCKET = b;
		table = LinkedList[BUCKET];
	}
	
	void insert(int key)
	{
			int i = hash(key);
			if(table[i] == null)
                    table[i] = new LinkedList<Integer>();
                            
			table[i].add(key);
	}
	
	void delete(int key)
	{
		int i = hash(key);
		table[i].remove(key);

	}
	
	boolean search(int key)
	{
		int i = hash(key);
		for(Integer x:table[i])
		{
			if(x==key)
			{
				return true;
			}
		}
		return false;
	}
	int hash(int key)
	{
		return key%BUCKET;
	}
}
public class Chaining
{
	public static void main(String args[])
	{
		MyHash h = new MyHash(7);
		h.insert(2);
		h.insert(4);
		h.insert(5);
		h.insert(14);
		System.out.print(h.search(5));
	}
}
		