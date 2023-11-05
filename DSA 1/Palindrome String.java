import java.io.*;
import java.util.*;

// https://course.acciojob.com/idle?question=ad163b7c-8fea-42d3-a8e9-39d4d6a06b18

public class Main {
	static int isPalindrome(String str)
      {
		  str = str.toLowerCase();
         int i=0,j=str.length()-1;
		  while(i<j){
			  char l1 = str.charAt(i);
			  char l2 = str.charAt(j);
			  if(l1 <'a' || l1 >'z'){
				  i++;continue;
			  }else if(l2 < 'a' || l2>'z'){
				  j--;continue;
			  }
			  if(l1!=l2){
				  return 0;
			  }
			  i++;j--;
		  }
		  return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        int result = isPalindrome(str);
        System.out.println(result);        
    }
}
