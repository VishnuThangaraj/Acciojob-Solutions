import java.io.*;
import java.util.*;

// https://course.acciojob.com/idle?question=76b8307d-355f-4602-9556-bbda20b47fc7

public class Main {
	// function to find the first and last occurance with binary search
	public static int findTarget(int[]sorted, int start, int end, int target, boolean isFirst){
		if(start > end) return -1;// target not found

		int mid = start + (end - start) / 2;

		// potential answer found
		if(sorted[mid] == target){ 
			if(isFirst)
				if(mid == 0 || sorted[mid-1] != target)
					return mid; // first occurance found
				else
					// search left range
					return findTarget(sorted, start, mid-1, target, isFirst);
			else
				if(mid == sorted.length-1 || sorted[mid+1] != target)
					return mid; // last occurance found
				else
					// search right range
					return findTarget(sorted, mid+1, end, target, isFirst);
		}

		if(target < sorted[mid]) 
			// search left range
			return findTarget(sorted, start, mid-1, target, isFirst);

		// search right range
		return findTarget(sorted, mid+1, end, target, isFirst);
	}
	public static void main(String args[]) {
		Scanner read = new Scanner(System.in);

		// get the inputs
		int size = read.nextInt();
		int[] sorted = new int[size];
		for(int index=0; index<size; index++){
			sorted[index] = read.nextInt();
		}
		int target = read.nextInt();
		read.close();

		// find the occurance
		int[] result = new int[2];
		result[0]= findTarget(sorted, 0, size-1, target, true);
		result[1]= findTarget(sorted, 0, size-1, target, false);

		// print the result
		for(int num : result)
			System.out.print(num+" ");
	}
}
