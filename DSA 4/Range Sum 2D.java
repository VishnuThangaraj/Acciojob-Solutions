import java.util.*;

// https://course.acciojob.com/idle?question=e0420aa8-f4e9-4a99-abe5-0cf0b05b3ce1

class Pair {
    int row1;
    int row2;
    int col1;
    int col2;
}

class Solution {

    public List<Integer> solve(int matrix[][], Pair query[]) {
        
		int n = matrix.length;
		int m = matrix[0].length;
		List<Integer> result = new ArrayList<>();
		
		int[][]prefix = new int[n][m];
		// create prefix sum for 2D-array
		for(int row =0; row<n; row++){
			for(int col=0; col<m; col++){
				// (current + left + up ) - up-left(diagonally)
				int left = (col > 0) ? prefix[row][col-1] : 0;
				int up = (row > 0) ? prefix[row-1][col] : 0;
				int diagonal = (row>0 && col>0) ? prefix[row-1][col-1] : 0;
				//update the prefix matrix
				prefix[row][col] = (matrix[row][col] + left + up) - diagonal;
			}
		}

		// CALCULATE THE QUERIES
		for(Pair q : query){
			// ANS = (A-B-C)+D
			int A = prefix[q.row2][q.col2];
			int B = (q.col1 > 0) ? prefix[q.row2][q.col1-1] : 0;
			int C = (q.row1 > 0) ? prefix[q.row1-1][q.col2] : 0;
			int D = (q.row1>0 && q.col1>0) ? prefix[q.row1-1][q.col1-1] : 0;

			//add the answer to arraylist
			result.add((A-B-C)+D);
		}
       return result; 
    }
}

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int matrix[][] = new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            matrix[i][j]=sc.nextInt();
        }
        int q = sc.nextInt();
        Pair query[] = new Pair[q];

        Solution obj = new Solution();
        for (int i = 0; i < q; i++) {
            Pair p=new Pair();
            p.row1 = sc.nextInt();
            p.col1 = sc.nextInt();
            p.row2 = sc.nextInt();
            p.col2 = sc.nextInt();
            query[i]=p;
        }
        List<Integer> ans = obj.solve(matrix, query);
        for(int x: ans)
        System.out.println(x);
        sc.close();
    }
}
