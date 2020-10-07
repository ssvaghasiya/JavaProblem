
import java.util.*;

class Find{
	
	static int algo(int a[])
	{
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=i+1)
			{
				return i+1;
			}
		}
		return a.length+1;
	}
	
	public static void main(String args[])
	{
		int a[] = {6,3,2,4,5};
		
		System.out.print(algo(a));
	}
}