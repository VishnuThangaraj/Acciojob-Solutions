import java.util.*;

// https://course.acciojob.com/idle?question=c1448792-5b79-4cce-a2e0-5ff6d39c9844

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //Write your code here and print the required output
	    int nc = n;
		int sum = 0;
		int no = 0;
		while(nc>0){
			no = nc%10;
			sum = sum*10 + no;
			nc/=10;
		}
		if(n == sum){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
	}
}

