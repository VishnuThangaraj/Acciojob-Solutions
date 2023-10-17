import java.util.*;
import static java.lang.Math.ceil;

//https://course.acciojob.com/idle?question=3ddd108b-3085-4a24-b6fa-3ce45ef52544

class Solution {
    public boolean CanBalance(String s) {
        //count the number of opening and closing brackets
		int opening = 0;
		int closing = 0;

		//iterate over the string
		for(int index=0; index<s.length(); index++){
			char letter = s.charAt(index);
			if(letter == '('){
				opening++;
			}else{
				closing++;
			}
		}

		if(opening == closing){
			return true; //balanced expression
		}
        return false;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
	    Solution Obj = new Solution();
        if(Obj.CanBalance(s))
            System.out.println("1");
        else
            System.out.println("0");
    }
}
