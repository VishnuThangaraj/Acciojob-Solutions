import java.io.*;
import java.util.*;

// https://course.acciojob.com/idle?question=864309e9-49cf-4bd9-b2a5-1fa5989e3cf9

class Solution {
    public int findElement(int[] arr, int n) {
        // find the left-max first
		int[]leftMax = new int[n];

		leftMax[0] = Integer.MIN_VALUE;

		for(int i=1;i<n;i++)
			leftMax[i] = Math.max(leftMax[i-1], arr[i-1]);

		int rightMin = Integer.MAX_VALUE;

		//traverse backwards in Array
		for(int i=n-1;i>=0;i--){
			// greater than leftMax and smaller than right min
			if(arr[i] > leftMax[i] && arr[i] < rightMin){
				return i; //hinged index found
			}
			rightMin = Math.min(rightMin, arr[i]);
		}

		return -1; //no-hinged element found
    }
}

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}

        Solution Obj = new Solution(); 
		System.out.println(Obj.findElement(nums, n));
	}
}
