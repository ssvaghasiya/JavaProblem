import java.util.*;
class PreviousGreater
{
	
	static int st[] = new int[6];
	static int top = -1;
	static int t = st.length;
	static int b[] = new int[6];
	static int m = b.length;
	
	public static void push(int x)
	{
		if(top==(t-1))
		{
			System.out.println("OverFlow");
		}
		else
		{
			top++;
			st[top] = x;
		}
	}
	
	public static int pop()
	{
		int x = 0;
		if(top==-1)
		{
			System.out.println("UnderFlow");
		}
		else{
			x = st[top];
			top--;
		}
		return x;
	}
	
	public static int peek()
	{
		return st[top];
	}
	
	public static void algo(int a[])
	{
		push(m-1);
		
		for(int j=m-2;j>0;j--)
		{
			
			int k = peek();
			if(a[k]>=a[j])
			{
				push(j);
			}
			else{
				int l = pop();
				b[l] = a[j];
				j++;
			}
		}
		for(int i=0;i<m;i++)
		{
			if(b[i]==0)
			{
				b[pop()] = a[0];
			}
		}
	}
		
	
	public static void main(String args[])
	{
		int a[] = {18,7,6,5,12,15};
		int n = a.length;
		algo(a);
		
		for(int i = 0;i<m;i++)
		{
			System.out.print(b[i]+" ");
		}
	}
}