import java.util.*;

// https://course.acciojob.com/idle?question=ca7446b3-0ba1-43a4-a460-56c8de96594a

public class Main {
	static void SubString(String str) {
		int size = str.length();
        for(int i=0;i<=size;i++){
			
			for(int j=i+1;j<=size;j++){
				String word = "";
				word+=str.substring(i,j);
				System.out.println(word);
			}
		}
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        SubString(str);
    }
}
