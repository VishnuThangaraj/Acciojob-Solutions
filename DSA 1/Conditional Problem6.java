import java.util.*;

// https://course.acciojob.com/idle?question=f2a96172-f162-49c7-8ac9-f6f79a1c0fb5

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.close();

		if(n%2!=0 && m%2!=0){
			System.out.println("we are odd");
		}else{
			System.out.println("we are simple");
		}
    }
}
