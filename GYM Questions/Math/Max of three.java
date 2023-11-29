// https://course.acciojob.com/idle?question=aa6ff6e3-cb6c-4092-a572-3f9e1185fb97

import java.util.*;
import java.io.*;

class Solution{
        static int solve(int n,int m,int k){
            return Math.max(Math.max(n,m), k);
        }
}
public class Main {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();

        for(int i=0;i<size; i++){
            int n = input.nextInt();
            int m = input.nextInt();
            int k = input.nextInt();
            System.out.println(Solution.solve(n,m,k));
        }
    }
}
