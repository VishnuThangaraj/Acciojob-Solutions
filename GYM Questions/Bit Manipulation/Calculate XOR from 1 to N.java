// https://course.acciojob.com/idle?question=113761dd-4045-4b1f-bc92-5650cd4042b8

import java.util.*;

class Solution {
    public  static int computeXOR(int n)
    {
       int sum = 0;
        
       for(int i=1;i<=n;i++)
           sum = sum^i;

        return sum;
    }
    
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Solution.computeXOR(n));
    }
}

