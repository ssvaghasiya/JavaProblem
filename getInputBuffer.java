import java.util.*;
import java.lang.*;
import java.io.*;

class getInputBuffer
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine().trim());
		int arr[] = new int[n];
		String a[] = br.readLine().split(" ");
		
		for(int i=0;i<n;i++)
		{
			arr[i] = Integer.parseInt(a[i]);
		}
		
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		
	}
}


/*
above code is fetch input niche jevu

5
1 -2 4 -5 1

*/