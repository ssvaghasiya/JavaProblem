
class RotatedSorted
{
	 
    public static int checkPivot(int arr[],int pivot)
    {
        int n = arr.length;
        int l =0;
        int h = n-1;
        
        while(h-l>0)
        {
           int mid = l + (h-l)/2;
            
            if(arr[mid] >= pivot)
            {
                l = mid;
            }
            else
            {
                h = mid - 1;
            }
        }
        
        if(arr[h] >= pivot)
        {
            return h;
        }
        else if(arr[l] >= pivot)
        {
            return l;
        }
        
        return -1;
        
    }
    
    public static int checkElement(int arr[],int k,int i,int j)
    {
        int n = arr.length;
        int l = i;
        int h = j;
        
        while(h>=l)
        {
            int mid = l + (h-l)/2;
            
            if(arr[mid] == k)
            {
                return mid;
            }
            if(arr[mid] < k)
            {
                l = mid+1;
                
            }
            else
            {
                h = mid-1;
                
            }
        }
        return -1;
    }
    
    public static int search(int[] nums, int target) {
        
        int n = nums.length;
       int indexOfP = checkPivot(nums,nums[0]); 
	   return indexOfP;
/*		
		if(nums[indexOfP] == target)
		{
			return indexOfP;
		}
      
        
        if(target >= nums[0] && target <= nums[indexOfP])
        {
            return checkElement(nums,target,0,indexOfP);
        }
		else{

            return checkElement(nums,target,indexOfP+1,n-1);
        
		}
	*/	
	
	
    }
	
	
	public static void main(String args[])
	{
		int arr[] = {5,6,7,8,9,10,1,2,3};
		int target = 2;
		
		System.out.println(search(arr,target));
	}
}