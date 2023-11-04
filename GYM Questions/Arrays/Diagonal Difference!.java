import java.io.*;
import java.util.*;

// https://course.acciojob.com/idle?question=29252997-01f8-4628-a8fb-984c366aa8f6

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int [][]mat=new int[n][n];
        for(int i=0;i<n;++i){
            for(int j=0;j<n;++j){
                mat[i][j]=sc.nextInt();
            }
        }

        diagonalDifference(mat,n);  
        System.out.println('\n');
    }

    public static void diagonalDifference(int [][]mat, int n) {
        // your code here
        int leftCross = 0, rightCross = 0;

        for(int row=0; row<n; row++){
            for(int col=0; col<n; col++){
                if(row == col) leftCross += mat[row][col];
                if(row+col == n-1) rightCross += mat[row][col];
            }
        }
        // Print the result
        System.out.println(Math.abs(leftCross - rightCross));
    }
}
