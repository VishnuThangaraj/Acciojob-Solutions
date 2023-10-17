// https://course.acciojob.com/idle?question=730ccfc8-94ce-43a8-9c39-93e8d774e579

import java.io.*;
import java.util.*;
 
class Solution
{
	static String solve(int N, int[] Arr){
		// Store the subarray sum in HashSet
		HashSet<Integer> storage = new HashSet<>();
		int sum = 0;

		for(int num : Arr){
			sum += num;
			if(storage.contains(sum))
				return "YES";

			// add the sum to HashSet
			storage.add(sum);
		}
		return "NO"; // no subarray found with sum 0
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
 
         String out_ = Solution.solve(N, Arr);
         System.out.println(out_);
 
         wr.close();
         br.close();
    }
   
}
