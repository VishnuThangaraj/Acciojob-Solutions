// https://course.acciojob.com/idle?question=4bc01cf7-15a3-4475-981b-82694af81140

import java.util.*;

class Solution{
    static int ASStringsProblem1(String str){
        // add the vowels in HashSet
		HashSet<Character> storage = new HashSet<>();
		//add vowels
		storage.add('a');storage.add('e');storage.add('i');storage.add('o');storage.add('u');
		int count = 0; // count of vowels

		for(int ind=0; ind<str.length(); ind++)
			if(storage.contains(str.charAt(ind)))
				count++;

		return count;
    }
}

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Solution obj = new Solution();
        int ans=obj.ASStringsProblem1(str);
        System.out.println(ans);
    }
}
