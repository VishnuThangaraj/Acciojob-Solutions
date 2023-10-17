// https://course.acciojob.com/idle?question=d15f5722-60c3-4b38-9dd5-29752a7c3876

import java.util.*;

class Accio{
    static long ReverseNumber(long N){
        long reverse = 0;

		while(N > 0){
			reverse = (reverse*10) + N%10;
			N /= 10;
		}

		return reverse;
    }
}

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        Accio obj = new Accio();
        long ans = obj.ReverseNumber(N);
        System.out.println(ans);
    }
}
