import java.util.*;

// https://course.acciojob.com/idle?question=f9f01de4-0294-49d9-b5fb-8bc59cf088ab

public class Main {
	static int count1(int n) {
        if(n == 0){
			return 0; // base condition
		}

		int one = (n%10 == 1) ? 1 : 0;

		return one + count1(n/=10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(count1(n));
        sc.close();
    }

    
}
