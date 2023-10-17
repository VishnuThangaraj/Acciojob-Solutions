import java.util.*;

//https://course.acciojob.com/idle?question=5a641db9-9cd3-4ab0-8fee-e34edb1ebcf2

class Solution {
    public int MinOps(String s) {
        // create stack to store opening parantheses
		Stack<Character> storage = new Stack<>();

		int stepsNeeded = 0;		
		
		//iterate through the string
		for(int index=0; index<s.length(); index++){
			char letter = s.charAt(index);

			if(letter == '('){
				storage.push(letter);//add to stack
			}else{
				if(storage.isEmpty()){
					stepsNeeded++; //stack is empty and no valid bracket pair
				}else{
					storage.pop(); //valid bracket pair in stack is popped
				}
			}
		}

		//unclosed opening brackets in stack will also taken in count
		stepsNeeded+=storage.size();

		return stepsNeeded;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
	    Solution Obj = new Solution();
        System.out.println(Obj.MinOps(s));
    }
}
