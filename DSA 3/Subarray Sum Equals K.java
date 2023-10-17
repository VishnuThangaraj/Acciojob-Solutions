import java.io.*;
import java.util.*;

// https://course.acciojob.com/idle?question=ffc310e8-20af-4439-b981-4c11f7ef87af

 class Solution
{
    static int solve(int N, int[] Arr, int K){
       // Write your code here
        int result = 0;
		int sum =0;
		//HashMap to store the sum and its occurance
		HashMap<Integer,Integer> storage = new HashMap<>();

		for(int value : Arr){
			sum+= value; //add the element to sum

			if(sum == K){
				result ++; //subarray with sum K found
			}
			result += storage.getOrDefault(sum-K,0);

			storage.put(sum,storage.getOrDefault(sum,0)+1);
		}
 
        return result;
    }
}
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
         int N = Integer.parseInt(br.readLine().trim());
         String[] arr_Arr = br.readLine().split(" ");
         int[] Arr = new int[N];
         for(int i_Arr = 0; i_Arr < arr_Arr.length; i_Arr++)
         {
         	Arr[i_Arr] = Integer.parseInt(arr_Arr[i_Arr]);
         }
         int K = Integer.parseInt(br.readLine().trim());
 
         int out_ =  Solution.solve(N, Arr, K);
         System.out.println(out_);
 
         wr.close();
         br.close();
    }
}
