import java.util.*;
import java.lang.*;
import java.io.*;

// https://course.acciojob.com/idle?question=d703995b-3211-42d1-8116-eba8f4853f4d

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		// get the input
		int n = sc.nextInt();

		while(n > 0){
			System.out.println(n % 10);
			n /= 10;
		}

		sc.close();
	}
}
