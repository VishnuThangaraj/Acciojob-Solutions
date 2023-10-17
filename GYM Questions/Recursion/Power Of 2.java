import java.util.*;

// https://course.acciojob.com/idle?question=6c89e821-0fac-4811-847e-05d0cd5b3733

class Solution{
	public static boolean isPowerOfTwo(int n) {
        int num = 1;

		while(num <= n){
			if(num == n) return true;
			num*=2;
		}

		/* SIMPLE APPROACH
		double x = Math.log(n) / Math.log(2);
        return x == Math.floor(x);
		*/
		return false;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(Solution.isPowerOfTwo(n));
    }
}
