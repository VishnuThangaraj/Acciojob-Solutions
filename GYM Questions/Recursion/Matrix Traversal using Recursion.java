import java.util.*;

// https://course.acciojob.com/idle?question=44959323-6b15-4725-9312-4a0b7fb532c3

class Solution {
    public void traversal(int[][] mat, int row, int col){
        if(row >= mat.length) return;
        if(col >= mat[0].length ){
            System.out.println();
            traversal(mat, row+1,0);
            return;
        }
        System.out.print(mat[row][col]+" ");
        traversal(mat,row,col+1);
    }
    
    public void MatTraverseRecur(int[][] mat) {
        traversal(mat, 0, 0);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), n = sc.nextInt();
        int[][] mat = new int[m][n];

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++)
                mat[i][j] = sc.nextInt();
        }
	    Solution Obj = new Solution();
        Obj.MatTraverseRecur(mat);
    }
}
