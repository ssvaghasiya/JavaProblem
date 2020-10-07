import java.util.*;
import java.io.*;

class StockSpan
{
	public static void main(String args[])
	{
		int []arr = {15,13,12,14,16,8,6,4,10,30};
		
		int n = arr.length;
		
		Stack<Integer> s = new Stack<Integer>();
		
		s.push(0);
		System.out.print(1+" ");
		for(int i=1;i<arr.length;i++)
		{
			while(s.empty() == false && arr[s.peek()]<=arr[i])
			{
				s.pop();
			}
			int a = (s.empty())?(i+1):i-s.peek();
			System.out.print(a+" ");
			s.push(i);
		}
	}
}
