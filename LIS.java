
class LIS
{
	public static int algo(int arr[],int n)
	{
		int lcs[] = new int[n];
		
		lcs[0]=1;
		
		for(int i=1;i<n;i++)
		{
			lcs[i]=1;
			for(int j=0;j<i;j++)
			{
				if(arr[j]<arr[i])
				{
					lcs[i] = Math.max(lcs[i],lcs[j]+1);
				}
			}
		}
		
		int res = lcs[0];
		for(int i=1;i<n;i++)
		{
			res = Math.max(res,lcs[i]);
		}
		
		return res;
	}
	
	public static void main(String ars[])
	{
		int arr[] = {10,5,18,7,2,9};
		
		System.out.print(algo(arr,arr.length));
	}
}