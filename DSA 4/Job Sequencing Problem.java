import java.io.*;
import java.lang.*;
import java.util.*;

// https://course.acciojob.com/idle?question=9b4489bb-7feb-4371-9851-5ca0e1ec56a8

class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        
        String inputLine[] = br.readLine().trim().split(" ");
    
        int n = Integer.parseInt(inputLine[0]);
        Job[] arr = new Job[n];
        inputLine = br.readLine().trim().split(" ");
        
        //adding id, deadline, profit
        for(int i=0, k=0; i<n; i++){
            arr[i] = new Job(Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]));
        }
        
        Solution ob = new Solution();
        
        //function call
        int[] res = ob.solve(arr, n);
        System.out.println (res[0] + " " + res[1]);
    
    }
}

class Solution
{
    
    int[] solve(Job arr[], int n){
		// sort the job based on the Profit
		Arrays.sort(arr, (a,b) -> {
			return b.profit - a.profit;
		});

		boolean[] isOccupied = new boolean[n+1];

		int count = 0;
		int totalProfit = 0;

		for(Job current : arr){
			int profit = current.profit;
			int deadLine = current.deadline;

			//check when to do the job
			for(int day=deadLine; day>0; day--){
				if(!isOccupied[day]){
					isOccupied[day] = true; // occupy the day
					totalProfit += profit;
					count++; //increase profit and job count
					break;
				}
			}
		}
		//return the count and totalProfit in an array
		int[] result = {count, totalProfit};

		return result;
    }
}
