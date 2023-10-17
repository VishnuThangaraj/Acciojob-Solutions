// https://course.acciojob.com/idle?question=ea8f08aa-d041-4639-a8c6-d3235d8bd34f

import java.util.*;
import java.lang.*;
import java.io.*;

class Solution{
	// function to check if possible to make partition 
	public static boolean possible(int[]A, long max, int days){
		int count = 1; // count of partitions
		int sum = 0;
		
		for(int size : A){
			sum += size;
			if(sum > max){
				sum = size;
				count++;
			}
		}
		
		if(count > days) return false;
		return true;
	}
    public static long solve(int[] A, int B) {
		long result = 0;
		// perform binary search
		long start = 0, end = 0;
		// calculate end by adding all the num
		for(int num : A){
			// start will be max of Array
			start = Math.max(start, num);
			// end will be total sum of Array
			end += num;
		}

		if(B == 1) return end;

		while (start < end){
			long mid = start + (end - start) / 2;

			// check if possible to Ship in B days with (MID) capacity
			if(possible(A, mid, B)){
				result = mid;
				end = mid;
			}
			else
				start = mid+1;
		}
		return result;
    }
}

class Main {
        public static void main (String[] args){
                Scanner sc = new Scanner(System.in);
        	int n = sc.nextInt();
        	int[] A = new int[n];
        	for(int i=0;i<n;i++){
                        A[i] = sc.nextInt();
		}
                int B = sc.nextInt();
                System.out.println(Solution.solve(A,B));
	}
}
