import java.io.*;
import java.util.*;

// https://course.acciojob.com/idle?question=c11892f3-ca35-4a9f-81b2-1e1e81b25797

class Main {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	   
        int n=sc.nextInt(); 
        ArrayList<Integer> arr= new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int x=sc.nextInt();
            arr.add(x);
        }
        
        Solution ob=new Solution();
        System.out.println(ob.candies(arr,n));
        
	}
}


class Solution {
    public int candies(ArrayList<Integer> A,int n) {
        // compare with left neighbors 
		int[] left = new int[n];
		left[0] = 1;

		for(int index=1; index<n; index++){
			if(A.get(index) > A.get(index-1)){ // greater than left neighbor
				left[index] = left[index-1]+1;
			}else{
				// smaller the right neighbor
				left[index] = 1;
			}
		}

		// compare with right neighbor
		int[] right = new int[n];
		right[n-1] = 1;

		for(int index = n-2; index>=0; index--){
			if(A.get(index) > A.get(index+1)){ // greater than left neighbor
				right[index] = right[index+1] +1;
			}else{
				right[index] = 1;
			}
		}

		// calculate the number of candy required
		int candyCount = 0;

		for(int index=0; index<n; index++){
			// maximum of left and right will be the count
			candyCount += Math.max(left[index], right[index]);
		}

		return candyCount;
    }
}
