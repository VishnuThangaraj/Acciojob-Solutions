import java.util.*;

// https://course.acciojob.com/idle?question=7d76339a-52d2-4570-b87e-205419e3dc62

public class Main {
    public static char LowerUpper(char ch) {
        char upper = 'U';
		char lower = 'L';

		if(ch>='A' && ch<='Z'){
			return upper;
		}
		return lower;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        System.out.println(LowerUpper(ch));
    }
}
