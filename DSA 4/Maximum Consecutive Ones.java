import java.io.*;
import java.util.*;

// https://course.acciojob.com/idle?question=79709734-b342-47e3-a9ea-6ae63b0692d7

class Solution{
     public static int maxConsecutiveOnes(int[] arr, int n) {
        int first = 0, second = 0;
		 int result = 0;

		 while(first < n){
			 if(second < n && arr[second]!=0){
				 // update result;
				 result = Math.max(result, (second - first)+1);
				 second++;
			 }else{
				 // move the pointers next to zero
				 first = second+1;
				 second = first;
			 }
		 }
		 return result;
	 }
}

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Solution obj = new Solution();
        System.out.println(obj.maxConsecutiveOnes(arr, n));
    }
}
