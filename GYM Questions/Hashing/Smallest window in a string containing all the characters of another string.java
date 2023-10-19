import java.util.*;

// https://course.acciojob.com/idle?question=2785822b-1a69-48b5-9a8d-9ffe635b6b25

class Accio {
	public String minWindow(String s, String t) {
		// HashMap to store the character and its frequency of String B
		HashMap<Character, Integer> first = new HashMap<>();

		// find the unique character and its count of String B
		for(int index=0; index< t.length() ; index++){
			char letter = t.charAt(index);
			first.put(letter, first.getOrDefault(letter,0)+1);
		}

		HashMap<Character, Integer> second = new HashMap<>();
		int start = 0, end = 0, size = s.length(), mapCount = 0; // two pointers
		String result = s;

		while(start < size){
			if(end < size && t.length() > mapCount){
				char letter = s.charAt(end++);
				// check if letter presend in HashMap
				if(first.containsKey(letter)){
					second.put(letter, second.getOrDefault(letter,0)+1);
					mapCount++;
				}
			}else{
				char letter = s.charAt(start++);
				if(first.containsKey(letter)){
					mapCount --;
					if(second.get(letter) == 1)
						second.remove(letter); // remove from hashMap
					else
						second.put(letter, second.get(letter)-1);
				}
			}
			// check the substring if both unique size is same
			if(t.length() == mapCount){
				boolean match = true;
				for(char Key : first.keySet()){
					if(first.get(Key) != second.get(Key)){
						match = false;break;
					}
				}
				if(match){
					if(result.length() > (end - start))
						result = s.substring(start,end);
				}
					
			}
		}

		return result;
	}
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next(), t = sc.next();
        Accio Obj = new Accio();
        System.out.println(Obj.minWindow(s,t));
    }
}
