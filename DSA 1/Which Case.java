import java.util.*;

// https://course.acciojob.com/idle?question=8aaa8944-6367-492e-b9e4-24e5e47b41a7

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
		// Your code here
		sc.close();

		if(ch >= 'a' && ch <= 'z'){ // small letter
			System.out.println(0);
		}else if(ch >= 'A' && ch <= 'Z'){ // capital letter
			System.out.println(1);
		}else{// not alphabet
			System.out.println(-1);
		}
    }
}
