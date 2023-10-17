import java.util.*;

//https://course.acciojob.com/idle?question=e469460a-11cf-480b-b950-02efad208e6b

public class Main {
    public static boolean SearchA2DMatrix(int[][] mat, int x) {
        //use recursive binary search for ease of code
		//matrix, target, row, start index, end index
		return binarySearch2D(mat,x,0,0,mat[0].length-1);
    }
	
	//recursive 2Dbinary search
	public static boolean binarySearch2D(int[][]matrix, int target, int row, int start, int end){
		if(row == matrix.length || start > end){
			 //row out of bound, start crossed end == element not found
			return false;
		}
		int mid = end-start;

		//check the target lies on the particular row
		if(matrix[row][start] <= target && matrix[row][end] >= target){//target may occur in the row
			//search in the particular range
			if(matrix[row][mid] == target){
				return true; //target found
			}
			if(matrix[row][mid] > target){ //search on left half
				return binarySearch2D(matrix,target,row,start, mid-1);
			}
			//search right half
			return binarySearch2D(matrix,target,row,mid+1, end);
		}
		//move to next Row
		return binarySearch2D(matrix,target,row+1,start, end);
	}
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] mat = new int[m][n];
        for(int i = 0; i< m; i++) {
            for(int j = 0; j<n; j++)
                mat[i][j] = sc.nextInt();
        }
        int x = sc.nextInt();
        if(SearchA2DMatrix(mat, x))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
