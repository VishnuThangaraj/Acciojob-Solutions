import java.util.*;

// https://course.acciojob.com/idle?question=b13fd5f5-82f1-4d2a-af77-e96cbaa9c329

class Solution {
    public static int minDifference(int[] arr, int key) {
        // Perform binary Search
        int result = -1;

        int start = 0, end = arr.length-1;

        while(start <= end){
            int mid = start + (end-start)/2;

            if(Math.abs(result-key) > Math.abs(key-arr[mid])){
                // update result
                result = arr[mid];
            }
            if(arr[mid] > key){end = mid-1;}
            else{ start = mid+1;}
        }
        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        int n = input.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = input.nextInt();
        }
        Solution obj= new Solution();
        System.out.println(obj.minDifference(a,k));
    }
}
