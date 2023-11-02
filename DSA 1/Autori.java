import java.io.*;
import java.util.*;

// https://course.acciojob.com/idle?question=d1fc7ed6-f24d-4def-9a71-c6b67986af68

public class Main {
	static String autori(String str){
        String result = "";
		for(int i=0;i<str.length();i++){
			char letter = str.charAt(i);
			if(i==0){
				result+=letter;
			}else if(letter == '-'){
				letter = str.charAt(i+1);
				result+=letter;
			}
		}
		return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        String result = autori(str);
        System.out.print(result);        
        System.out.println('\n');
    }
}
