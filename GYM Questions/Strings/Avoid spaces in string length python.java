// https://course.acciojob.com/idle?question=2c0664d4-dd00-4551-8490-016ca397847b

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner read = new Scanner(System.in);
        String str = read.nextLine();
        read.close();

        int count = 0;
        for(char letter : str.toCharArray()){
            if(letter != ' ')
                count++;
        }

        System.out.println(count);
	}
}
