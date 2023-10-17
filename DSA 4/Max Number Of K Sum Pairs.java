import java.util.*;

// https://course.acciojob.com/idle?question=b159eb89-5c05-4e0a-a749-49c234e5ed98

class Solution {
    public int maxOperations(int[] nums, int k) {
		Arrays.sort(nums);
        int first = 0, second = nums.length -1;
		int result = 0; // count of possible pairs

		while(first < second){
			int total = nums[first] + nums[second];
			if(total == k){ // pair found
				result++;
				first++;second--;
			}
			else if(total < k) // increase the value
				first++;
			else //decrease the value
				second--;
		}
		return result;
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
        int k;
        k = sc.nextInt();
        Solution Obj = new Solution();
        int result = Obj.maxOperations(arr, k);
        System.out.println(result);
        sc.close();
    }
}
