import java.util.*;
import java.lang.*;
import java.io.*;

// https://course.acciojob.com/idle?question=dd77a111-7b9d-4274-a1ca-f65d4871db06

class Solution{
        static void print(String str){
            int[] alphabet = new int[26];
			// convert the string to lowerCase
			str = str.toLowerCase();

			for(int index=0; index<str.length(); index++){
				if(str.charAt(index) == ' ')
					continue; // ignore the spae
				int position = str.charAt(index) - 'a';
				alphabet[position]++;
			}

			for(int num : alphabet)
				System.out.print(num+ " ");
        }
}
public class Main
{
	public static void main(String[] args)  {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        Solution.print(str);
    }
}
