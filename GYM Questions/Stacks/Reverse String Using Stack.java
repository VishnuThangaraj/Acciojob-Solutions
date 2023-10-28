// https://course.acciojob.com/idle?question=6769c6d4-2193-4378-b704-08ab89c117bf

import java.util.*;

class Accio{
    static String reverseStringStack(String s){
        Stack<Character> storage = new Stack<>();

        // Add to Stack
        for(int index=0; index<s.length(); index++)
            storage.push(s.charAt(index));

        String result = "";

        // Remove from stack and reverse the string
        while(!storage.isEmpty())
            result += storage.pop();

        return result;
    }
}

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Accio obj = new Accio();
        String ans = obj.reverseStringStack(s);
        System.out.println(ans);
    }
}
