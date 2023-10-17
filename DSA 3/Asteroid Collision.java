import java.util.*;

//https://course.acciojob.com/idle?question=4d8f93dd-693d-43a3-b3d1-2fcbad36d2ff

//this gives error in acciojob portal due to its acciojob faulty test-case ... u can try the answer in leet code and it gives 100%
//https://leetcode.com/problems/asteroid-collision/description/

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
         //use deque to hold the values of asteroids
		Deque<Integer> space = new ArrayDeque<>();		 

		//traverse through the asteroids
		for(int index=0; index<asteroids.length; index++){

			if(asteroids[index] > 0){ //positive integer add to queue
				space.addLast(index);
			}
			else{ //negative integer 
				int value = Math.abs(asteroids[index]); //convert to positive for easy validation
				boolean  flag = false;

				//remove all the lesser elements in stack
				while(!space.isEmpty() && asteroids[space.getLast()] <= value && asteroids[space.getLast()]>=0){

					//current negative asteroid wont be added in queue if its same size as asteroid in stack
					if(asteroids[space.getLast()] == value){
						space.pollLast(); //remove the last element
						flag = true;
						break; //current & asteroid in stack is destroyed...break the loop
					}
					space.pollLast(); //remove the last element
				}

				//check current asteroid is destroyed 
				if(!flag){
					if(!space.isEmpty() && asteroids[space.getLast()] > 0){
						continue;
					}
					space.addLast(index); //insert the current asteroid index
				}
			}
		}

		//create a result array of deque size and store the values
		int[]result = new int[space.size()];

		int index=0;
		while(!space.isEmpty()){
			result[index++] = asteroids[space.pollFirst()];
		}

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
