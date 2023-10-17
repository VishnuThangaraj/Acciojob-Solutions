import java.util.*;
import java.lang.*;
import java.io.*;

//https://course.acciojob.com/idle?question=9c215979-6be0-4055-8a42-9d20c4b90169

class Main {
  public static void main (String[] args)
	{
    Scanner sc = new Scanner(System.in);
	    
	  int N = sc.nextInt();
	  int[] A = new int[N];
	  for(int i=0;i<N;i++){
          A[i] = sc.nextInt();
      }
	  int B = sc.nextInt();
	  Solution ob = new Solution();
    System.out.println(ob.search(A,B));
		
	}
}

class Solution{
	//function for recursive binarysearch
	public int binarySearch(final int[] a, int target, int start, int end){
		//base condition
		if(start > end){
			return -1; //target not found
		}
		int mid = start + (end-start)/2;

		if(a[mid] == target){
			return mid; //target found
		}
		
		//check if the region is sorted
		if(a[start] <= a[mid]){
			if(a[start] <= target && a[mid] >= target){ //search left region
				return binarySearch(a,target,start,mid-1);
			}
			return binarySearch(a,target,mid+1, end); //search right region
		}

		//if the current region is un-sorted
		if(target >= a[mid] && target <= a[end]){
			return binarySearch(a,target,mid+1, end); //search right region
		}
		return binarySearch(a,target,start,mid-1); //search left region
	}
    public int search(final int[] a, int target) {
        //recursuve binary search
		return binarySearch(a,target,0,a.length-1);
    }
}
