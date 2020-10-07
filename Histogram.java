
import java.util.*;
import java.io.*;


class Histogram
{
		public static void algo(int arr[], int n)
		{
			Stack<Integer> s = new Stack<Integer>();
			
			int res = 0;
			int tp=0,curr=0;
			for(int i=0;i<n;i++)
			{
				while(s.empty() == false && arr[s.peek()]>=arr[i])
				{
					 tp = s.pop();
					 curr = arr[tp]*(s.empty()?i:(i-s.peek()-1));
					res = Math.max(res,curr);
				}
					
				s.push(i);
			}
			while(s.empty() == false)
			{
				 tp = s.pop();
				 curr = arr[tp]*(s.empty()?n:(n-s.peek()-1));
				res = Math.max(res,curr);
			}
			
			System.out.println(res);
		}
	
		public static void main(String args[])
		{
			int arr[] = {6,2,5,4,1,5,6};
			
			algo(arr,arr.length);
		}
}