import java.io.*;
import java.util.*;
import java.lang.*;

// https://course.acciojob.com/idle?question=8fe21d1b-0023-4ec9-99c8-a8d5cd4d8d0e

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        String inputLine[] = br.readLine().trim().split(" ");
		int n = Integer.parseInt(inputLine[0]);

		int start[] = new int[n];
		int end[] = new int[n];

		inputLine = br.readLine().trim().split(" ");
		for (int i = 0; i < n; i++)
			start[i] = Integer.parseInt(inputLine[i]);

		inputLine = br.readLine().trim().split(" ");
		for (int i = 0; i < n; i++) 
			end[i] = Integer.parseInt(inputLine[i]);
			
		int ans = new Solution().maxMeetings(start, end, n);
		System.out.println(ans);
    }
}

class Solution 
{
    public int maxMeetings(int start[], int end[], int n) {
        // store the start and end pointers in 2D array
		int[][] slots = new int[n][2];

		for(int ind=0; ind<n; ind++){
			slots[ind][0] = start[ind];
			slots[ind][1] = end[ind];
		}
		
		//sort on basis on start time
		Arrays.sort(slots, (a,b) -> a[0] - b[0]);

		int count = 0;
		int newStart = -1;

		for(int ind=0; ind<n; ind++){
			if(slots[ind][0] > newStart){
				//increase count and update NewStart
				count++;
				newStart = slots[ind][1];
			}else if(slots[ind][1] < newStart){
				//small interval found..update new Start
				newStart = slots[ind][1];
			}
		}

		return count;
    }
}
