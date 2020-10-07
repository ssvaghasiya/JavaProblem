/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class P{
	int x,j;
	P(int x,int j)
	{
		this.x=x;
		this.j=j;
	}
	
	public String toString()
	{
		return this.x+"-"+this.j;
	}
}

class msort implements Comparator<P>{

	@Override
	public int compare(P p1, P p2) {
		
		if(p1.j==p2.j)
		{
			return p1.x-p2.x;
		}
		return p1.j-p2.j;
		
	}
}

class GFG {
    
    public static void algo(int arr[],int n,int k)
    {
       

             
		HashMap<Integer,Integer> hash=new HashMap<>();
		
		for(int b:arr)
		{
			if(hash.containsKey(b))
			{
				hash.replace(b, hash.get(b)+1);
			}
			else {
				hash.put(b,1);
			}
			
		}
		
		P[] pair=new P[hash.size()];
		int i=0;
		for(int b:hash.keySet())
		{
			pair[i++]=new P(b,hash.get(b));
		}

		Arrays.sort(pair,new msort());

		i=hash.size()-1;
		
		StringBuffer sb=new StringBuffer();
		
		while(k-->0 )
		{
			sb.append(pair[i].x+" ");
			i--;
		}
		
		System.out.println(sb.toString());
		
}		
	



	public static void main (String[] args) throws Exception {
		//code
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0)
		{
		    int n = Integer.parseInt(br.readLine().trim());
		    String a[] = br.readLine().split(" ");
		    int k = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr[i] = Integer.parseInt(a[i].trim());
		    }
		    
		    
		    algo(arr,n,k);
		}
	}
}