import java.util.*;
import java.lang.*;
import java.io.*;

// https://course.acciojob.com/idle?question=0bfe93c6-5411-4ac5-99db-34a0a21c940a

class Main {
   
    public static String reverseWords(String s)
    {
		String temp = "";
		int j=s.length();
        for(int i=j-1;i>=0;i--){
			char letter = s.charAt(i);
			if(letter == ' '){
				temp += (s.substring(i+1,j))+" ";
				j=i;
			}else if(i==0){
				temp += s.substring(i,j);
			}
		}
		return temp;
    } 
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String p = sc.nextLine();
        while (t > 0) {
            String s = sc.nextLine();
            System.out.println(reverseWords(s));
            t--;
        }
    }
}
