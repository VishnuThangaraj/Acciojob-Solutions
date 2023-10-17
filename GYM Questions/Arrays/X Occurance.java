// https://course.acciojob.com/idle?question=6428461f-72cf-44f8-8d75-5e1c51fe523b

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
		int size = read.nextInt();
		int find = read.nextInt();

		int count = 0;

		for(int row=1; row<=size; row++){
			for(int col=1; col<=size; col++){
				// check if the num occurs
				if(row * col == find)
					count++;
			}
		}

		System.out.println(count);
    }
}
