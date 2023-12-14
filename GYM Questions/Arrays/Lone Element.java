// https://course.acciojob.com/idle?question=305101b2-ef3c-4980-a682-41f985957688

import java.util.*;

public class Main 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0) 
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0;i < n;i++)
            {
                arr[i] = sc.nextInt();
            }
            
            Solution sol = new Solution();
            System.out.println(sol.findOnce(arr, n));
        }
        sc.close();
    }
}

class Solution
{
    int findOnce(int arr[], int n){
        int result = 0;

        for(int num : arr) result ^= num;

        return result;
    }
}
