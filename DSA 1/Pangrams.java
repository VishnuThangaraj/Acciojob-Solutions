import java.util.*;
import java.io.*;

// https://course.acciojob.com/idle?question=eaa8cb67-a460-4870-b684-be7fba2a6976

public class Main {
     public  static void isPangram(String s)
      {
		  s=s.toLowerCase();
        for(char a = 'a';a<='z';a++){
			int count = 0;
			for(int i=0;i<s.length();i++){
				char letter = s.charAt(i);
				count++;
				if(letter == a){
					break;
				}
				if(count == s.length()){
					System.out.print("not pangram");
					return;
				}
			}
		}
		  System.out.print("pangram");
    }
    public static void main(String args[]) {
   Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        isPangram(s);
        
    }
}
