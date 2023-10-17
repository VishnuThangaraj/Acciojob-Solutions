import java.util.*;

// https://course.acciojob.com/idle?question=5e1f2cc6-85c6-4a3e-852f-a9c03fffecbc

class Pair{
    int x; int y;
    
    Pair(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            t--;
            int n=sc.nextInt();
            int x=sc.nextInt();
            int[][] arr = new int[n][n];
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    arr[i][j] = sc.nextInt();
                }
            }
            Pair p = search(arr, x);
            System.out.println(p.x+" "+p.y);
        }
    }

	public static int binarySearch(int[][]matrix, int target, int row, int start ,int end){
		if(start > end){
			return -1; // target not found
		}

		int mid = start + (end - start) / 2;

		if(matrix[row][mid] == target)
			return mid; // target found... return the index

		if(target < matrix[row][mid]) //search left region(before mid)
			return binarySearch(matrix,target,row,start,mid-1);

		return binarySearch(matrix,target,row,mid+1,end); //search right region (after mid)
	}

    public static Pair search(int[][] matrix, int x) {
        // Apply binary search in each row to reduce the time complexity to logN
		Pair result = new Pair(-1,-1);

		for(int row = 0; row<matrix.length; row++){
			result.y = binarySearch(matrix,x,row,0,matrix[0].length-1);
			if(result.y != -1){
				result.x = row; // target found
				break;
			}	
		}

		return result;
      }
}
