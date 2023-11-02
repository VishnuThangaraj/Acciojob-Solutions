import java.util.*;

// https://course.acciojob.com/idle?question=92c993d1-2cc8-4178-aa32-6ef2a1159339

class Solution {
    public int MinOps(String a, String b) {
        // Check for the size of the two strings
        if(a.length() != b.length()) return -1;

        int[] storage = new int[256];

        for(int index=0; index<a.length(); index++){
            storage[a.charAt(index)]++;
            storage[b.charAt(index)]--;
        }

        // Check if all the places has zero
        for(int index=0; index<storage.length; index++){
            // Both strings does not have same set of characters
            if(storage[index] != 0) return -1;
        }

        int first = 0, second = 0, result = 0;

        while(first < a.length()){
            if(a.charAt(first) != b.charAt(second))
                result++;
            else
                second++;

            first++;
        }
        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next(), b = sc.next();
	Solution Obj = new Solution();
        System.out.println(Obj.MinOps(a, b));
    }
}
