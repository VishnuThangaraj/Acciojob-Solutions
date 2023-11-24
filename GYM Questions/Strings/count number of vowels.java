// https://course.acciojob.com/idle?question=6249648f-b517-4e21-8299-6c57b9f7eb05

import java.util.*;

class Solution {
    public static int countVowels(String str){
        int count = 0;
        str = str.toLowerCase();

        for(char letter : str.toCharArray()){
            if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
                count++;
            }
        }

        return count;
    }
    
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();
        
        System.out.println(Solution.countVowels(input));
    }
}

