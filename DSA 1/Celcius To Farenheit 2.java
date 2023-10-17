import java.util.*;

//https://course.acciojob.com/idle?question=9d852638-223a-456c-b351-12909a8cf8ef

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt(); //get input
        sc.close(); //close the scanner
		
		double result = (C*1.8)+32;
		//(.6f) for 6 floating points 
        System.out.printf("%.6f",result);
    }
}
