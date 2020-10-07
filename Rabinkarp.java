

class Rabinkarp{

	public final static int d = 256;
	public static void algo(String txt,String pat,int q)
	{
		int n = txt.length();
		int m = pat.length();
		int h=1;
		int i,j;
		for(i=0;i<=m-1;i++)
		{
			h = (h*d)%q;
		}
		
		int p=0;
		int t=0;
		
		for(i=0;i<m;i++)
		{
			p = (d*p + pat.charAt(i))%q;
			t = (d*t + txt.charAt(i))%q;
		}
		
		for(i=0;i<=n-m;i++)
		{
			if(p==t)
			{
			
				boolean flag = true;
				for( j=0;j<m;j++)
				{
					if(txt.charAt(i+j)!=pat.charAt(j))
					{
						flag = false;
						break;
					}
				}
				
				if(flag==true)
				{
					System.out.println(i);
				}
			}
			
			if(i<n-m)
			{
				t = ((d*(t - txt.charAt(i)*h)) + txt.charAt(i+m))%q;
				if(t<0)
				{
					t = t + q;
				}
			}
		}
	}
	
	public static void main(String args[])
	{
		String txt = "abdabcbabc";
		String pat = "abc";
		int q = 101;
		algo(txt,pat,q);
	}
}