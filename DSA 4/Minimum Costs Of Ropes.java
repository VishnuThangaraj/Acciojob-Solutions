import java.math.*;
import java.util.*;
import java.io.*;

// https://course.acciojob.com/idle?question=bb7d3ad1-d2b7-4f65-8268-94e1d64a2ef3

class Solution
{
    long minCost(long arr[], int n) 
    {
		long result = 0;
        // add all the elements to priority queue
		PriorityQueue<Long> storage = new PriorityQueue<>();

		for(int ind=0; ind<n; ind++)
			storage.offer(arr[ind]); //min first

		// calcualte the cost of ropes
		while(storage.size() > 1){
			long first = storage.poll();
			long second = storage.poll();

			result += first + second;
			storage.offer(first + second);
		}
		
		return result;
    }
}

class Main
{
    static class FastReader{ 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader(){ 
            br = new BufferedReader(new InputStreamReader(System.in)); 
        } 
  
        String next(){ 
            while (st == null || !st.hasMoreElements()){ 
                try{ st = new StringTokenizer(br.readLine()); } catch (IOException  e){ e.printStackTrace(); } 
            } 
            return st.nextToken(); 
        } 
  
        String nextLine(){ 
            String str = ""; 
            try{ str = br.readLine(); } catch (IOException e) { e.printStackTrace(); } 
            return str; 
        } 

        Integer nextInt(){
            return Integer.parseInt(next());
        }
        
        Long nextLong(){
            return Long.parseLong(next());
        }
    }
    
	public static void main(String args[])
	{
		FastReader sc = new FastReader();
		PrintWriter out = new PrintWriter(System.out);
			int n = sc.nextInt();
			long arr[] = new long[n];
			
			for(int i=0; i<n; i++)
				arr[i] = sc.nextLong();
		    out.println(new Solution().minCost(arr, n));
		out.flush();
	}
}
