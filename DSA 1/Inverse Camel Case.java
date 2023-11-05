import java.io.*;
import java.util.*;

// https://course.acciojob.com/idle?question=60cd3eae-a883-4803-990d-838d8a1c5b84

public class Main {
  
  public static void solution(String str) {
    for(int i=0;i<str.length();i++){
		char letter = str.charAt(i);
		if(i>0 && (int)letter>=65 && (int)letter<=90){
			System.out.println();
		}
		System.out.print(letter);
	}
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.next();
    solution(str);
  }
}
