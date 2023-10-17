import java.util.*;

//https://course.acciojob.com/idle?question=2da7ad22-cccc-497d-864c-a3ea784e1263

class Solution{
    static int[] SlidingWindowMaximum(int N, int K, int[] arr){
        //array to store the result
		int[] result = new int[N -K+1]; //size of array - K -1
		int resultIndex = 0; //

		//create a deque to store the index
		Deque<Integer> storage = new ArrayDeque<>();

		//traverse throught the array
		for(int index=0; index<N ;index++){
			//remove the elements out of range for K-size 
			while(!storage.isEmpty() && storage.peek() <= index-K){
				//remove from front
				storage.poll();
			} 

			//remove the smaller elements
			while(!storage.isEmpty() && arr[index] > arr[storage.peekLast()]){
				//remove from front
				storage.pollLast();
			}

			//insert the current index in back of deque
			storage.offer(index); 

			//insert in result array from Kth time
			if(index >= K-1){
				result[resultIndex++] = arr[storage.peek()];
			}
		}
		return result;
    }
}

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int nums[]=new int[n];
        for(int i = 0; i < n; i++)
        {
            nums[i] = sc.nextInt();
        }
        Solution obj = new Solution();
        int[] ans=obj.SlidingWindowMaximum(n,k,nums);
        for(int i=0;i<ans.length;++i){
            System.out.print(ans[i] + " ");
        }
    }
}
