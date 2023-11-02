import java.util.*;

// https://course.acciojob.com/idle?question=de4ea74f-9003-43a2-aaa1-e5432a31b39e

public class Main {
    
    static void ptice(int n, String key) {
        int[]scores = new int[3];
		String Adrian = "ABC";
		String Bruno = "BABC";
		String Goran = "CCAABB";

		for(int i=0;i<n;i++){
			char keyAns = key.charAt(i);

			char AdrianAnswer = Adrian.charAt(i%Adrian.length());
			if(AdrianAnswer == keyAns){
				scores[0]++;
			}

			char BrunoAnswer = Bruno.charAt(i%Bruno.length());
			if(BrunoAnswer == keyAns){
				scores[1]++;
			}

			char GoranAnswer = Goran.charAt(i%Goran.length());
			if(GoranAnswer == keyAns){
				scores[2]++;
			}
		}

		int max =0;
		for(int i=0;i<scores.length;i++){
			if(scores[i]>max){
				max = scores[i];
			}
		}
		System.out.println(max);
		if(scores[0]==max){
			System.out.println("Adrian");
		}
		if (scores[1]==max){
			System.out.println("Bruno");
		}
		if (scores[2]==max){
			System.out.println("Goran");
		}
		
    }  
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        String str = sc.next();
        ptice(n, str);
        sc.close();
    }
}
