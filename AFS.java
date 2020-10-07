
import java.io.*;

class AFS{

	public static int algo(int n)
	{
		int res = 0;
		for(int i=1;i<n;i++)
		{
			if(i<n && n%i==0)
			{
				res = res + i;
			}
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