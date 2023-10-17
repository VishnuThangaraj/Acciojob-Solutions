import java.util.*;
import java.lang.*;
import java.io.*;

// https://course.acciojob.com/idle?question=05d6b1b0-d843-4974-8a19-c65be520d5a9

class Main {
    
    public static int[] twoSum(int[] A, int target) {
       int result[] = new int[2]; // to store the result index
		int first = 0; // start of the array
		int last = A.length-1; //ending of the array

		while(first < last){
			int total = A[first] + A[last];
			if(total == target){ // target found
				//store in array with 1 based indexing
				result[0] = first+1;
				result[1] = last+1;
				break;
			}
			else if(total < target){ // increase the total value
				first++;
			}else{ // decrease the total value
				last--;
			}
		}

		return result;
    }
	
    public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
        long n = Long.parseLong(br.readLine().trim());
        String inputLine[] = br.readLine().trim().split(" ");
        int[] arr = new int[(int)n];
        for(int i=0; i<n; i++)arr[i]=Integer.parseInt(inputLine[i]);
        int m = Integer.parseInt(br.readLine().trim());
        int[] ans = (twoSum(arr, m));
        System.out.println(ans[0] + " " + ans[1]);
	}
}



