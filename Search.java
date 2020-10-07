
class Search{

	 public static int algo(int[] nums, int target) {
        
		int a = search(nums,target);
		
		if(nums[a]==target || a==0)
		{
			return a;
		}
		else{
			return a+1;
		}
      
    }
	
	public static int search(int []nums,int target)
	{
		  int l = 0;
        int h = nums.length-1;
        int count =0;
        while(l<=h)
        {
            int mid = (l+h)/2;
            
            if(nums[mid]<=target)
            {
                count = mid;
                l = mid+1;
            }
            else
            {
				
                h = mid-1;
            }
        }
        
        return count;
	}
	

	public static void main(String args[])
	{
		int a[] = {1,3,5,6};
		int t = 4;
		
		System.out.println(algo(a,t));
	}
}