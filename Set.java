
import java.util.*;
import java.lang.*;

class Set
{
	static int countSet(String s,int n,int m)
	{
		int res = 0;
		
		for(int i=0;i<m;i++)
		{
			for(int j=i+1;j<m+1;j++)
			{
				try{
					int k = Integer.parseInt(s.substring(i,j));
					System.out.print(k+" ");
					if(k<=n)
					{
						res++;
					}
				}catch(NumberFormatException e)
				{
					System.out.println(e);
				}
			}
		}
			
			
			
				
			
			return res;
	}
			
	
	public static void main(String args[])
	{
		String s = "1234";
		int n = 30;
		int m = s.length();
		System.out.println(countSet(s,n,m));
	}
}