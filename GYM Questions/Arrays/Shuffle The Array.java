import java.util.*;

// https://course.acciojob.com/idle?question=aedb081d-21d9-471b-8967-2c7d25af0f34

class Solution {
    public void ShuffleArray(int[] arr, int n) {
        // two pointers
		int first = 0, second = n;

		while(first < n && n < arr.length){
			System.out.print(arr[first++]+" "+arr[second++]+" ");
		}
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[2*n];
        for(int i = 0; i < 2*n; i++)
            arr[i] = sc.nextInt();
	    Solution Obj = new Solution();
        Obj.ShuffleArray(arr, n);
    }
}
