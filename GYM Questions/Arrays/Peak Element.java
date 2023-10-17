import java.io.*;
import java.util.*;

// https://course.acciojob.com/idle?question=aa1abcd4-af6f-4c1f-be44-b9ee9178f028

class Solution {
    static int findPeak(int arr[], int n)
    {
		for(int index=0; index<arr.length; index++){
			if(index == 0){ // first num in array wont have left element
				if(arr[index] > arr[index+1])
					return index;
			}
			else if(index == n-1){ // last num in array wont have right element
				if(arr[index] > arr[index-1])
					return index;
			}
			else{
				if((arr[index] > arr[index-1]) && (arr[index] > arr[index+1]))
					return index;
			}
		}

		return -1; // peak index not found
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
        int result = Obj.findPeak(arr1, n);
        System.out.print(result);        
        System.out.println('\n');
    }
}
