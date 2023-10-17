import java.util.*;

// https://course.acciojob.com/idle?question=e134e218-2ac2-48b1-84f4-be50093c5fe7

class Solution
{
	public static long countSubarrays(int[] nums, long k) {
		long sum =0, result =0;
		int second =0;

		for(int i=0; i<nums.length; i++){
			sum += nums[i]; //increase the sum
			while(sum * ( i - second + 1) >= k){ // not in range
				sum -= nums[second];
				second++;
			}
			// update result
			result += i - second + 1;
		}
		
		return result;
	}
}
 
public class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n, k;
        n = sc.nextInt();
        int arr1[] = new int[n];
        for(int i=0;i<n;i++)
            arr1[i] = sc.nextInt();
        k = sc.nextInt();
        System.out.println(Solution.countSubarrays(arr1,k));
    }
}
