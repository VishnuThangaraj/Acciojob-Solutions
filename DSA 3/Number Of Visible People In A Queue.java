import java.io.*;
import java.util.*;

//https://course.acciojob.com/idle?question=0b817b2c-34b7-4589-a0a1-6576561c6c4f

class Main {
	public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int heights[]=new int[n];
        for(int i=0;i<n;i++)
        heights[i]=sc.nextInt();

        Solution ob = new Solution();
        
        int ans[]=ob.solve(heights);
        
        for(int i=0;i<n;i++)
        System.out.print(ans[i]+" ");
        
        System.out.println();
        
	}
}

class Solution {

	//HINT : U CAN SOLVE THE QUESTION BY FINDING NEXT GREATER IN RIGHT
    public int[] solve(int heights[])
    {
        //stack to store the index
		Stack<Integer> storage = new Stack<>();
		//storing result
		int[] visiblePersons = new int[heights.length];

		//traverse front last 
		for(int index = heights.length-1; index>=0; index--){
			int view = 0;
			while(!storage.isEmpty() && heights[index] > heights[storage.peek()]){
				view++; //increase visible persons
				storage.pop();
			}

			if(storage.isEmpty()){
				visiblePersons[index] = view; // no one is visible
			}else{
				visiblePersons[index] = view+1; //visible persons
			}
			storage.push(index);
		}
        return visiblePersons;
    }

}
