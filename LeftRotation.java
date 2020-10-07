
import java.util.*;

class LeftRotation{
	
	
	 public static void algo(int a[],int n,int d)
    {
        int arr[] = new int[d];
        for(int i=0;i<d;i++)
        {
            arr[i] = a[i];
        }

        for(int i=d;i<n;i++)
        {
            a[i-d] = a[i];
        }
		int k=0;
        for(int i=(n-d);i<n;i++)
        {
            a[i] = arr[k];
			k++;
        }

        System.out.println(Arrays.toString(a));

		

    }    
	
	public static void main(String args[])
	{
		int a[] = {1,2,3,4,5};
		int n = a.length;
		int d = 4;
		
		algo(a,n,d);
	}
}