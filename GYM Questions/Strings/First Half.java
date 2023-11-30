// https://course.acciojob.com/idle?question=31743f1c-2778-4619-9d8d-771936b6ff90

import java.util.*;

class Solution {
    public String firstHalf(String str) {
        return str.substring(0,str.length()/2);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        Solution Obj = new Solution();
        scn.close();
        System.out.print(Obj.firstHalf(str));
    }
}
