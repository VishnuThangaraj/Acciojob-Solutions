import java.util.*;

//https://course.acciojob.com/idle?question=00d3fed6-2099-4e58-8c0a-e5473c3d6e92

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        sc.close();

		long LHS = (a+b)*(a+b)*(a+b);
		long RHS = (a*a*a) + (b*b*b) + (3*(a*a)*b) + (3*a)*(b*b);

		System.out.println(LHS);
		System.out.println(RHS);

		if(LHS == RHS){
			System.out.println("VERIFIED");
		}else{
			System.out.println("NOT VERIFIED");
		}
    }
}
