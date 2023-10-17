import java.util.*;
import java.io.*;

// https://course.acciojob.com/idle?question=24317ca0-60e5-4823-9108-e0edfd4e3f08

class Solution
{
    public static int solve(int n,int m,int[]arr){
		//sort the array and perform binary search
		Arrays.sort(arr);
        int low = 1, high = arr[n-1]; 
		while(low < high){
			int mid = low + (high - low) / 2;
			if(isPossible(arr, mid, m)){
				high = mid;
			}else{
				low = mid+1;
			}
		}
		return low; // minimum possible penality
    }

	// function to check if possible to place with the penality
	public static boolean isPossible(int[]arr, int penality, int max){
		int count = 0;
		// traverse from back
		for(int i=arr.length-1; i>=0; i--){
			int num = arr[i];
			if(num <= penality) break;

			int operation = (num / penality) - 1; // operation needed to split the bag
			if(num%penality != 0) operation++; //extra operation needed for reminder

			count += operation;
		}
		return count <= max;
	}
}
public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), m = input.nextInt();
        int[] arr;
        arr= new int[n];
        for(int i = 0; i < n; i++)arr[i]=input.nextInt();
        System.out.println(Solution.solve(n,m,arr));
    }
}
