import java.io.*;
import java.util.*;

//https://course.acciojob.com/idle?question=40ad500f-e244-4123-96fa-fb6300ce8eac

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m;
        n = sc.nextInt();
        m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        Solution s = new Solution();
        System.out.println(s.rowWithMaximumOnes(arr,n,m));
        
    }
}

class Solution {
	//recursive binary search
	public static int binarySearch(int[][] arr, int row, int start, int end, int max, int resultRow){
		if(row >= arr.length){
			return resultRow; 
		}

		int mid = start + (end-start)/2;

		if(mid == 0 || arr[row][mid] > arr[row][mid-1]){
			if(arr[0].length-mid > max){
				max = arr[0].length-mid;
				resultRow = row;
			}
			return binarySearch(arr,row+1,0,arr[0].length-1,max,resultRow); //search in next row
		}

		if(arr[row][mid] == 1){
			return binarySearch(arr,row,start,mid-1,max,resultRow); //search left region
		}
		return binarySearch(arr,row,mid+1,end,max,resultRow); //search right region
	}
    public static int rowWithMaximumOnes(int arr[][], int n, int m) {
		//recursive 2D binary Search
		return binarySearch(arr,0,0,arr[0].length-1,-1,0);
    }
}
