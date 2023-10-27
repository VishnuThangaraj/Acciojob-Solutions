// https://course.acciojob.com/idle?question=956f9a39-b446-4253-8df9-ff673dadc1ed

import java.io.*;
import java.util.*;
public class Main {
    
    public static int getPairsCount(int[] arr, int n, int sum){
		int count  = 0;
	    HashMap<Integer, Integer> storage = new HashMap<>();

		for(int num : arr){
			if(storage.containsKey(sum-num))
				count += storage.get(sum-num);

			storage.put(num, storage.getOrDefault(num,0)+1);
		}
		return count;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(getPairsCount(arr,n, sum));
    }
}
