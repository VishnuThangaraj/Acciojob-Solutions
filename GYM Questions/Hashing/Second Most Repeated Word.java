import java.io.*;
import java.util.*;

// https://course.acciojob.com/idle?question=3a2234ff-c3ce-482d-a32d-96fe8a5985de

public class Main {
	public static String findWord(String[] words, int n){
		HashMap<String,Integer> storage = new HashMap<>();
		int max = -1;
		//add words and its count to hashMap
		for(String word : words){
			storage.put(word, storage.getOrDefault(word, 0)+1);
			max = Math.max(max, storage.get(word));
		}

		// find the second max
		int Smax = -1;
		String result = "";
		
		for(String key : storage.keySet()){
			int current = storage.get(key);
			if(current > Smax && current < max){
				//potential answer found
				result = key;
				Smax = current;
			}	
		}

		return result;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] words = new String[n];
		for(int i=0; i<n ;i++){
			words[i] = sc.next();
		}

		String result = findWord(words, n);

		System.out.println(result);
	}
}
