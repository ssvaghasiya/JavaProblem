
import java.util.*;

class Equal01
{
	public static void main(String args[])
	{
		int a[] = {0,0,0,0};
		int res =0;
		int n = a.length;
		for(int i=0;i<n;i++)
		{
			int curr_sum = 0;
			for(int j=i;j<n;j++)
			{
				if(a[j] == 1)
					curr_sum++;
				if(a[j] == 0)
					curr_sum--;
				
				if(curr_sum == 0)
					res = Math.max(res,j-i+1);
			}
		}
		System.out.print(res);
	}
}
