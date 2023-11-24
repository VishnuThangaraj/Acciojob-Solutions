// https://course.acciojob.com/idle?question=5bed66aa-ef13-4671-8cc2-9206899c010c

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0){
            int n = input.nextInt();
            Solution s = new Solution();
            System.out.println(s.strangeString(n));
        }
    }
}

class Solution {
    static String strangeString(int n) {
       StringBuilder result = new StringBuilder();

        for(int loop=0; loop<n; loop++){
            // after z loop will be continues from a again
            int alphabet = loop % 26;
            
            if(loop%2==0) // append in the beginning
                result.insert(0,(char)('a'+alphabet));
            else // append in the end
                result.append((char)('a'+alphabet));
        }

        return result.toString();
    }
}
