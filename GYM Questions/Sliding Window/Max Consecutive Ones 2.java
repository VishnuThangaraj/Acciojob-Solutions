import java.util.*;

// https://course.acciojob.com/idle?question=3605e680-e23b-4a26-aa72-35d2589b59a7

class Solution{
	public static int longestOnes(int[] A, int K) {
       // two pointers 
		int start = 0, end = 0, zero = 0, result = 0;

		while(start < A.length){
			if(end < A.length && zero <= K){
				// increase the count of zero if current is zero
				if(A[end++] == 0)
					zero++;
			}else{
				if(A[start++] == 0)
					zero--;
			}
			// update result
			if(zero <= K)
				result = Math.max(result, (end-start));
		}

		return result;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int k = scan.nextInt();
        scan.close();
        System.out.print(Solution.longestOnes(arr, k));
    }
}
