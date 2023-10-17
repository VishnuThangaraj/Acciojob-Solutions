import java.io.*;
import java.util.*;

//https://course.acciojob.com/idle?question=fc5f657f-bf71-49c6-890c-96a5835f684b

class Solution {
    public int peakIndexInMountainArray(int[] A) {
		//search recursively
       return binarySearch(A,0,A.length-1);
    }
	//recursive binary search
	public int binarySearch(int[]A, int start, int end){
		if(start > end){
			return -1; //base condition is not necessary
		}
		
		int mid = start + (end-start)/2;

		if(A[mid] > A[mid-1] && A[mid] > A[mid+1]){
			return mid; //element found return the index
		}

		if(A[mid] > A[mid-1]){ //search right region
			return binarySearch(A,mid+1,end);
		}
		
		return binarySearch(A,start,mid-1); //search left region	
	}
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr1[] = new int[n];
        for(int i=0;i<n;i++)
            arr1[i] = sc.nextInt();
        Solution Obj = new Solution();
        int result = Obj.peakIndexInMountainArray(arr1);
        System.out.print(result + " ");
        System.out.println('\n');
    }
}
