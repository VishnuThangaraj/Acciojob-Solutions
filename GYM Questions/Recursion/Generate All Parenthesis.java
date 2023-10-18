import java.io.*;
import java.util.*;

// https://course.acciojob.com/idle?question=db562d45-33dc-4706-a1b6-00f35ce5b40f

// https://course.acciojob.com/idle?question=117d315f-d2e8-4eb8-9e68-bd2322a59f84

class Solution{
	public static void parenthesis(int opening, int closing, String result){
		if(opening == 0 && closing == 0)
			System.out.println(result);

		if(opening > closing) // unbalanced
			return;

		if(opening > 0)
			parenthesis(opening-1, closing, result+"(");
		if(closing > 0)
			parenthesis(opening, closing-1, result+")");
	}
     public static void generateParanthesis(int n){
        parenthesis(n,n,"");
    }
}
public class Main {
    public static void main(String args[]) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        Solution obj=new Solution();
        obj.generateParanthesis(n);
    }
}
