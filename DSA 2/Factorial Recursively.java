import java.util.*;

//https://course.acciojob.com/idle?question=f661b0e4-7bc4-469b-b148-8b77c9bca468

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial_recursive(n));
        sc.close();
    }

    public static long factorial_recursive(int n) {
        if(n==1){
			return 1; //base condition
		}
		long ans = n*factorial_recursive(n-1);
		return ans;
    }
}
