// https://course.acciojob.com/idle?question=c16b6a56-f08f-45db-9754-c082fa5f0883

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner read = new Scanner (System.in);
		//get the input
		int oldWeight = read.nextInt();
		int newWeight = read.nextInt();
		int oldPrice = read.nextInt();
		int newPrice = read.nextInt();

		// calculate Average
		double avgWeight = (oldWeight + newWeight) / 2.0;
		double avgPrice = (oldPrice + newPrice) / 2.0;

		// print the output
		System.out.println("Average weight is "+avgWeight+" gm");
		System.out.println("Average price is "+avgPrice+" rs");
		
	}
}
