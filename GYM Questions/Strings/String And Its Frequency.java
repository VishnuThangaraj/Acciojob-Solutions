// https://course.acciojob.com/idle?question=358686d3-adbf-4c3d-9dc7-1c4440021b62

import java.util.*;

class Accio {
    public String StringFreq(String s) {
        HashMap<Character, Integer> storage = new HashMap<>();
        // Add character and it frequency to HashMap
        for(char letter : s.toCharArray()){
            storage.put(letter, storage.getOrDefault(letter,0)+1);
        }

        String result = "";
        for(char letter : s.toCharArray()){
            if(storage.containsKey(letter)){
                result += letter;
                result += storage.get(letter);
                storage.remove(letter);
            }
        }

        return result;
    }
}

public class Main {
    public static void main(    String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Accio Obj = new Accio();
        System.out.println(Obj.StringFreq(s));
    }
}
