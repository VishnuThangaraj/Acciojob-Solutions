import java.util.*;
import java.lang.*;
import java.io.*;

// https://course.acciojob.com/idle?question=e0a664d5-d9f6-4195-9bda-bebe00eb4cdb

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        // Get the input
        int mark = sc.nextInt();
        sc.close();

        if(mark>90)
            System.out.println("excellent");
        else if (mark > 80)
            System.out.println("good");
        else if (mark > 70)
            System.out.println("fair");
        else if (mark > 60)
            System.out.println("meets expectations");
        else
            System.out.println("below average");
	}
}
