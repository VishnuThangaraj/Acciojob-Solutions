import java.io.*;
import java.util.*;

// https://course.acciojob.com/idle?question=dfd243c0-23e1-4628-b227-5e38da625207

class Solution {
    public boolean arrayPairs(int[] arr, int k) {
		//array to store the mod of given elements in arr
        int[] storage = new int[k];

        //add elements to array
        for(int value : arr){
            value%=k; //get the mod 
            if(value < 0){
                value+=k;
            }
            storage[value]++;
        }

        if(storage[0] %2 != 0) return false; //zero should be an even frequency

        //check for valid pairs
        for(int i=1;i<=k/2; i++){
            if(storage[i] != storage[k-i]){
                return false; //no matching pairs found
            }
        }
        return true;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,k;
        n = sc.nextInt();
		k = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        Solution Obj = new Solution();
        if(Obj.arrayPairs(arr,k)){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
    }
}
