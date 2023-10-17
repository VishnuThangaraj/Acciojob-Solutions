import java.io.*;
import java.util.*;

// https://course.acciojob.com/idle?question=f0d49daa-27f2-4be8-9571-65c7b029cdd9

class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), m = input.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = input.nextInt();
        }
        Solution s = new Solution();
        System.out.println(s.minChocolateDifference(a, n, m));
    }
}

class Solution {

    public static int minChocolateDifference(int a[], int n, int m){
		int result = Integer.MAX_VALUE;
        // sort the array
		Arrays.sort(a);

		// two pointers
		int start = 0, end = m-1;

		while(end < n){
			// update result
			result = Math.min(result, (a[end] - a[start]));
			start++;end++;
		}

		return result;
    }
}
