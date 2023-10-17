import java.util.*;
import java.io.*;

// https://course.acciojob.com/idle?question=a195081f-c4db-4d5f-9fc4-4ccdf4f7fec8

public class Main {
	static int pivotedBinarySearch(int arr[], int n, int key){
		int start = 0, end = n-1;

		while(start <= end){
			int mid = start + (end - start) /2;

			if(arr[mid] == key) return mid; // key found

			// check if the range is sorted
			if(arr[start] <= arr[mid])
				// find the key
				if(key < arr[mid] && key >= arr[start])
					// search left
					end = mid-1;
				else
					start = mid+1;
			// if the range is unsorted
			else if(key > arr[mid] && key < arr[end])
				// search right region
				start = mid+1;
			else
				end = mid-1;
		}

		return -1; // key not found
	}
    // main function
    public static void main(String args[])
    {
        // Let us search 3 in below array
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), key = sc.nextInt(), pivot ;
        int[] arr = new int[n];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(pivotedBinarySearch(arr, n, key));
    }
}
