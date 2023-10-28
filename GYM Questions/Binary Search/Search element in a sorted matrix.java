import java.io.*;
import java.util.*;

// https://course.acciojob.com/idle?question=f8b8153b-a3fa-4797-8860-bdb51e7c160a

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int target = sc.nextInt();
        int[][] mat = new int[n][m];

        for(int i=0;i<n;i++)
            for(int j=0; j<m;j++)
                mat[i][j] = sc.nextInt();

        System.out.println(binarySearch(mat,target,n,m));
	}

    public static String binarySearch(int[][]mat, int target, int row, int col){
        // find the target
        for(int r=0;r<row;r++){
            if(target >= mat[r][0] && target<= mat[r][col-1]){
                int start = 0, end = col-1;

                while(start <= end){
                    int mid = start + (end - start)/2;
                    if(mat[r][mid]==target) return "TRUE";

                    if(mat[r][mid] > target) end = mid-1;
                    else start = mid+1;
                }
            }
        }
        return "FALSE";
    }
}
