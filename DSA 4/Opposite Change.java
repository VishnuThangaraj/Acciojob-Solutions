import java.util.*;

// https://course.acciojob.com/idle?question=52f1c6ae-4f8f-4237-8190-ec3806f730fa

class Solution {
 
    public int Opposite(int n) {
        String binary = "";
		// convert to binary
		while(n>0){
			binary = n%2 + binary;
			n/=2;
		}

		// flip the bits
		String flipped = "";
		for(int i=0;i<binary.length(); i++){
			if(binary.charAt(i) == '1') flipped+='0';
			else flipped+='1';
		}

		int convert = Integer.parseInt(flipped,2);

		return convert;
		
    }
}
 
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        sc.close();
        Solution Obj = new Solution();
        System.out.print(Obj.Opposite(n));
    }
}
