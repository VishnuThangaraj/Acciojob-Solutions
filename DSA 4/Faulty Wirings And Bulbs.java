import java.util.*;
import java.lang.*;
import java.io.*;

// https://course.acciojob.com/idle?question=c55311db-93a3-468c-a47a-bc61e7d40587

class Solution {
    public static int bulbs(int[] A) {
        int result = 0;

		for(int ind=0; ind<A.length; ind++){
			if(result%2 == 0 && A[ind]==0){
				result++;
			}else if(result % 2 != 0 && A[ind]==1){
				result++;
			}
		}
		return result;
    }
}

public class Main {
  public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
	    
	    	int n = sc.nextInt();
			int[] A = new int[n];
			for(int i=0;i<n;i++)
			{
				A[i]= sc.nextInt();
			}
            Solution solution = new Solution();
	    	System.out.println(solution.bulbs(A));
		
	}
}
