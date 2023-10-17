import java.util.*;
import java.lang.*;
import java.io.*;

// https://course.acciojob.com/idle?question=0031d548-b5e9-488d-a254-9a9a3536319a

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner read = new Scanner(System.in);
		int N = read.nextInt();

		int sq = N * N;

		while (N > 0) {
            // Return false, if any digit of N doesn't
            // match with its square's digits from last
            if (N % 10 != sq % 10){
				System.out.print("Not an Automorphic Number");
				return ;
			}
                
  
            // Reduce N and square
            N /= 10;
            sq /= 10;
        }
  
        System.out.print("Automorphic Number");
	}
}
