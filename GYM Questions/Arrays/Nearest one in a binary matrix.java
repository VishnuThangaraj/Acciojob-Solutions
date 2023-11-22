// https://course.acciojob.com/idle?question=5ebeb2e9-0c47-4fd9-a7b9-5fbb1ecbe30b

import java.util.*;
import java.lang.*;
import java.io.*;
class Main
{
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
            Solution obj = new Solution();
            int[][] ans = obj.nearest(grid);
            for(int i = 0; i < ans.length; i++){
                for(int j = 0; j < ans[i].length; j++){
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
        
    }
}
class Solution{
    // Funtion to search the nearest One
    public int nearestOne(int row, int col, int n, int m, int[][]grid, boolean[][] visited, int path){
        // Base Case
        if(row < 0 || row >=n || col < 0 || col >= m || visited[row][col])
            return Integer.MAX_VALUE;

        if(grid[row][col] == 1) return path;

        // mark as visited
        visited[row][col] = true;
        int minPath = Integer.MAX_VALUE;

        minPath = Math.min(minPath, nearestOne(row+1, col, n, m, grid, visited, path+1)); // UP
        minPath = Math.min(minPath, nearestOne(row-1, col, n, m, grid, visited, path+1)); // DOWN
        minPath = Math.min(minPath, nearestOne(row, col-1, n, m, grid, visited, path+1)); // LEFT
        minPath = Math.min(minPath, nearestOne(row, col+1, n, m, grid, visited, path+1)); // RIGHT

        // Backtracking
        visited[row][col] = false;

        return minPath;
    }
    public int[][] nearest(int[][] grid){
        int n = grid.length, m = grid[0].length;
        boolean[][] visited = new boolean[n][m];
        int[][] result = new int[n][m];

        for(int row=0; row<n; row++){
            for(int col=0; col<m; col++){
                if(grid[row][col] == 0)
                    result[row][col] = nearestOne(row, col, n, m, grid, visited, 0);
            }
        }

        return result;
    }
}
