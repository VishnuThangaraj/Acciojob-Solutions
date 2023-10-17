import java.util.*;
import java.lang.*;
import java.io.*;

//https://course.acciojob.com/idle?question=50799402-ffd5-4907-9f91-555993ff4b62

class Main {
    
    
	public static void main (String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
        long n = Long.parseLong(br.readLine().trim());
        String inputLine[] = br.readLine().trim().split(" ");
        long[] arr = new long[(int)n];
        for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
        System.out.println(new Solution().maximumArea(arr, n));
	}
}

class Solution
{
      public static long maximumArea(long hist[], long n){
		//FIND LEFT SMALLEST INDEX
		  long[]left = leftSmallest(hist);

		//FIND RIGHT SMALLEST INDEX
		  long[]right = rightSmallest(hist);

		long maxArea = 0;

		  for(int index =0 ;index<left.length; index++){
			  long ans = ((right[index] - left[index])+1) * hist[index];
			  maxArea = Math.max(maxArea,ans);
		  }
		  
		  return maxArea;
    }

	//left smallest elements for hist array
	private static long[] leftSmallest(long[]hist){
		//create array to store the smaller element index
		long[]result = new long[hist.length];

		//stack to store the indexes
		Stack<Integer> storage = new Stack<>();

		for(int index = 0;index<hist.length;index++){
			while(!storage.isEmpty() && hist[index] <= hist[storage.peek()]){
				storage.pop();
			}
			//empty storage stack
			if(storage.isEmpty()){
				result[index] = 0;
			}else{
				result[index] = storage.peek()+1;
			}
			//add to stack
			storage.push(index);
		}

		return result;
	}

		//right smallest elements for hist array
	private static long[] rightSmallest(long[]hist){
		//create array to store the smaller element index
		long[]result = new long[hist.length];

		//stack to store the indexes
		Stack<Integer> storage = new Stack<>();

		for(int index = hist.length -1 ;index >=0 ;index--){
			while(!storage.isEmpty() && hist[index] <= hist[storage.peek()]){
				storage.pop();
			}
			//empty storage stack
			if(storage.isEmpty()){
				result[index] = hist.length -1 ;
			}else{
				result[index] = storage.peek()-1;
			}
			//add to stack
			storage.push(index);
		}

		return result;
	}
}



