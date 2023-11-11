// https://course.acciojob.com/idle?question=e184c5fc-791e-49f6-b556-3b7df3044995

import java.util.*;

class Solution{
    int minOfThree(int a,int b,int c){
        int result = Math.min(a,b);
        return Math.min(result,c);
    }
}

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            Solution Obj = new Solution();
            System.out.println(Obj.minOfThree(a,b,c));
        }
    }
}
