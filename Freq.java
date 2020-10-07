
import java.util.*;

class Freq
{
	public static void main(String args[])
	{
		int arr[] = {10,12,10,15,10,20,12,12};
		int n = arr.length;
		
		HashSet<Integer> s = new HashSet<Integer>();
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		for(int i=0;i<n;i++)
		{
			
			if(hm.containsKey(arr[i])== true)
			{
				hm.put(arr[i],hm.get(arr[i])+1);
			
			}
			else
			{
				hm.put(arr[i],1);
			}
		}
		
		System.out.print(hm);

		
	}
}