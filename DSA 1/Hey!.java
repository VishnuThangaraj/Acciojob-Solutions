import java.io.*;
import java.util.*;

// https://course.acciojob.com/idle?question=e0625054-16fc-4681-bccb-0f8be93c5d20

public class Main {

       static String hey(String str)
      {
		  String result ="";
           for(int i=0;i<str.length();i++){
			   char letter = str.charAt(i);
			   if(letter=='e'){
				   result+=letter+""+letter;
			   }else{
				   result+=letter;
			   }
		   }
		  return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        String result = hey(str);
        System.out.print(result);        
        System.out.println('\n');
    }
}
