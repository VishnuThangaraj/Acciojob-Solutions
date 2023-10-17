import java.io.*;
import java.util.*;

// https://course.acciojob.com/idle?question=1a8e04d7-f665-46e5-ab81-59cdb1ceda32

class Solution {
    public static int longestUniqueSubsttr(String str)
    {
		int result = 0;
        int first = 0;
		int second = 0;
		HashSet<Character> storage = new HashSet<>(); // to store the characters

		while(first < str.length()){
			if(second < str.length() && !storage.contains(str.charAt(second))){
				storage.add(str.charAt(second++));
				// update result 
				result = Math.max(result, storage.size());
			}else{
				storage.remove(str.charAt(first++));
			}
		}

		return result;
    }
}

public class Main {
     public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Solution obj = new Solution();
        int len = obj.longestUniqueSubsttr(str);
        System.out.println(len);
    }
}

