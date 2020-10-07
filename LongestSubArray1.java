import java.util.*;

class LongestSubArray1
{
	public static void main(String args[])
	{
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		
		//int a[] = {8,3,1,5,-6,6,2,2};
		int a[] = {1,-1,1,1,1,-1,-1};
		int sum = 0;
		int res = 0;
		int n = a.length;
		int pre_sum = 0;
		for(int i = 0;i<n;i++)
		{
				pre_sum += a[i];
				
				if(pre_sum == sum)
				{
					res = i+1;
				}
				if(!hm.containsKey(pre_sum))
				{
					hm.put(pre_sum,i);
				}
				
				if(hm.containsKey(pre_sum-sum))
				{
					res = Math.max(res,i-hm.get(pre_sum-sum));
				}
		}
		System.out.print(res);
	}
}