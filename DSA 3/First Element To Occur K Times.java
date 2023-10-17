import java.io.*;
import java.util.*;

//https://course.acciojob.com/idle?question=cfcb12b8-f817-4be3-8420-48ea92ed19bc

class Solution {
    public void firstElementToOccurKTimes(int[] nums, int n, int k) {
		//create hashMap to store the value and occurance
        HashMap <Integer, Integer> storage = new HashMap<>();

		if (k==1) { //only one element in array
			System.out.println(nums[0]);
			return;
		}

		//traverse through the array
		for (int index = 0; index<n; index++) {

			//if already exists get its frequence
			int existingFreq = storage.getOrDefault(nums[index], 0);
			//increase frequency
			storage.put(nums[index], existingFreq + 1);

			if(storage.get(nums[index]) == k) { 
				//first element with k occurance
				System.out.println(nums[index]);
				return;
			}
		}
		//no element with k frequency found
		System.out.println(-1);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,k;
        n=sc.nextInt();
        k=sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        Solution Obj = new Solution();
        Obj.firstElementToOccurKTimes(nums,n,k);  
        System.out.println();
    }
}
