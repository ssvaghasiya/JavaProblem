import java.util.*;

class RemoveDuplicates{
	
	 public static int algo(int[] nums) {
        int n = nums.length;
        int res = 0;
        
        for(int i=1;i<n;i++)
        {
            if(nums[res]!=nums[i])
            {
                res++;
                nums[res] = nums[i];
                
            }
        }
        System.out.print(Arrays.toString(nums));
        return res+1;
    }
	
	public static void main(String args[])
	{
		int a[] = {1,1,2};
		
		System.out.println(algo(a));
	}
}
