import java.io.*;
import java.util.*;

// https://course.acciojob.com/idle?question=72595616-7c8d-4378-ac4c-128c6aed1d8d

class Solution {
    static int findNumber(int arr[], int n, int k)
    {
		for(int i=0;i<n;i++){
			if(arr[i] == k){ //element found ... return the index+1
				return i+1; 
			}
		}
		return -1; // element not found in the array
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;++i){
            arr[i]=sc.nextInt();
        }
        Solution Obj = new Solution();
        int result = Obj.findNumber(arr, n, k);
        System.out.print(result);        
        System.out.println();
    }
}
