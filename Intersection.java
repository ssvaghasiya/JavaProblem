
import java.util.*;

class Intersection
{
	public static void main(String args[])
	{
		int a[] = {10,10,10};
		int b[] = {10,10,10};
		int n =a.length;
		int m = b.length;
		HashSet<Integer> s1 = new HashSet<Integer>();
		HashSet<Integer> s2 = new HashSet<Integer>();
		
		for(int i=0;i<n;i++)
		{
			s1.add(a[i]);
		}
		for(int i=0;i<m;i++)
		{
			s2.add(b[i]);
		}
		
		
		int c = 0;
		for(Integer x:s1)
		{
			for(Integer y:s2)
			{
				if(x==y)
				{
					c++;
				}
			}
		}
		
		System.out.print(c);
	}
}