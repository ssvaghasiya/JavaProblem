
import java.util.*;

class UnionSet
{
	public static void main(String args[])
	{
		int a[] = {15,20,5,15};
		int b[] = {15,15,20,10};
		int n = a.length;
		int m = b.length;
		HashSet<Integer> s1 = new HashSet<Integer>();
		HashSet<Integer> s2 = new HashSet<Integer>();
		
		for(int i=0;i<n;i++)
		{
			s1.add(a[i]);
		}
		
		for(int i=0;i<m;i++)
		{
			s1.add(b[i]);
		}
		
		
		
		System.out.print(s1);
	}
}
