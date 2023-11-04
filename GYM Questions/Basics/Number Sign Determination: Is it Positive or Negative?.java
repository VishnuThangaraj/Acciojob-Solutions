import java.util.*;
import java.lang.*;
import java.io.*;

// https://course.acciojob.com/idle?question=b5d5636b-6846-4503-9ac5-60a0cd05695b

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        // Get the input
        int num = sc.nextInt();
        sc.close();

        if(num >0 )
            System.out.println("Number is positive");
        else
            System.out.println("Number is negative");
	}
}
