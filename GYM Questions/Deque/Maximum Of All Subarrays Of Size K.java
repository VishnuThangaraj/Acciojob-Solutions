import java.util.*;
import java.io.*;

// https://course.acciojob.com/idle?question=93a43cbf-871f-41bf-9af6-b67346113351

class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
    
        int n = sc.nextInt();
        
        int k = sc.nextInt();
        
        int arr[] = new int[n];
        
        for(int i = 0; i <n; i++)
        {
            arr[i] =sc.nextInt();
        }
        
        ArrayList <Integer> res = new Solution().max_of_subarrays(arr, n, k);
        
        for (int i = 0; i < res.size(); i++)
            System.out.print (res.get (i) + " ");
        System.out.println();
    }
}

class Solution
{
    ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        ArrayList <Integer> result = new ArrayList <>();
		// Dequeue to store the index of elements in descending order
		Deque<Integer> storage = new ArrayDeque<>();

		for(int index=0; index<arr.length; index++){
			// fix the index to be in the range
			while(!storage.isEmpty() && storage.peek() <= index-k){
				storage.pollFirst();
			}
			// store in decreasing order
			while(!storage.isEmpty() && arr[storage.peek()] < arr[index]){
				storage.pollLast();
			}
			// add to Deque
			storage.offerLast(index);
			if(index >= k-1)
				result.add(arr[storage.getFirst()]);
		}
		
		return result;
    }
}
