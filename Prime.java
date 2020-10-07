
class Prime{
	
	public static void main(String args[])
	{
		for(int i=2;i<10;i++)
		{
			int c = 1;
			for(int j=2;j<=i;j++)
			{
				if(i%j==0)
				{
					c++;
				}
			}
			if(c==2){
				System.out.println(i);
			}
		}
	}
}