import java.util.*;

// https://course.acciojob.com/idle?question=05f7c96a-217f-4020-a369-35070a1890db

class Solution {
    static int miniNumSwaps(String brackets, int n) {
		int count = 0, open = 0, close = 0, extra = 0;

		for(int i=0; i<brackets.length(); i++){
			if(brackets.charAt(i) == ')'){
				close ++;
			}else{
				open ++;
				if(extra > 0)
					count += extra;
			}
			extra = close - open;
		}
		return count;
    }
}

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String brackets = sc.next();
        int ans = Solution.miniNumSwaps(brackets, n);
        System.out.println(ans);
    }
}
