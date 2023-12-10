// https://course.acciojob.com/idle?question=7bc8d9bb-d312-41f5-99dd-5ae29e8c5f72

import java.util.*;

class Solution {
    public int maxArea(int[] heights) {
        int left = 0, right = heights.length-1;
        int maxArea = 0;

        while(left < right){
            int currentArea = Math.min(heights[left], heights[right]) * (right - left);
            maxArea = Math.max(maxArea, currentArea); // update maxArea

            //Update Pointers
            if(heights[left] < heights[right]) left++;
            else right--;
        }

        return maxArea;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Solution Obj = new Solution();
        int result = Obj.maxArea(arr);
        System.out.println(result);
        sc.close();
    }
}
