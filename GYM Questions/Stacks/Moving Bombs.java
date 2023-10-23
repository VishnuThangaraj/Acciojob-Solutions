import java.util.*;

// https://course.acciojob.com/idle?question=ff5cc783-d70d-461a-b8df-3e1753a4d489

class Solution {
    public int[] MovingBombs(int[] bombs) {
        //Write your code here
		Stack<Integer> stack = new Stack<>();

		for(int a : bombs){
			if( a > 0){
				stack.push(a);
			}
			else{
				while(!stack.isEmpty() && stack.peek() >0 && stack.peek() < -a)
					stack.pop();
				if(stack.isEmpty() || stack.peek() < 0)
					stack.push(a);
				else if(stack.peek() == -a){
					stack.pop();
				}
			}
		}
		int[] result = new int[stack.size()];

		for(int i=result.length-1; i>=0; i--){
			result[i] = stack.pop();
		}
		return result;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Solution Obj = new Solution();
        int[] result = Obj.MovingBombs(arr);
        for (int j : result)
            System.out.print(j + " ");
        System.out.println();
        sc.close();
    }
}
