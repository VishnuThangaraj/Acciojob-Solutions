import java.util.*;
import java.lang.*;
import java.io.*;

// https://course.acciojob.com/idle?question=dcbd4272-4f3d-49f6-9be6-847eb0e812dd

public class Main {
	
	  public static void main (String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			    int n = Integer.parseInt(br.readLine().trim());
			    String inputLine[] = br.readLine().trim().split(" ");
			    int[] nums = new int[n];
			    for(int i=0; i<n; i++)nums[i]=Integer.parseInt(inputLine[i]);
			    int[] res = new Solution().nextLarger2(nums, n);
			    for (int i = 0; i < n; i++) 
			        System.out.print(res[i] + " ");
			    System.out.println();
		}
}
class Solution{
  
	public static int[] nextLarger2(int[] nums, int n){
		int[] result = new int[n];
		Stack<Integer> storage = new Stack<>();

		for(int index = 2*(n-1); index>=0; index--){
			// remove elements in stack that are less than [i%n]
			while(!storage.isEmpty() && nums[storage.peek()] <= nums[index % n])
				storage.pop();

			if(index< n){
				if(storage.isEmpty()){
					result[index] = -1;
				}else{
					result[index] = nums[storage.peek()];
				}
			}
			storage.push(index % n);
		}

		return result;
	}
}
