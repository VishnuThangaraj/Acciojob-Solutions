// https://course.acciojob.com/idle?question=9476f87e-82e7-41c2-a60a-5f28e1eaada2

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] inputLine;
        int n = Integer.parseInt(br.readLine().trim());
        int[] arr = new int[n];
        inputLine = br.readLine().trim().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(inputLine[i]);
        }

        int ans = new Solution().print2largest(arr, n);
        System.out.println(ans);
    
    }
}

class Solution {
    int print2largest(int arr[], int n) {
        int max1 = -1, max2 = -1;

        for(int num : arr){
            if(num > max1){
                max2 = max1;
                max1 = num;
            }else if(num > max2 && num != max1){
                max2 = num;
            }
        }

        return max2;
    }
}
