import java.util.*;

// https://course.acciojob.com/idle?question=243312c4-baad-471f-8a01-650220d23d4d

class Main {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      String s = sc.next();
      camelCase(s);
      System.out.println(); 
      
    }
  }

  static void camelCase(String s) {
    int size = s.length();
	  for(int i=0;i<size;i++){
		  char letter = s.charAt(i);
		  String newLetter = "";
		  if(letter=='_'){
			  i++;
			  letter = s.charAt(i);
			 newLetter += (char)(letter - 'a'+'A');
			  System.out.print(newLetter);
		  }else{
			  System.out.print(letter);
		  }
	  }
  }
}
