import java.util.*;
import java.lang.*;
import java.io.*;

// https://course.acciojob.com/idle?question=89d49818-69fe-4020-8763-4651f1a6f6ae

class Solution{
    static int numberOfIslands(int[][] grid, int n, int m){
        boolean[][]visited = new boolean[n][m];
		int count = 0;

		for(int row=0; row<n; row++){
			for(int col=0; col<m; col++){
				// visit all the un-visited islands (1)
				if(!visited[row][col] && grid[row][col] == 1){
					DFS(grid,visited,row,col);
					count++; // island found
				}
			}
		}

		return count;
    }

	static void DFS(int[][]grid, boolean[][]visited, int row, int col){
		if(row<0 || row>=grid.length || col<0 || col>=grid[0].length || grid[row][col] == 0){
			  return;
		  }
		if(visited[row][col]) return;
		
		visited[row][col] = true; //mark visited

	  DFS(grid, visited, row, col+1); // left
	  DFS(grid, visited, row, col-1); // right
	  DFS(grid, visited, row+1, col); // down
	  DFS(grid, visited, row-1, col); // up

	  // check the diagonals too
		DFS(grid, visited,row-1,col-1); //up-left
		DFS(grid, visited,row-1,col+1); //up-right
		DFS(grid, visited,row+1,col-1); //down-left
		DFS(grid, visited,row+1,col+1); //down-right
		
	}
}

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
        int n = sc.nextInt();
    	int M[][] = new int[m][n];
		for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                M[i][j] = sc.nextInt();
		    }
		}
		System.out.println(Solution.numberOfIslands(M, m, n));
	}
}
