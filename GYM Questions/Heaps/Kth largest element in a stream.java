// https://course.acciojob.com/idle?question=80a1c3f1-73bb-479d-94cf-9bfd69583788

import java.util.*;
import java.io.*;

public class Main {
    // function to find the kth largest element in array
    public static int[] kthLargest(int[]arr, int n, int k){
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for(int index=0; index<n; index++){

            if(heap.size() < k)
                heap.offer(arr[index]);
            else if(arr[index] > heap.peek()){
                heap.poll();
                heap.offer(arr[index]);
            }
                

            if(heap.size() < k) arr[index] = -1;
            else arr[index] = heap.peek();
        }

        return arr;
    }
    
    public static void main(String args[]) {
        Scanner read = new Scanner (System.in);
        int n = read.nextInt();
        int k = read.nextInt();
        int[] arr = new int[n];
        for(int index=0; index<n; index++)
            arr[index] = read.nextInt();

        int[] result = kthLargest(arr, n, k);

        // Print the Result
        for(int num : result)
            System.out.print(num+" ");

        System.out.println();
        read.close();
    }
}
