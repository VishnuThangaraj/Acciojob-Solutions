import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// https://course.acciojob.com/idle?question=f0ade862-5ec2-4519-83ae-e8e12cb7bdfa

class Solution {
	public boolean splitOdd10(int[] nums) {
		int leftSum = 0, rightSum = 0;
		// calculate anything
		for(int num : nums) leftSum += num;

		for(int num : nums){
			leftSum -= num;
			rightSum += num;

			// check if possible to divide two group
			if((leftSum % 10 == 0 && rightSum % 2 == 1) || (leftSum % 2 == 1 && rightSum % 10 == 0)) 
				return true;
		}
		return false;
	}
}
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int arr[]=new int[N];
        for(int i = 0; i < N; i++)
        {
            arr[i] = sc.nextInt();
        }

        Solution obj=new Solution();

        if(obj.splitOdd10(arr))
         System.out.println("YES");
         else
         System.out.println("NO");
    }
}
