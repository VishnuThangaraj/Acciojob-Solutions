import java.util.*;

// https://course.acciojob.com/idle?question=a1fc462b-409b-4a19-aa5f-1f96ae32b972

public class Main {

    public static long DistinctCharacterSubstring(String s){
        long substringCount = 0; 

		int[]frequency = new int[26]; //alphabetical frequency 

		int start = 0; 
		int end = 0;

		while(start < s.length()){
			if(end < s.length() && frequency[s.charAt(end)-'a'] < 1){
				//add to frequency array and increase the count
				frequency[s.charAt(end)-'a']++;
				substringCount += (end - start)+1;
				end++;
			}
			else{ //already exists
				frequency[s.charAt(start)-'a']--;
				start++;
			}
		}

		return substringCount;
    }

    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        long ans = DistinctCharacterSubstring(s);
        System.out.println(ans);
    }
}
