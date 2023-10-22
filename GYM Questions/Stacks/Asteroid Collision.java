import java.util.*;

// https://course.acciojob.com/idle?question=4d8f93dd-693d-43a3-b3d1-2fcbad36d2ff

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> storage = new Stack<>();

		for(int rock : asteroids){
			if(rock > 0){ // Positive
				storage.push(rock);
			}
			else{ // Negative
				while(!storage.isEmpty() && storage.peek() > 0 && storage.peek() < Math.abs(rock))
					storage.pop();

				if(storage.isEmpty() || storage.peek() < 0)
					storage.push(rock); // Add to Stack
				else if (storage.peek() == Math.abs(rock))
					storage.pop(); // same weight asteroids met 
			}
		}
		int[] result = new int[storage.size()];

		for(int index = result.length-1; index>=0; index--)
			result[index] = storage.pop();

		return result;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Solution Obj = new Solution();
        int[] result = Obj.asteroidCollision(arr);
        for (int i = 0; i < result.length; ++i)
            System.out.print(result[i] + " ");
        System.out.println();
        sc.close();
    }
}
