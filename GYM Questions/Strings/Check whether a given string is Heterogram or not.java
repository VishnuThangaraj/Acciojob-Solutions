// https://course.acciojob.com/idle?question=0f0c86c7-d3d5-41f7-a6ab-f93155ea5de4

import java.util.*;

class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        HashSet<Character> storage = new HashSet<>();

        for(char letter : word.toCharArray()){
            if(storage.contains(letter)){
                System.out.println("No");
                return;
            }
            storage.add(letter);
        }

        System.out.println("Yes");
    }
}
