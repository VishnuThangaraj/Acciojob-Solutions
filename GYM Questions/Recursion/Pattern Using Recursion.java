// https://course.acciojob.com/idle?question=904c769d-9dc2-4b42-aa91-d4e8d44f826f

import java.io.*;
import java.util.*;
class Main {
   public static void printPattern(int n){
     if(n == 0) return;

       printPattern(n-1); //Recursion calls

       for(int i=0;i<n;i++){
           System.out.print("* ");
       }
       System.out.println();
   }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printPattern(n);
    }
}
