import java.util.*;

// https://course.acciojob.com/idle?question=92922cce-7d7b-407a-8a03-dbfff4024918

public class Main {
    
     static char MaximumFrequencyChar(String s) {
		 char maximum = s.charAt(0);
		 int max = Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
			char present = s.charAt(i);
			int count = 1;
			for(int j=0;j<s.length();j++){
				char now = s.charAt(j);
				if(present == now){
					count++;
				}
			}
			// System.out.print(count);
			if(count>max){
				maximum = present;
				max = count;
			}else if(count == max){
				if(present < maximum){
					maximum = present;
				}
			}
		}
		 return maximum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(MaximumFrequencyChar(s));
    }
}
