import java.util.*;

// https://course.acciojob.com/idle?question=6ce9f4de-2a36-4bc9-a16e-88d307d57904

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ans = Solution.sentenceSorting(str);
        System.out.println(ans);
    }
}


class Solution {
    static String sentenceSorting(String str) {
        String[] storage = new String[10];

        StringBuilder current = new StringBuilder();

        for(int index=0; index<str.length(); index++){
            char letter = str.charAt(index);
            if(letter >='a' && letter <='z')
                current.append(letter);
            else if(letter != ' '){
                storage[letter - '0'] = current.toString();
                current.setLength(0);
            }
        }

        String result = "";

        for(int index=0; index<10; index++){
            if(storage[index] != null)
                result += storage[index]+" ";
        }
        return result;
    }
}
