// https://course.acciojob.com/idle?question=254e749a-e849-4851-8086-587c3e683240

import java.util.*; 

class Solution {
    
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int num1 = nums1.length, num2 = nums2.length;
        // apply binary search on smaller array for better time complexity
        if(num1 > num2) 
            return findMedianSortedArrays(nums2, nums1);

        int low = 0, high = num1, left = (num1 + num2 + 1) / 2;
        boolean oddSizeArray = ((num1+num2) % 2 != 0) ? true : false;

        while(low <= high){
            int mid1 = (low+high) / 2, mid2 = left - mid1;

            // left and right pointers
            int left1 = (mid1 > 0) ? nums1[mid1-1] : Integer.MIN_VALUE;
            int left2 = (mid2 > 0) ? nums2[mid2-1] : Integer.MIN_VALUE;
            int right1 = (mid1 < num1) ? nums1[mid1] : Integer.MAX_VALUE;
            int right2 = (mid2 < num2) ? nums2[mid2] : Integer.MAX_VALUE;

            if(left1 <= right2 && left2 <= right1){
                if(oddSizeArray)
                    return Math.max(left1, left2)*1.0;
                return (Math.max(left1, left2) + Math.min(right1, right2)) / 2.0;
            }
            else if(left1 > right2){
                high = mid1 - 1;
            }
            else{
                low = mid1 + 1;
            }
        }

        return 1.0; // Dummy Return
    }
}


public class Main {
    public static void main(String args[]) {
         
         Scanner scn = new Scanner(System.in); 
         int n = scn.nextInt(); 
         int m = scn.nextInt(); 

         int[] nums1 = new int[n]; 
         int[] nums2 = new int[m];  

         for(int i=0; i<n ;i++){
             nums1[i] = scn.nextInt(); 
         } 

         for(int i=0; i<m ;i++){
             nums2[i] = scn.nextInt(); 
         } 
        
         Solution sol = new Solution(); 
         double ans = sol.findMedianSortedArrays(nums1 , nums2); 

         System.out.println(ans); 


    }
}
