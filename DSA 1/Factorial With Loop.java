import java.util.*;

// https://course.acciojob.com/idle?question=f36b8fd8-5f32-4cbb-ba1f-5848f0a35c48

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
		input.close();
		long result = 1;
		for(int i =1;i<=n;i++){
			result *= i;
		}
		System.out.println(result);
    }
}
