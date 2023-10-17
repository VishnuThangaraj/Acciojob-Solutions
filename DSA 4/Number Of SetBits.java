import java.util.*;

// https://course.acciojob.com/idle?question=99b2b8d9-d830-4b9a-a61d-25dc5bc94ab4

class Solution {
    public int setBits(int n) {
        int count = 0; //count of set bits

		while(n > 0){
			if((n & 1) == 1) count++;
			n = n >> 1;
		}

		return count;
    }
}

public class Main {

    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution Obj = new Solution();
        sc.close();
        System.out.println(Obj.setBits(n));
    }
}
