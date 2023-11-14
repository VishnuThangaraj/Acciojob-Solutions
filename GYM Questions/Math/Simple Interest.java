// https://course.acciojob.com/idle?question=378e9cb0-6679-429b-9e09-948e62b9e76b

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner (System.in);
        int principal = sc.nextInt();
        int time = sc.nextInt();
        double rate = sc.nextDouble();
        sc.close();

        double result  = (principal*time*rate)/100;
        System.out.println("Simple interest = "+result);
	}
}
