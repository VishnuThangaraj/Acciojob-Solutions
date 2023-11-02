import java.io.*;
import java.util.*;

// https://course.acciojob.com/idle?question=6dc8bb42-64d1-4114-bcc4-f138ed5373c3

public class Main {

    static ArrayList<Integer> arrayGenerator(String s){
		ArrayList<Integer> result = new ArrayList();
		String[]relase = s.split(",");
		for(int i=0;i<relase.length;i++){
			int ans = Integer.parseInt(relase[i]);
			result.add(ans);
		}

		return result;
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        input.nextLine();
        while (t-- > 0) {
            String s = input.nextLine();
            ArrayList<Integer> ans = arrayGenerator(s);
            System.out.print("[");
            for (int i = 0; i < ans.size(); i++) {
                System.out.print(ans.get(i));
                if (i != ans.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
        
    }
}
