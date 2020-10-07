
class Search1{
	
	public static int algo(int[] nums, int target) {
		int i;
		int n = nums.length;
		for( i=0;i<n;i++)
		{
			if(nums[i]>=target)
			{
				return i;
			}
		}
		
	
		return n;
		
	}
	
	public static void main(String args[])
	{
		int a[] = {2,5};
		int t = 1;
		
		System.out.println(algo(a,t));
	}
}