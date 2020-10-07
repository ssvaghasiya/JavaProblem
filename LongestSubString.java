

class LongestSubString{

	public static int substr(String sub)
	{
		int count[] = new int[256];
		for(int i=0;i<sub.length();i++)
		{
			count[sub.charAt(i)]++;
		}
		
		for(int i=0;i<256;i++)
		{
			if(count[i]>1)
			{
				return 0;
			
			}
		}
		
		return sub.length();
			
	}
			

	public static void main(String args[])
	{
		String s = "abaacdbab";
		
		int n= s.length();
		int max = Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<=n;j++)
			{
				int m = substr(s.substring(i,j));
				max = Math.max(max,m);
				
			}
		}
		
		System.out.println(max);
	}
}