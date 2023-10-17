import java.util.*;
import java.lang.*;
import java.io.*;

// https://course.acciojob.com/idle?question=201320dc-2167-444c-9039-94519afd9bdb

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);

		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();

		double d =((a+b)/c)*100;
		
		System.out.println((int)d+"%");
	}
}
