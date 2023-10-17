import java.util.*;

// https://course.acciojob.com/idle?question=3edb452e-df81-47af-b62b-1787b0dbdcf1

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int rows = sc.nextInt(), columns = sc.nextInt();
    int[][] heights = new int[rows][columns];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        heights[i][j] = sc.nextInt();
      }
    }
    sc.close();
    System.out.println(minimumEffortPath(heights));
  }

	static class Pair{
		int distance;
		int row;
		int col;
		//constructor
		Pair(int row, int col, int distance){
			this.row = row;
			this.col = col;
			this.distance = distance;
		}
	}
	public static int minimumEffortPath(int[][] heights) {
		PriorityQueue<Pair> storage = new PriorityQueue<>( (a,b) -> {
			return a.distance - b.distance;
		});
		int h = heights.length; // height
		int w = heights[0].length; // width
		int[][] distance = new int[h][w];

		//fill the distance array with MAXVALUE
		for(int r=0;r<h;r++)
			for(int c=0; c<w; c++)
				distance[r][c] = Integer.MAX_VALUE;

		distance[0][0] = 0; // starting point

		// add the starting point
		storage.offer(new Pair(0, 0, 0));

		int dr[] = {-1, 0, 1, 0}; 
        int dc[] = {0, 1, 0, -1};

		while(!storage.isEmpty()){
			Pair current = storage.poll();
			int Curreffort = current.distance;
			int row = current.row;
			int col = current.col;

			// reached the destination
			if(row == h-1 && col == w-1) return Curreffort;

			// add the other four sides to the queue
			for(int i=0; i<dr.length; i++){
				int newR = row + dr[i]; // new Row
				int newC = col + dc[i];

				// check for validity of the row and col
				if(newR >= h || newR <0 || newC >= w || newC < 0)
					continue;

				int effort = Math.max(Math.abs(heights[newR][newC] - heights[row][col]),Curreffort);

				if(effort < distance[newR][newC]){
					distance[newR][newC] = effort;
					storage.offer(new Pair(newR, newC, effort));
				}
			}
		}
		return 0; // unreachable 
	}
}
