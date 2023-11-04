import java.util.Scanner;

// https://course.acciojob.com/idle?question=b9efd3ba-caf4-4a28-9d75-910f1f5cd76c

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Get the input
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.close();

        // Print the calculations
        System.out.println(num1 + num2); // Addition
        System.out.println(num1 - num2); // Subtraction
        System.out.println(num1 * num2); // Multiply
        System.out.println(num1 / num2); // Divide
    }
}
