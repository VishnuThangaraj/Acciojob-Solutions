// https://course.acciojob.com/idle?question=6ac89cf8-93c7-444e-8513-a3bfb984d424

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
    public static String formatString(String str, int size){
        StringBuilder result = new StringBuilder();
        boolean space = true;

        for(int index=0; index < size; index++){
            char letter = str.charAt(index);
            if(index == size-1 || str.charAt(index+1) == ' ' || space){
                result.append((char)(letter-32));
                space = false;
            }
            else{
                if(letter == ' ') {
                    space = true;
                }
                else{
                    space = false; 
                } 
                
                result.append(letter);
            }
        }

        return result.toString();
        
    }
	public static void main (String[] args) throws java.lang.Exception{

        Scanner read = new Scanner(System.in);
        String str = read.nextLine();
        read.close();

        String result = formatString(str, str.length());

        System.out.println(result);
	}
}
