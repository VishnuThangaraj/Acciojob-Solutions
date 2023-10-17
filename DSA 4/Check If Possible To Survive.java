import java.util.*;

// https://course.acciojob.com/idle?question=0bdb6c8d-4349-4212-8e66-0de363917396

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int d = sc.nextInt();
        boolean ans = Solution.isPossibleToSurvive(n, x, d);
        if(ans) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
class Solution {
    
    static boolean isPossibleToSurvive(int n, int x, int d )
    {
		// RETURN FALSE IF food bought for 6 days is less than consumed for 7days
		// or daily consume is more than daily purchase
         if ( ((n * 6) < (x * 7) && d > 6) || x > n)
            return false;
  
        else 
			 return true;
    }  
}
