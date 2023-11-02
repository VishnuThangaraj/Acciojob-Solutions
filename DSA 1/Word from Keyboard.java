import java.io.*;
import java.util.*;

// https://course.acciojob.com/idle?question=b052d53d-27ab-4b53-86d3-9850fd41e542

public class Main {

	static boolean wordCheck(String word){
		String[]key={"qwertyuiop","asdfghjkl","zxcvbnm"};

		for(int i=0;i<key.length;i++){
			String Taken = key[i];
			int count = 0;
			for(int j=0;j<word.length();j++){
				char letter = word.charAt(j);
				for(int k=0;k<Taken.length();k++){
					char fin = Taken.charAt(k);
					if(fin == letter){
						count++;
					}
				}
			}
			if(count == word.length()){
				return true;
			}
		}
		return false;
	}

    static ArrayList<String> getStrings(ArrayList<String> arr)
    {
		ArrayList<String> result = new ArrayList();
		for(int i=0;i<arr.size();i++){
			String word = arr.get(i);
			boolean check = wordCheck(word);
			if(check == true){
				result.add(word);
			}
		}

		return result;
    }

    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
    
        int n = sc.nextInt();
        ArrayList<String> arr = new ArrayList<String>();
        for(int i = 0; i < n; i++){
            String s = sc.next();
            arr.add(s);
        }

        ArrayList<String> result = getStrings(arr);
        for(int i = 0; i < result.size(); i++){
            System.out.println(result.get(i));
        }
    }
}
