import java.util.*;

//https://course.acciojob.com/idle?question=3add5ac6-a666-48ac-bad4-75c38f5662f1

class Solution {
    public boolean validateStack(int[] pushed, int[] popped) {
        // create stack to sotore the elements
		Stack<Integer> storage = new Stack<>();

		int popPointer = 0;
		//traverse throught the push array
		for(int index =0; index <pushed.length; index ++){
			//add to the stack
			storage.push(pushed[index]);
			//pop the element if its same as in popped array
			while(!storage.isEmpty() && popped[popPointer] == storage.peek()){
				storage.pop(); //pop the element
				popPointer++;
			}
		}
		if(storage.isEmpty()){ //few elements present in stack as unPopped
			return true;
		}
		return false;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] pushed = new int[n];
        int[] popped = new int[n];
        for (int i = 0; i < n; i++) {
            pushed[i] = scn.nextInt();
        }
        for (int i = 0; i < n; i++) {
            popped[i] = scn.nextInt();
        }
        Solution Obj = new Solution();
        scn.close();
        System.out.print(Obj.validateStack(pushed, popped));
    }
}
