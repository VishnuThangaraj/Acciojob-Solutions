import java.io.*;
import java.util.*;

// https://course.acciojob.com/idle?question=330aeee7-1ea7-48f1-a254-49f23dbcebac

public class Main {
	// function to get the number of words
	public static int getWords(String str){
		int wordCount = 1;

		for(int index=0; index<str.length(); index++){
			char letter = str.charAt(index);
			//check if its a Capital letter
			if(letter < 'a'){
				wordCount++;
			}
		}

		return wordCount;
	}
    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
		String words = read.nextLine(); 

		System.out.println(getWords(words));
    }
}
