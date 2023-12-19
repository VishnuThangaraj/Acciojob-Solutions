// https://course.acciojob.com/idle?question=594214f2-4c7d-47fc-b738-d026b015c88d

import java.io.*;
import java.util.*;

class Solution {
    public int SpidermanInChina(int[] heights, int n, int dashes, int slings) {
		
        Queue<Integer> heap = new PriorityQueue<>();

        for(int index=1; index<n; ++index){
            int diff = heights[index] - heights[index-1];
            if(diff <= 0) continue;

            heap.offer(diff);

            if(heap.size() > slings)
                dashes -= heap.poll();
            if(dashes < 0) 
                return index-1;
        }
        return n-1;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		int dash = sc.nextInt();
        int sling = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        
        Solution Obj = new Solution();
        System.out.print(Obj.SpidermanInChina(arr,n,dash,sling));
    }
}
