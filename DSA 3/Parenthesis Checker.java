import java.io.*;
import java.util.*;

//https://course.acciojob.com/idle?question=1aa085e1-e5c3-400b-851d-dbd9f70fa19d

public class Main {
	//checks for valid parantheesis
    public static void parenthesisChecker(String s){
		//contains 3 types of paranthesis
		//stack to store the paranthesis
		Stack<Character> storage = new Stack<>();

		//iterate through the string
        for(int index=0; index<s.length(); index++){
			char bracket = s.charAt(index);//get the paranthesis from string
			
			//add to stack if encountered with a opening paranthesis
			if(bracket == '(' || bracket == '[' || bracket == '{'){
				storage.push(bracket);
			}
			else if(bracket == ')'){
				if(storage.isEmpty() || '(' != storage.peek()){
					System.out.println(0); 
					return;
				}else{
					storage.pop(); //remove the valid bracket from stack
				}
			}
			else if(bracket == ']'){
				if(storage.isEmpty() || '[' != storage.peek()){
					System.out.println(0);
					return;
				}else{
					storage.pop(); //remove the valid bracket from stack
				}
			}
			else if(bracket == '}'){
				if(storage.isEmpty() || '{' != storage.peek()){
					System.out.println(0);
					return;
				}else{
					storage.pop(); //remove the valid bracket from stack
				}
			}
		}

		//final check if there is any remaining elements in stack 
		if(!storage.isEmpty()){
			System.out.println(0);
			return;
		}
		
		System.out.println(1); //no unbalanced brackets found
	}
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        parenthesisChecker(s);
    }
}
