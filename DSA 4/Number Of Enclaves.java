import java.util.*;

// https://course.acciojob.com/idle?question=1cc7969f-f49d-43ab-9f75-84d3921b4b4f

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt(), n = sc.nextInt();
    int[][] grid = new int[m][n];
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        grid[i][j] = sc.nextInt();
      }
    }
    sc.close();
    System.out.println(numEnclaves(grid));
  }

  public static void destroy(int[][]grid, int row, int col){
	  if(row<0 || row>=grid.length || col<0 || col>=grid[0].length || grid[row][col] == 0){
		  return;
	  }
	  //destroy the unsafe land
	  grid[row][col] = 0;

	  destroy(grid, row, col+1); // left
	  destroy(grid, row, col-1); // right
	  destroy(grid, row+1, col); // down
	  destroy(grid, row-1, col); // up
  }

  public static int numEnclaves(int[][] grid) {
      int col = grid[0].length;
	  int row = grid.length;
	  int safeCount = 0;

	  //TRAVEL ON THE BOUNDRY AND DESTROY THE UN-SAFE LANDS
	  // top
	  for(int j=0; j<col; j++){
		  if (grid[0][j] == 1) destroy(grid,0,j);
	  }

	  // bottom
	  for(int j=0; j<col; j++){
		  if (grid[row-1][j] == 1) destroy(grid,row-1,j);
	  }

	  // left
	  for(int i=0; i<row; i++){
		  if (grid[i][0] == 1) destroy(grid,i,0);
	  }

	  // right
	  for(int i=0; i<row; i++){
		  if (grid[i][col-1] == 1) destroy(grid,i,col-1);
	  }

	  // count the safe lands
	  for(int i=0; i<row; i++){
		  for(int j=0;j<col;j++){
			  if(grid[i][j] == 1) safeCount++;
		  }
	  }

	  return safeCount;
  }
}
