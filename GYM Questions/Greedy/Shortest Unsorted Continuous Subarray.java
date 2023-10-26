// https://course.acciojob.com/idle?question=fcd0d2c0-df0b-4c65-b6ff-7b59b98bd24d

import java.util.*;

class Solution {
    public int UnsortedSubarrayLength(int[] nums) {
        // Sort the Array
		int left= -1, right = -1, size = nums.length;

		// Starting-Point
		int mini = Integer.MAX_VALUE;
		for(int index=size-1; index>=0; index--){
			if(mini >= nums[index])
				mini = nums[index];
			else
				left = index;
		}

		// Ending-Point
		int maxi = Integer.MIN_VALUE;
		for(int index=0; index<size; index++){
			if(maxi <= nums[index])
				maxi = nums[index];
			else
				right = index;
		}

		return left == -1?0 : (right - left)+1;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        for(int i = 0; i < n; i++)
            ar[i] = sc.nextInt();

	    Solution Obj = new Solution();
        System.out.println(Obj.UnsortedSubarrayLength(ar));
    }
}
