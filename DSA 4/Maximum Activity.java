import java.io.*; 
import java.util.*; 
import java.lang.*;

// https://course.acciojob.com/idle?question=187bc3b6-2bee-431a-8dcb-c069687d017c

class Main
{
    public static void main (String[] args) throws IOException  
    {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String inputLine[] = br.readLine().trim().split(" ");
        //size of array
        int n = Integer.parseInt(inputLine[0]);
        int start[] = new int[n];
        int end[] = new int[n];
        
        //adding elements to arrays start and end
        inputLine = br.readLine().trim().split(" ");
        for(int i = 0; i < n; i++)
            start[i] = Integer.parseInt(inputLine[i]);
        
        inputLine = br.readLine().trim().split(" ");
        for(int i= 0; i < n; i++)
            end[i] = Integer.parseInt(inputLine[i]);
        
        System.out.println(new Solution().solve(start, end, n));
    
    }
}

class Solution
{
    
    public static int solve(int start[], int end[], int n)
    {
		int[][] timeSlots = new int[n][n];

		for(int ind=0; ind<n; ind++){
			timeSlots[ind][0] = start[ind];
			timeSlots[ind][1] = end[ind];
		}
        // sort the array on basis on start time
		Arrays.sort(timeSlots, (a,b) -> {
			return a[0] > b[0] ? 1 : -1;
		});

		int count = 0;
		int newStart = 0;

		for(int ind=0; ind<n; ind++){
			if(timeSlots[ind][0] > newStart){
				// new intervals found
				count++;
				newStart = timeSlots[ind][1];
			}else if(timeSlots[ind][1] < newStart){
				// better interval found
				newStart = timeSlots[ind][1];
			}
		}
		
		return count;
    }
}
