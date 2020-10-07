
import java.util.*;

class PairSum
{
	public static boolean check(int a[],int n,int sum)
	{
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		
		for(int i=0;i<n;i++)
		{
			int x = sum - a[i];
			if(hm.containsKey(x))
			{
				return true;
			}
			else{
				hm.put(a[i],i);
			}
		}
		return false;
	}
	
	public static void main(String args[])
	{
		int a[] = {11,5,6};
		int n = a.length;
		int sum = 10;
		
				if(check(a,n,sum)==true)
				{
					System.out.print("Yes");
				
				}
				else
					System.out.print("No");
	
			
	}
}
				