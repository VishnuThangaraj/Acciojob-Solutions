import java.util.*;

// https://course.acciojob.com/idle?question=976cb4c0-3fca-47df-8cd3-59c58c474b05

public class Main {
    static void palindromeSubStrs(String s) {
        //use HashSet to to store distinct substrings
		HashSet<String> duplicates = new HashSet<>();

		List<String> answer = new ArrayList<>(); //for storing answers

		//get the substring
		for(int start=0; start<s.length(); start++){
			for(int end=start; end<s.length(); end++){
				String newString = s.substring(start,end+1);
				//check its palindrome and not a repeated one
				if(isPalindrome(newString) && !duplicates.contains(newString)){
					duplicates.add(newString); //add to hashset
					answer. add(newString);
				}
			}
		}

		//sort the answers
		Collections.sort(answer);
		
		for(String value:answer){
			System.out.println(value);
		}
    }

	static boolean isPalindrome(String s){
		if(s.length() == 1){
			return true; //single element
		}

		//use two pointers and check both are same 
		int start = 0;
		int end = s.length()-1;

		while(start<end){
			if(s.charAt(start) != s.charAt(end)){
				return false; //// not a palindrome
			}
			start++;end--;
		}

		return true;
	}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        palindromeSubStrs(s);
    }
}
