import java.util.*;

// https://course.acciojob.com/idle?question=fbec8270-5a5c-4379-8d39-58dab2b6b8cf

public class Main {

  static int goodStrings(String s, String[] A, int n) {
    int count = 0;

	  for(int i=0;i<A.length;i++){
		  String word = A[i];
		  int InnerCount = 0;
		  for(int j=0;j<word.length();j++){
			  char letter = word.charAt(j);
			  boolean check = false;
			  for(int k=0;k<s.length();k++){
				  char letter2= s.charAt(k);
				  if(letter == letter2){
					  check = true;break;
				  }
			  }
			  if (check == true){
				  InnerCount++;
			  }
		  }
		  // System.out.println(InnerCount);
		  if(InnerCount == word.length()){
			  count++;
		  }
	  }
	  return count;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      String s = sc.next();
      int n = sc.nextInt();
      String[] A = new String[n];
      for (int i = 0; i < n; i++) {
        A[i] = sc.next();
      }

      System.out.println(goodStrings(s, A, n));
    }
  }
}
