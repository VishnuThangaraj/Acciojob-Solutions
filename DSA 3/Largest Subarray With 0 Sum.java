import java.util.HashMap;
import java.io.*;
import java.util.*;

// https://course.acciojob.com/idle?question=2ee2a709-fb2f-4acd-b328-a7a74a556edb

class Solution {
   public int maxLen(int arr[])
	{
		int max = 0; //maxlength
		int sum = 0; //sum of array

		//HashMap to store the sum and index
		HashMap<Integer,Integer> storage = new HashMap<>();

		//iterate the array
		for(int index=0; index<arr.length; index++){
			sum+=arr[index];
			if(storage.containsKey(sum)){
				int previous = storage.get(sum);
				max = Math.max(max, index-previous);
			}else{
				//add to hashMap
				storage.put(sum,index);
			}
		}

		if(sum == 0) return arr.length; 

		return max;
	}
}

class Main {
	
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++)
		{
			nums[i] = sc.nextInt();
		}
        Solution Obj = new Solution();
		System.out.println(Obj.maxLen(nums));
	}
}
