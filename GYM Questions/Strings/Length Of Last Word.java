import java.util.*;
import java.lang.*;
import java.io.*;

// https://course.acciojob.com/idle?question=97b3f05a-d739-4f9f-ba80-d5efe09d7bab

class Main {
    public static int lengthOfLastWord(final String a) {
      int result = 0;

        for(int index=a.length()-1; index>=0; index--){
            if(a.charAt(index) == ' ') break;
            result++;
        }
        return result;
    }

  public static void main (String[] args)
	{
    Scanner sc = new Scanner(System.in);
	    
	  String s = sc.nextLine();
	  
    System.out.println(lengthOfLastWord(s));
		
	}
}
