// https://course.acciojob.com/idle?question=2c7e9b8f-3eef-4d99-afd4-88cb7aab2f1f

import java.util.*;
import java.io.*;

class Main {
    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> storage = new HashMap<>();

        for(char letter : s.toCharArray())
            storage.put(letter, storage.getOrDefault(letter, 0)+1);

        for(int index=0; index<s.length(); index++)
            if(storage.get(s.charAt(index)) == 1)
                return index;

        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(firstUniqChar(s));
    }
}
