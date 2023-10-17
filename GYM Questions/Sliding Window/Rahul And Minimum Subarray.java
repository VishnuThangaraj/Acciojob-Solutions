import java.util.*;

// https://course.acciojob.com/idle?question=edd1121c-c07c-41db-b1d1-685dd1ed160e

class Solution {
    
    public static void minSubArrayLen(int arr[], int target, int n) {
        // two pointers
		int first = 0, second = 0, sum = 0, result = n;

		while(first < n){
			if(second < n && sum < target){
				sum += arr[second++];
			}else{
				sum -= arr[first++];
			}
			// update result
			if (sum > target)
				result = Math.min(result, (second - first));
		}

		// no subarray found with the sum greater than target
		if(result == n) 
			System.out.println(0);
		else
			System.out.println(result);
    }
}

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        Solution.minSubArrayLen(arr,target,n);
        
    }
}
