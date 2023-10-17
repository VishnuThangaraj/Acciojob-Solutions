import java.io.*;
import java.util.*;

// https://course.acciojob.com/idle?question=ce24f7d7-99ed-4c35-bde3-7b3637a5f639

class Solution{
    public static void printAbbv(String s){
        int size = s.length(); 

		if(size <= 10) {
			System.out.println(s);
			return;
		}
		System.out.println(s.charAt(0)+""+(size-2)+""+s.charAt(size-1));
    }
}

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        Solution.printAbbv(s);
    }
}
