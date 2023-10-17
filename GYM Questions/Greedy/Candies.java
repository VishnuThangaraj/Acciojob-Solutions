import java.io.*;
import java.util.*;

// https://course.acciojob.com/idle?question=118d8a5b-ca39-4fa1-9447-b10d5970da5f

class Solution{
	public int minCandies(int a[]){
		int size = a.length;
		int[] left = new int[size];
		int[] right = new int[size];

		// calculate left
		left[0] = 1;
		for(int index=1; index<size; index++)
			// previous person has higher rating
			if(a[index] > a[index-1]) left[index] = left[index-1] + 1;
			else
				left[index] = 1;

		// calculate right
		right[size-1] = 1;
		for(int index=size-2; index>=0; index--)
			// next person has higher rating
			if(a[index] > a[index+1]) right[index] = right[index+1] + 1;
			else
				right[index] = 1;

		// calculate the total candy needed
		int candy = 0;
		for(int index=0; index< size; index++)
			candy += Math.max(left[index], right[index]);

		return candy;
	}
}

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = input.nextInt();
        }
            Solution Obj = new Solution();
        System.out.println(Obj.minCandies(a));
    }
}
