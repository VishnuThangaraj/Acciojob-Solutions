import java.util.*;
import java.io.*;

// https://course.acciojob.com/idle?question=95a415cf-c6d0-4737-90c6-ef7a0ef64021

public class Main {
	static void compressedString(String s) {
		char previous = '-';int count = 1;
		char letter ;
        for(int i=0;i<=s.length();i++){
			if(i==s.length()){
				letter = '-';
			}else{
				letter = s.charAt(i);
			}
			
			if(letter == previous){
				count++;
			}else{
				if(count > 1){
					System.out.print(count);
					count=1;
				}
				if(i==s.length()){
					continue;
				}
				System.out.print(letter);
				
			}
			previous = letter;
		}
     }
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-- > 0){
            String s = br.readLine();
            compressedString(s);
            System.out.println();
        }
    }
}
