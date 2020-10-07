
import java.util.*;

class LongestSubArray
{
	public static void main(String args[])
	{
		int a[] = {8,3,7};
		int sum = 15;
		int res = 0;
		int n = a.length;
		for(int i = 0;i<n;i++)
		{
			int curr_sum = 0;
			for(int j=i;j<n;j++)
			{
				curr_sum = curr_sum + a[j];
				if(curr_sum == sum)
					res = Math.max(res,j-i+1);
			}
		}
		System.out.print(res);
	}
}