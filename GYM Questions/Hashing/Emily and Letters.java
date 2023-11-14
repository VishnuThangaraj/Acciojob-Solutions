// https://course.acciojob.com/idle?question=3955fc19-38e5-41e4-a201-ac0dac043dd1

import java.util.*;
import java.io.*;

class Main {
    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> storage = new HashMap<>();
        // Add the characters and its frequency to HashMap
        for(char letter : s.toCharArray())
            storage.put(letter, storage.getOrDefault(letter,0)+1);

        for(int index=0; index<s.length(); index++)
            if(storage.get(s.charAt(index)) == 1)
                return index;

        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(firstUniqChar(s));
    }
}
