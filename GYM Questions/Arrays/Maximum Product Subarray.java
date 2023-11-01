import java.io.*;
import java.util.*;

// https://course.acciojob.com/idle?question=0c0dd3e1-62fc-40fd-9a25-7d1003c2720a

  public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            System.out.println(new Solution().maxProduct(arr, n));
        }
    }
}

class Solution {
    long maxProduct(int[] arr, int n) {
        long sum = 1;
		long result = 0;

        // Traverse array from left to right
		for(int index=0; index<arr.length; index++){
			sum *= arr[index];
            // Update result
            result = Math.max(result, sum);
            if(arr[index] == 0) sum = 1;
		}

        sum = 1;

        // Traverse array from right to left
        for(int index=n-1; index>=0; index--){
            sum *= arr[index];
            // Update result
            result = Math.max(result, sum);
            if(arr[index] == 0) sum = 1;
        }

		return result;
    }
}
