// https://course.acciojob.com/idle?question=4dc94614-e099-4713-a03d-5026978ffab6

import java.io.*;
import java.util.*;
class solution 
{
      static long solve(int n,int[] arr)
      {
           long product = 1;
          for(int num : arr)
              product = (product*num) % 1000000007;

          return product;
      }
}
public class Main {
	public static void main(String args[]) {
		         Scanner sc = new Scanner(System.in);
                 int n = sc.nextInt();
                 int[] Arr = new int[n];
                 for (int i=0;i<n;i++)
                {
                       Arr[i]=sc.nextInt();
                }
                System.out.println(solution.solve(n,Arr));
	}
}
