import java.util.*;

// https://course.acciojob.com/idle?question=ff2bc0d6-e2d3-40ae-99b0-a585940c872b

public class Main {
	static int sumOfDigi(int n) {
        if(n == 0){
			return 0;
		}

		return n%10 + sumOfDigi(n/=10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int result = sumOfDigi(n);
        System.out.println(result);
        sc.close();
    }
}
