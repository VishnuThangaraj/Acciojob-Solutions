import java.util.*;
import java.lang.*;
import java.io.*;

// https://course.acciojob.com/idle?question=91d28247-bbd9-4246-8293-2791590ce701

public class Main
{
    public static void findFirstAppearance(String str){
        // HashSet to store the characters of the string
        HashSet<Character> storage = new HashSet<>();
        String result = "-1";

        for(int index=str.length()-1; index>=0; index--){
            char letter = str.charAt(index);

            if(storage.contains(letter)){
                result = letter+"";
            }
            //Add to HashSet
            storage.add(letter);
        }

        System.out.println(result);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        for(int loop=0; loop<count; loop++){
            String str = sc.next();

            findFirstAppearance(str);
        }

        sc.close();
	}
}
