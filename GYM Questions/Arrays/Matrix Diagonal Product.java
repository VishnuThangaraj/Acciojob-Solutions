// https://course.acciojob.com/idle?question=820babd6-75fe-4d0a-be01-4e025fd055b4


import java.util.*;
import java.io.*;

public class Main {
    public static int getSum(int[][] matrix, int n){
        // Calculate the Diagonal Product
        int sum = 1;
        for(int row=0; row<n; row++){
            for(int col=0; col<n; col++){
                if(row == col || row+col == n-1){
                    sum *= matrix[row][col];
                }
            }
        }

        return sum;
    }
    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int[][] matrix = new int[n][n];
        
        for(int row=0; row<n; row++){
            for(int col=0; col<n; col++){
                matrix[row][col] = read.nextInt();
            }
        }
        read.close();

        int result = getSum(matrix, n);
        System.out.println(result);
    }
}
