import java.util.*;

// https://course.acciojob.com/idle?question=7e2f8ed3-69ab-4d0c-ad56-467a99335a5b

class Solution {
    public ArrayList<Integer> FindIndices(String a, String b) {
        ArrayList<Integer> result = new ArrayList<>();
		int aLength = a.length();
		int bLength = b.length();

		for(int start=0; start<aLength; start++){
			if(a.charAt(start) == b.charAt(0) && a.substring(start, aLength).startsWith(b)){ // substring found
				result.add(start+1);
				start += bLength;
			}	
		}

		if(result.size() == 0) result.add(-1);

		return result;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
	    Solution Obj = new Solution();
        ArrayList<Integer> ans = Obj.FindIndices(a, b);
        for(int x : ans)
            System.out.print(x + " ");
    }
}
