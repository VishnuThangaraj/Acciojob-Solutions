import java.util.*;

// https://course.acciojob.com/idle?question=4fdadf76-9d25-43f3-a50f-6889bcdd70af

public class Main {

  public static void main(String[] args) throws Throwable {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    String str = sc.nextLine();
    toggleCase(n, str);
  }

  static void toggleCase(int n, String str) {
    for(int i=0;i<str.length();i++){
		char letter = str.charAt(i);
		String result = "";
		if(letter>='a' && letter<='z'){
			result += (char)(letter-'a'+'A');
			System.out.print(result);
		}else if(letter>='A' && letter<='Z'){
			result+= (char)(letter-'A'+'a');
			System.out.print(result);
		}else{
			System.out.print(letter);
		}
	}
  }
}
