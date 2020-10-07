import java.util.*;

class SumPair
{
	public static boolean check(int a[],int n,int sum)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(sum == (a[i]+a[j]))
				{
					return true;
				}
			}
		}
		return false;
	}
	public static void main(String args[])
	{
		int a[] = {2,4,6,1};
		int n = a.length;
		int sum = 11;
		
				if(check(a,n,sum)==true)
				{
					System.out.print("Yes");
				
				}
				else
					System.out.print("No");
	
			
	}
}
				
				