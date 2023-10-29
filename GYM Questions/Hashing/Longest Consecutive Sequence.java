import java.util.*;
import java.lang.*;
import java.io.*;

// https://course.acciojob.com/idle?question=ebaa8271-8543-44d5-8c3f-3405fe400c28

class Main {
    
    public static long longestConsecutiveSequence(int A[], long n) 
    { 
       long result = 0;
        HashSet<Integer> storage = new HashSet<>();

        for(int index=0; index<A.length; index++) storage.add(A[index]);

        for(int index=0; index<A.length; index++){
            if(!storage.contains(A[index]-1)){
                long count = 0;
                int num = A[index];

                while(storage.contains(num)){
                    count++;
                    storage.remove(num++);
                }
                // update result
                result = Math.max(result, count);
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
        System.out.println(longestConsecutiveSequence(arr, n));
		
	}
}



