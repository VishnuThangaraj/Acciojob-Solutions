import java.io.*;
import java.util.*;

// https://course.acciojob.com/idle?question=6dfc4167-4a18-4a81-ba12-c036ac76a173

public class Main {
    public static long ways(int processed, int unProcessed){
	    if(unProcessed==0){
  			return 1;
  		}
  		long total = 0;
  		//for processed
  		for(int i=processed+1;i<=unProcessed;i++){
  			total += ways(i,unProcessed-i);
  		}
  		return total;
    }
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(ways(0, n));
    }
}
