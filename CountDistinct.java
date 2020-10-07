import java.util.*;
import java.io.*;

class CountDistict
{
	public static void main(String args[])
	{
		HashSet<Integer> s = new HashSet<Integer>();
		
		int arr[] = {15,12,13,12,13,13,18};
		int n = arr.length;
		for(int i=0;i<n;i++)
		{
			s.add(arr[i]);
		}
		System.out.print(s.size());
	}
}
		