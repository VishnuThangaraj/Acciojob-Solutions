// https://course.acciojob.com/idle?question=3ea48979-4d89-4667-88ad-70b779c5db88

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public static void solve(int A) {
		ArrayList<Integer> result = new ArrayList<>();
		result.add(1);

		System.out.println(1);

		for(int row=1; row<A; row++){
			ArrayList<Integer> current = new ArrayList<>();
			current.add(1);

			for(int index=1; index<result.size(); index++){
				current.add(result.get(index-1)+result.get(index));
			}

			current.add(1);
			result = current;

			// print the row
			for(int num : result)
				System.out.print(num+" ");
			System.out.println();
		}
    }
  public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
	  int K = sc.nextInt();
      solve(K);
      
	}
}
