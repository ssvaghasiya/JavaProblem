

import java.io.*;

class LowestPrime{
	
	public static int algo(int n)
	{
		int p[] = new int[n+2];
		
		
		for(int i=2;i<=n;i++)
		{
			if(p[i]==0)
			{
				int j=1;
				while(i*j<=n)
				{
					if(p[i*j]==0){
					p[i*j]=i;
					j++;
					}
				}
			}
		}
		int res = 0;
		for(int i=2;i<=n;i++)
		{
			res = res + p[i];
		}
		
		return res;
		
	}
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0)
		{
			int n = Integer.parseInt(br.readLine().trim());
			
			System.out.println(algo(n));
		}
	}
}