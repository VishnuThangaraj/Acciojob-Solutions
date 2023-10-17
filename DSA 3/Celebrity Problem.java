import java.io.*;
import java.util.*; 

// https://course.acciojob.com/idle?question=aa54f234-9dd5-4031-af3d-819afac164f7

class Main{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M[][] = new int[N][N];
        for(int i=0; i<N; i++)
            for(int j=0; j<N; j++)
                M[i][j] = sc.nextInt();
        System.out.println(new Solution().findCelebrity(M,N));
    } 
} 
class Solution
{ 
    int findCelebrity(int M[][], int n){
       // This function returns the celebrity
        // index 0-based (if any)
 
        int j = 0, i = n - 1;
        while (j < i) {
            if (M[i][j] == 1) // i knows j
                i--;
            else // i doesnt know j so j cant be celebrity
                j++;
        }
        // j points to our celebrity candidate
        int candidate = j;
 
        // Now, all that is left is to check that whether
        // the candidate is actually a celebrity i.e: he is
        // known by everyone but he knows no one
		int d =0;
        for (d = 0; d < n; d++) {
            if (d != candidate) {
	                if (M[d][candidate] == 0  || M[candidate][d] == 1)
                    return -1;
            }
        }
        // if we reach here this means that the candidate
        // is really a celebrity
        return candidate;
    }
}
