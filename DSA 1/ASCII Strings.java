import java.io.*;
import java.util.*;

//https://course.acciojob.com/idle?question=28d1ea97-2f8e-4dbc-b72b-4af334a16474

public class Main {
  
  public static String solution(String str) {
		StringBuilder process = new StringBuilder("");
	  for(int i=1;i<str.length();i++){
		  char l1 = str.charAt(i-1);
		  char l2 = str.charAt(i);

		  process.append(l1);

		  int num=(int)l2-(int)l1;
		  process.append(num);
		  
		 if(i==str.length()-1){
			 process.append(l2);
		 }
	  }

	  String result = process.toString();
	  return result;
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.next();
    System.out.println(solution(str));
  }
}
