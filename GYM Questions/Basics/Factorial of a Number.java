// https://course.acciojob.com/idle?question=75a4dcae-e3fa-4ca9-a683-75383e56d452

import java.util.*;

class Solution {
    static long factorial(int n)
    {
        long sum = 1;

        while(n>0){
            sum *= n;
            n--;
        }

        return sum;
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        Solution Obj = new Solution();
        System.out.println(Obj.factorial(n));
    }
}
