import java.util.*;

// https://course.acciojob.com/idle?question=c4eb459b-ea8e-4c06-a898-5d87646be90e

class Solution {
    public int pivotIndex(int[] nums) {
        int rightSum = 0;

		// add elements in array to rightsum
		for(int element : nums) rightSum+=element;

		// find the pivot
		int leftSum = 0;
		for(int index=0; index<nums.length; index++){
			rightSum-= nums[index];
			//left and right sum is equal
			if(leftSum == rightSum){
				return index;
			}
			leftSum+=nums[index];
		}

		return -1; //no pivot found
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Solution Obj = new Solution();
        int result = Obj.pivotIndex(arr);
        System.out.println(result);
        sc.close();
    }
}
