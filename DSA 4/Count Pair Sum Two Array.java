import java.io.*;
import java.util.*;

// https://course.acciojob.com/idle?question=6724980a-4f60-46df-acc1-7f0144f12959

class Main {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = input.nextInt();
        int arr1[] = new int[m];
        int arr2[] = new int[n];
        for (int i = 0; i < m; i++) {
            arr1[i] = input.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = input.nextInt();
        }
        int x = input.nextInt();
        Solution obj = new Solution();
        System.out.println(obj.countElements(arr1, arr2, m, n, x));
    }
}

class Solution {
    public int countElements(int[] arr1, int[] arr2, int m, int n, int x) {
		//start points beginning of first array
		int start = 0;
		//end points end of second array
		int end = n-1;

		int count = 0; 

		while(start < arr1.length && end>=0){
			int total = arr1[start] + arr2[end];
			if(total == x){ //pair found
				count++;start++;end--;
			}else if(x > total){ //target is bigger
				start++;
			}else{ // target is smaller than total
				end--;
			}
		}
		return count;
    }
}
