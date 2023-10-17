import java.util.*;

// https://course.acciojob.com/idle?question=78adbda5-bbd0-4246-b173-5301ca6a0ac0

class Solution {
    public int longestSubstring(String s) {
		//to store only unique characters
        HashSet<Character> unique = new HashSet<>();

		int first = 0;
		int second = 0;
		int max = 0;

		while(first < s.length()){
			if(second < s.length() && !unique.contains(s.charAt(second))){
				unique.add(s.charAt(second));
				//update max size
				max = Math.max(max, (second - first) +1);
				second++;
			}else{
				unique.remove(s.charAt(first));
				first++;
			}
		}

		return max;
    }
}

public class Main {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();
        Solution ob = new Solution();
        int ans=ob.longestSubstring(s);
        System.out.println(ans);
    }
}
