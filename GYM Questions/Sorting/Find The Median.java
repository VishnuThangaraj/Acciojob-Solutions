import java.io.*;
import java.util.*;

// https://course.acciojob.com/idle?question=01b4282d-bfae-4beb-9521-88e5b9a131f3
 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
         int n = Integer.parseInt(br.readLine().trim());
         String[] arr_a = br.readLine().split(" ");
         int[] a = new int[n];
         for(int i_a = 0; i_a < arr_a.length; i_a++)
         {
         	a[i_a] = Integer.parseInt(arr_a[i_a]);
         }
         Solution Obj = new Solution();
         int out_ = Solution.solve(a);
         System.out.println(out_);
 
         wr.close();
         br.close();
    }
}
class Solution {
    static int solve(int[] a){
		// calculate the mid
       int mid = (a.length / 2) ;

		// sort the array
		   Arrays.sort(a);

		// return the mid element
		return a[mid];
    }
}
