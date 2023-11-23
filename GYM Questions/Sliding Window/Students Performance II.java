// https://course.acciojob.com/idle?question=1dcbd139-1ad2-45ca-9705-5184b1a0b922

import java.io.*;
import java.util.*;

class Solution {
    public static int[] solve(int[] arr) {
        int size = arr.length;
        int[] result = new int[size];
        Stack<Integer> storage = new Stack<>();  // Store the index

        for(int index=0; index<size; index++){
            while(!storage.isEmpty() && arr[storage.peek()] <= arr[index])
                storage.pop();

            // update result
            if(storage.isEmpty())
                result[index] = -1;
            else
                result[index] = index - storage.peek();

            storage.push(index);
        }

        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr1[] = new int[n];
        for(int i=0;i<n;i++)
            arr1[i] = sc.nextInt();
        Solution Obj = new Solution();
        int[] result = Obj.solve(arr1);
        for (int i=0;i<result.length;i++){
            System.out.print(result[i] + " ");
        }
        System.out.println('\n');
    }
}
