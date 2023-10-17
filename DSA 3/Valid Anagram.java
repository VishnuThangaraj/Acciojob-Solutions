import java.util.*;

//https://course.acciojob.com/idle?question=bedea261-bd68-4e76-aca3-3bab794e91e2

class Solution {
   static boolean areAnagram(String c1, String c2) {
       //use HashMap to store character and occurance
	   HashMap<Character, Integer> first = new HashMap<>();
	   HashMap<Character, Integer> second = new HashMap<>();
	   
	   //store the first string
	   for(int index=0; index<c1.length(); index++){
		   char letter = c1.charAt(index);
		   //character already in the hashMap
		   if(first.containsKey(letter)){
			   first.put(letter, first.get(letter)+1);
		   }
		   else{
			   first.put(letter,1);
		   }
	   }

	   //store the second string
	   for(int index=0; index<c2.length(); index++){
		   char letter = c2.charAt(index);
		   //character already in the hashMap
		   if(second.containsKey(letter)){
			   second.put(letter, second.get(letter)+1);
		   }
		   else{
			   second.put(letter,1);
		   }
	   }

	   //traverse through second array and find if its matching
	   for(int index=0; index<c2.length(); index++){
			char letter = c2.charAt(index);

		   if(first.containsKey(letter)){
			   //same occurance of character
			   if(first.get(letter) == second.get(letter)){
				   continue;
			   }
		   }
		   return false; //chaaracter not found or different occurance of character
	   }

	   return true;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        Solution Obj = new Solution();
        
        if (Obj.areAnagram(str1, str2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
