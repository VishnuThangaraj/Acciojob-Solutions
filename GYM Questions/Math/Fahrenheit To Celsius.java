// https://course.acciojob.com/idle?question=d01aace5-7c70-4ee7-8a85-446901113bca

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tempInFahr = sc.nextInt();

        //Write your code here and print the required output
        int result = (tempInFahr-32) * 5/9;
		System.out.println(result);

    }
}
