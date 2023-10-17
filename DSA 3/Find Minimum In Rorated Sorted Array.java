// Java program to find minimum element in a sorted and
// rotated array
import java.io.*;
import java.lang.*;
import java.util.*;

//https://course.acciojob.com/idle?question=629217db-7ed5-4c49-9aff-ed7ecbd251af

class Solution
{
	//recursive binary search
    static int findMin(int arr[], int low, int high){
        if(low > high){
			return -1; //this wont occur just for base case 
		}

		int mid = low + (high - low)/2;

		if(mid!=0 && arr[mid]<arr[mid-1]){
			return arr[mid]; //miminum number found
		}

		if(arr[high] < arr[mid]){ //search right region
			return findMin(arr,mid+1,high);
		}

		return findMin(arr,low,mid-1); //search left region
    }
}
class Main {
    
 
    // Driver Program
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++)
        arr[i] = sc.nextInt();
        System.out.println(Solution.findMin(arr, 0, n - 1));
    }
}
