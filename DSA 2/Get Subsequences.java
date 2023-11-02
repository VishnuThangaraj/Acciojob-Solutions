import java.io.*;
import java.util.*;

// https://course.acciojob.com/idle?question=9ecd1991-1197-4872-a44d-aff68aa6f20b

public class Main {
    public static ArrayList<String> generateSubsequences(String processed, String unProcessed)
    {
        if(unProcessed.isEmpty()){
			ArrayList<String> LastProcessed = new ArrayList<>(); //new arrayList
			LastProcessed.add(processed);
			return LastProcessed;
		}
		ArrayList<String> SequenceStorage = new ArrayList<>();

		SequenceStorage.add(processed);
		for(int i=0;i<unProcessed.length();i++){
			char letter = unProcessed.charAt(i);
			SequenceStorage.addAll(generateSubsequences(processed+letter,unProcessed.substring(i+1)));
		}
		return SequenceStorage;
    }
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        s = sc.nextLine();
        ArrayList<String> res = generateSubsequences("",s);
		Collections.sort(res);
        for(int i=1;i<res.size();i++){
            System.out.println(res.get(i));
        }
    }
}
