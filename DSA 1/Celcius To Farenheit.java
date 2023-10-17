import java.util.*;

//https://course.acciojob.com/idle?question=0093b914-77cf-41b4-b792-63cc8388aafb

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tempInCelsius = sc.nextInt();

        //Write your code here and print the required output
		double Fahrenheit = (tempInCelsius*1.8)+32;
		int result = (int)Fahrenheit;
		System.out.println(result);
    }
}
