import java.util.Scanner;

//https://course.acciojob.com/idle?question=4ef7636c-31ab-4cb9-87a3-7733b034318b

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

		//run loop n number times
		for(int times = n; times>0; times--){
			for(int line=1;line<=times; line++){
				System.out.print("* ");
			}
			System.out.println();
		}
    }
}
