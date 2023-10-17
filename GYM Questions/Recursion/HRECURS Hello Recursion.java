import java.io.*;
import java.util.*;

// https://course.acciojob.com/idle?question=5ab45cab-be98-43ac-b1df-1126cb91ab77

public class Main {
    public static int sum(int a[], int i){
		if(i == 0) return a[0];
		
        return a[i] + sum(a, i-1);
    }
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int testcases = input.nextInt();
        for(int testcase = 1; testcase <= testcases; testcase++){
            int n = input.nextInt();
            int a[] = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = input.nextInt();
            }
            System.out.println("Case " + testcase + ": " + sum(a, n - 1));
        }
    }
}
