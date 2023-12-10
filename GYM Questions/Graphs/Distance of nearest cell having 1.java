// https://course.acciojob.com/idle?question=762aa535-c644-4f62-9ea0-3a7e47a53b78

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
    public static int[][] nearest(int[][] grid){
		int rowSize = grid.length;
        int colSize = grid[0].length;
        int MAX_VALUE = rowSize * colSize;

        if(grid == null || rowSize == 0 || colSize == 0)
            return new int[0][0];

        Queue<int[]> storage = new LinkedList<>();

        // Add grid with 0 to queue
        for(int row = 0; row < rowSize; row++){
            for(int col = 0; col < colSize; col++){
                if(grid[row][col] == 1){
                    grid[row][col] = 0;
                   storage.offer(new int[]{row, col}); 
                }
                else{
                    grid[row][col] = MAX_VALUE;
                } 
            }
        }

        int[][]direction = {{1,0}, {-1,0}, {0,1}, {0,-1}};

        while(!storage.isEmpty()){
            int[]current = storage.poll();

            for(int[] dir : direction){
                int row = current[0] + dir[0], col = current[1] + dir[1];

                //Check if the row and col is in range
                if(row >= 0 && row < rowSize && col >= 0 && col < colSize){
                    if(grid[row][col] > grid[current[0]][current[1]]+1){
                        storage.offer(new int[]{row, col});
                        grid[row][col] = grid[current[0]][current[1]]+1;
                    }
                }
            }
        }

        return grid;
    }

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int[][] grid = new int[n][m];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++){
                    grid[i][j] = Integer.parseInt(S[j]);
                }
            }
            int[][] ans = nearest(grid);
            for(int i = 0; i < ans.length; i++){
                for(int j = 0; j < ans[i].length; j++){
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
        
    }
}
