import java.io.*;
import java.util.*;

//https://course.acciojob.com/idle?question=45c7b193-3582-4507-858f-5c83e005c215

public class Main {
    static String strangeString(int n) {
		StringBuilder result = new StringBuilder("");
		int num = 96;
		for(int i=0;i<n;i++){
			num = (num>121) ? num-25 : num+1;
			char letter = (char)num;
			
			if(i%2==0){
				result.insert(0,letter);
			}else{
				result.append(letter);
			}
		}
		String Fresult = result.toString();
		return Fresult;
    }
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0){
            int n = input.nextInt();
            System.out.println(strangeString(n));
        }
    }
}
