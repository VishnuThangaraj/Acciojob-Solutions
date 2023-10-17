import java.util.*;
import java.io.*;

// https://course.acciojob.com/idle?question=e3c532eb-02e8-4a12-baaf-21f342220c6b

class Solution{
	static int longestParanthesis(String s){
		int result = 0;
		// stack to store the index
		Stack<Integer> storage = new Stack<>();
		storage.push(-1);
		
		for(int index=0; index<s.length(); index++){
			char letter = s.charAt(index);

			// push to stack if opening
			if(letter == '(')
				storage.push(index);
			else{
				// pop the opening bracket
				if(!storage.isEmpty()){
					storage.pop();
				}

				// update the result
				if(!storage.isEmpty())
					result = Math.max(result, index - storage.peek());
				else
					storage.push(index); // empty stack
			}
		}
		return result;
	}
}
public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        System.out.println(Solution.longestParanthesis(s));
    }
}
