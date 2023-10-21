import java.util.*;

// https://course.acciojob.com/idle?question=fa1fbbdc-5142-40df-875f-3865b4325dd1

class Solution {
       public static String hasUnique(String str) {
	       HashSet<Character> storage = new HashSet<>();

		   for(int index=0; index<str.length(); index++){
			   if(storage.contains(str.charAt(index))){
				   // duplicate value found
				   return "No";
			   }
			   storage.add(str.charAt(index));
		   }
        return "Yes";
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Solution Obj = new Solution();
        System.out.println(Obj.hasUnique(str));
    }
}
