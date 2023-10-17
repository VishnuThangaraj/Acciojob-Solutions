import java.io.*;
import java.util.*;

//https://course.acciojob.com/idle?question=4bf92311-0388-4e38-b13f-1563b7469901

class Solution {
    public void nonRepeatingCharacter(String s) {
        // create hashmap to store the character and occurance
		HashMap<Character, Integer> storage = new HashMap<>();

		//add all the characters in the hashmap
		for(int index=0; index<s.length(); index++){
			char letter = s.charAt(index);
			//check if map contains the character
			if(storage.containsKey(letter)){
				//update the occurance in hashMap
				storage.put(letter, storage.get(letter)+1);
			}else{
				storage.put(letter, 1); //add in hashMap
			}
		}

		//iterate throught the string
		for(int index=0; index<s.length(); index++){
			int occurance = storage.get(s.charAt(index));
			
			if(occurance == 1){ //1 occurance character is found  == no repeating
				System.out.println(s.charAt(index));
				//print and exit the function
				return;
			}
		}

		//no single occurance character is found
		System.out.println(-1);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        s=sc.next();
        Solution Obj = new Solution();
        Obj.nonRepeatingCharacter(s);  
        System.out.println();
    }
}
