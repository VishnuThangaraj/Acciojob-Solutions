// https://course.acciojob.com/idle?question=abbe8a12-0c3d-4ae2-9ce0-80168daefa36

import java.util.*;

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner read = new Scanner(System.in);
        char letter = read.next().charAt(0);
        read.close();

        if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
            // check if its vowel
            System.out.println(1);
        }else{
            System.out.println(-1);
        }
    }
}
