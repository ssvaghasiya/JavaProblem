
class LCS
{
	public static int algo(String s1,String s2,int m,int n)
	{
		if(m==0 || n==0)
		{
			return 0;
		}
		
		if(s1.charAt(m-1) == s2.charAt(n-1))
		{
			return 1 + algo(s1,s2,m-1,n-1);
		}
		else{
			return Math.max(algo(s1,s2,m-1,n),algo(s1,s2,m,n-1));
		}
	}

		
	
	public static void main(String args[])
	{
		String s1 = "AXYZ";
		String s2 = "BAZ";
		
		System.out.print(algo(s1,s2,s1.length(),s2.length()));
	}
}