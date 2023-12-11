// https://course.acciojob.com/idle?question=e5595611-2bcb-459f-9ef2-dc305341928c

import java.io.*;
import java.util.*;

class Solution{
    static int specialSum(ArrayList<Integer> arr, int n){
         //Write code here
        int sum = 0;
        for(int num : arr){
            sum += num;
            sum = (sum > 9) ? ((sum%10)+1) : sum;
        }
        return sum;
    }
}

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i++) {
            arr.add(sc.nextInt());
        }
        int ans = Solution.specialSum(arr,n);
        System.out.println(ans);
	}
}
