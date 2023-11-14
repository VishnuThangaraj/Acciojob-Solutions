// https://course.acciojob.com/idle?question=5ef5810d-7449-4222-8e3b-eca8bdad41b4

import java.util.*;

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        Solution.setMatrixZeroes(arr);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
class Solution {
    static void setZero(int[][] matrix, int row, int col){
        matrix[row][col] = -1;
        // Row
        for(int Nrow=0; Nrow<matrix.length; Nrow++){
            if(matrix[Nrow][col] != 0)
                matrix[Nrow][col] = -1;
        }

        // Column
        for(int Ncol=0; Ncol<matrix[0].length; Ncol++){
            if(matrix[row][Ncol] != 0)
                matrix[row][Ncol] = -1;
        }
    }
  static void setMatrixZeroes(int[][] matrix) {
      for(int row=0; row<matrix.length; row++){
          for(int col=0; col<matrix[0].length; col++){
              if(matrix[row][col] == 0)
                  //Set the entire row and column to zero
                  setZero(matrix, row, col);
          }
      }

      // Fixing
      for(int row=0; row<matrix.length; row++)
          for(int col=0; col<matrix[0].length; col++)
              if(matrix[row][col] == -1)
                  matrix[row][col] = 0;
  }
}
