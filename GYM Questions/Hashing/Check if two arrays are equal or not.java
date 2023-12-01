// https://course.acciojob.com/idle?question=66be1083-c1af-44eb-85ae-5214429f5007

import java.io.*;
import java.util.*;


class Solution{
    public static boolean equalArray(int a[], int b [], int n){
        HashMap<Integer,Integer> storage = new HashMap<>();
        // Add to HashMap
        for(int num : a)
            storage.put(num, storage.getOrDefault(num, 0)+1);

        // Validate second array
        for(int num : b){
            if(storage.containsKey(num)){
                storage.put(num, storage.get(num)-1);
            }else
                return false; // Not equal
        }

        // Check the Hashmap for missing nums
        for(int key : storage.keySet()){
            if(storage.get(key) != 0)
                return false;
        }

        return true;
    }
}
public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for(int i = 0; i < n; i++){
            a[i] = input.nextInt();
        }
        for(int i = 0; i < n; i++){
            b[i] = input.nextInt();
        }
        Solution obj = new Solution();
        System.out.println(obj.equalArray(a,b,n));
    }
}
