
class RevStr{
	
	public static void fun(String str)
	{
		String word[] = str.split(" ");
		int n = word.length;
		for(int i=0;i<n;i++)
		{
			System.out.print(word[i]+" ");
		}
		
		int l = 0;
		int h = n-1;
		
		while(l<h)
		{
			String temp = word[l];
			word[l] = word[h];
			word[h] = temp;
			l++;
			h--;
		}
		
		System.out.println(" ");
		for(int i=0;i<n;i++)
		{
			System.out.print(word[i]+" ");
		}
	}
		
	public static void main(String args[])
	{
		fun("Hello Friends How Are");
	}
}
