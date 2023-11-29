// https://course.acciojob.com/idle?question=94f702de-a14a-48e3-8b2a-bb9a026c8f99

import java.io.*;
import java.util.*;

class Solution {
    public void characterFrequencies(String s) {
        HashMap<Character, Integer> storage = new HashMap<>();
        // add characters and its frequency to HashMap
        for(char letter : s.toCharArray())
            storage.put(letter, storage.getOrDefault(letter,0)+1);

        // Print the result
        System.out.println(storage.size()); // number of unique Characters
        for(char letter : s.toCharArray()){
            if(storage.containsKey(letter)){
                System.out.print(storage.get(letter)+" ");
                storage.remove(letter);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            Solution Obj = new Solution();
            Obj.characterFrequencies(s);
    }
}
