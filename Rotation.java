


class Rotation
{

	public static void algo(String s,String s1)
	{
	/*	if(s.length()!=s1.length())
		{
			return false;
		}
		
		s = s+s;
		
		return s.indexOf(s1)>=0;
		*/
		
	
		
		int n = s1.length();
		int m = s.length();
		
		for(int i=0;i<=(m-n);i++)
		{
			String sub = s.substring(i,(n+i));
			if(sub.equals(s1))
			{
				System.out.println(i);
			}
		}
		
	      
		
	}		
	
	public static void main(String args[])
	{
		String s = "ABABAB";
		String s1 = "ABAB";
		int n = s.length();
		int m = s1.length();
		
		algo(s,s1);
	}
}
	