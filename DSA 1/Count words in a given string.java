import java.io.*;
import java.lang.*;
import java.util.*;

// https://course.acciojob.com/idle?question=c790c265-0a43-418d-b16c-ea23cda5d42c

class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    String p = sc.nextLine();
    while (t > 0) {
      String s = sc.nextLine();
      System.out.println(countWords(s));
      t--;
    }
  }

  public static int countWords(String s) {
    String[]word = s.split(" ");
	  return word.length;
  }
}
