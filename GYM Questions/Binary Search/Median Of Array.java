// https://course.acciojob.com/idle?question=6918f4a8-a275-4e29-8918-fcfce6f50a6b

import java.util.*;
import java.lang.*;
import java.io.*;

class Solution{
      static double median(int[] A, int[] B)
    {
		int num1 = A.length, num2 = B.length;
        // apply binary search on smaller array for better time complexity
        if(num1 > num2) 
            return median(B, A);

        int low = 0, high = num1, left = (num1 + num2 + 1) / 2;
        boolean oddSizeArray = ((num1+num2) % 2 != 0) ? true : false;

        while(low <= high){
            int mid1 = (low+high) / 2, mid2 = left - mid1;

            // left and right pointers
            int left1 = (mid1 > 0) ? A[mid1-1] : Integer.MIN_VALUE;
            int left2 = (mid2 > 0) ? B[mid2-1] : Integer.MIN_VALUE;
            int right1 = (mid1 < num1) ? A[mid1] : Integer.MAX_VALUE;
            int right2 = (mid2 < num2) ? B[mid2] : Integer.MAX_VALUE;

            if(left1 <= right2 && left2 <= right1){
                if(oddSizeArray)
                    return Math.max(left1, left2)*1.0;
                return (Math.max(left1, left2) + Math.min(right1, right2)) / 2.0;
            }
            else if(left1 > right2){
                high = mid1 - 1;
            }
            else{
                low = mid1 + 1;
            }
        }

        return 1.0; // Dummy Return
    }
}
class Main {

  public static void main (String[] args)
	{
    Scanner sc = new Scanner(System.in);
	    
	  int m = sc.nextInt();
    int n = sc.nextInt();
    int[] A = new int[m];
	  for(int i=0;i<m;i++){
      A[i] = sc.nextInt();
		}
	  int[] B = new int[n];
	  for(int i=0;i<n;i++){
      B[i] = sc.nextInt();
		}
    System.out.format("%.2f", Solution.median(A,B));

	}
}
