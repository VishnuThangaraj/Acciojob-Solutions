import java.util.*;
import java.lang.*;
import java.io.*;

//https://course.acciojob.com/idle?question=71891482-69b9-4bd3-a1ae-1945179ee04f

class Main {
	public static long binarySearch(long value, long low, long high, long ans){
		//base condition
		if(low > high){
			return ans;
		}

		long mid = (low+high)/2;
		
		if((mid*mid) <= value){  //possible answer found
			//search the right region
			return binarySearch(value,mid+1,high,mid);
		}

		//search left region
		return binarySearch(value,low,mid-1,ans);
	}
    public static void sqrt(int A) {
        // recursive binary search
		//argurements =number, start value, end value(sqrt of a number wont be greate than its half), answer
		System.out.println(binarySearch(A,1,A/2,1));
    }

  public static void main (String[] args)
	{
    Scanner sc = new Scanner(System.in);
	    
	  int A = sc.nextInt();
	  
    sqrt(A);
		
	}
}
