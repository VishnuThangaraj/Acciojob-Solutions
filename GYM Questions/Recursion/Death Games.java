import java.util.*;

// https://course.acciojob.com/idle?question=df08a8b0-60db-4bdb-9b0b-38b7755086e1

class Solution {

    public static int deathGame(int n, int k) {
       return josephus(n,k)+1;
    }

	public static int josephus(int n, int k){
		return n == 1 ? 0 : ((josephus(n-1, k))+k)%n;
	}
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        int k= sc.nextInt();
        Solution Obj = new Solution();
        System.out.println(Obj.deathGame(N,k));

    }
}
