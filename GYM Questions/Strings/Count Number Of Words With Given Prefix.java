import java.util.Scanner;

// https://course.acciojob.com/idle?question=d01618e9-3c06-4ce2-a8e3-437385be2450

public class Main {

    public static int countPrefixMatchingWords(String[] words, String prefix) {
        int count = 0;

		for(String word : words){
			//starts with prefix
			if(word.startsWith(prefix)) count++;
		}

		return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            String word = scanner.next();
            words[i] = word;
        }
        String prefix = scanner.next();
        int result = countPrefixMatchingWords(words, prefix);
        System.out.println(result);
    }
}
