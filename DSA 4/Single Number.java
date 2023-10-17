import java.util.*;

// https://course.acciojob.com/idle?question=63605eda-4a6b-438f-826d-9e8225d706c3

class Solution {
    public void singleElement(int[]A,int n) {
        int result = 0;

		// XOR OF ALL THE NUMBERS
		for(int num : A) result = result^num;

		System.out.println(result);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++)
                A[i] = sc.nextInt();
        Solution Obj = new Solution();
        Obj.singleElement(A,n);
        sc.close();
    }
}

