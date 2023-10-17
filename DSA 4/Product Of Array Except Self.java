import java.util.*;
import java.lang.*;
import java.io.*;

// https://course.acciojob.com/idle?question=f2ca55fd-3a7f-4a15-8e96-fd47960a21c9

public class Main {
	  public static void main(String[] args) throws Throwable {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();

	        int nums[]=new int[n];
	        for(int i = 0; i < n; i++)
	        {
	            nums[i] = sc.nextInt();
	        }
	        Solution obj = new Solution();
	        long ans[] = obj.ProductOfArrayExceptSelf(n,nums);
	        for(int i=0; i<n ; i++){
	            System.out.print(ans[i] + " ");
	        }
	    }
}
class Solution{
	public long[] ProductOfArrayExceptSelf(int n, int[] a){
		long[] result = new long[n]; // to store the result
		// sum from left and sum from right
        long[] left = new long[n], right = new long[n];

		// left sum
		left[0] = a[0];
        for (int ind = 1; ind < n; ind++)
            left[ind] = left[ind - 1] * a[ind];

		// right sum
        right[n - 1] = a[n - 1];
        for (int ind = n - 2; ind >= 0; ind--)
            right[ind] = right[ind + 1] * a[ind];

		//calcualting result
        result[0] = right[1];
        result[n - 1] = left[n - 2];
        for (int ind = 1; ind < n - 1; ind++)
            result[ind] = left[ind - 1] * right[ind + 1];
		
        return result;
	}
}
