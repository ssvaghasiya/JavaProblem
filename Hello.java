
import java.io.*;
import java.lang.String.*;


class Hello{
	
	public static boolean isAnagram(String txt,String pat)
	{
		int n = txt.length();
		int m = pat.length();
		int count[] = new int[256];
		for(int i=0;i<n;i++)
		{
			count[txt.charAt(i)]++;
		}
		
		for(int i=0;i<m;i++)
		{
			int k = pat.charAt(i);
			if(--count[k]<0)
			{
				return false;
			}
		}
		
		return true;
			
	}
	
	public static boolean algo(String txt,String pat)
	{
		int n = txt.length();
		int m = pat.length();
				for(int i=0;i<(n-m);i++)
				{
					if(isAnagram(txt.substring(i,(m+i)),pat))
					{
						return true;
					}
				}
				
		return false;
	}
	
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		
		while(t-->0)
		{
			String txt = br.readLine().trim();
			String pat = br.readLine().trim();
			System.out.println(algo(txt,pat));
		}
	}
}