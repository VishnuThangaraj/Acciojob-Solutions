// https://course.acciojob.com/idle?question=dff4e0d8-ac02-4e27-8f31-ed1e99fb8c1b

import java.io.*;
import java.util.*;

class Solution {
    public int StockAnalysis(int[] arr, int k) {
		PriorityQueue<Integer> storage = new PriorityQueue<>((a,b) -> a-b);

        for(int num : arr){
            storage.offer(num);
            if(storage.size() > k) storage.poll();
        }

        return storage.peek();
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
        System.out.print(Obj.StockAnalysis(arr,k));
    }
}
