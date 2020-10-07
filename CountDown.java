
import java.io.*;
 
class CountDown{

	public static int algo(int arr[],int n,int k)
	{
		int a[] = new int[k];
		int m = k;
		for(int i=0;i<k;i++)
		{
			a[i] = m--;
		}
		
		
		int count=0;
		for(int i=0;i<=n-k; )
		{
			int j;
			for(j=0;j<k;j++)
			{
				if(arr[i+j]!=a[j])
				{
					break;
				}
			}
			if(j==k)
				{
					count++;
				}
				if(j==0)
				{
					i++;
				}
				else{
					i=i+j;
				}
		}
		
	return count;

	}


		
		
	
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		int m=1;
		while(t-->0)
		{
			
			String a[] = br.readLine().split(" ");
			int n = Integer.parseInt(a[0]);
			int k = Integer.parseInt(a[1]);
			
			String s[] = br.readLine().split(" ");
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i] = Integer.parseInt(s[i]);
			}
			
			System.out.println("Case #"+(m++)+":"+" "+algo(arr,n,k));
			
		}
	}
}
