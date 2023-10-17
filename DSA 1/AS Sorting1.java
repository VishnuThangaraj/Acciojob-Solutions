import java.util.*;

// https://course.acciojob.com/idle?question=f9d75468-5849-4ca5-8152-8aca40aeae07

class Solution{

    public static void sortCol(int[][] mat, int N, int M){

		for(int k=0;k<mat[0].length;k++){
			for(int i=0;i<mat.length-1;i++){
				for(int j=0;j<N-i-1;j++){
					if(mat[j][k]>mat[j+1][k]){
						int temp = mat[j+1][k];
						mat[j+1][k]=mat[j][k];
						mat[j][k]=temp;
					}
				}
			}
		}

		for(int a=0;a<mat.length;a++){
			for(int b=0;b<mat[0].length;b++){
				System.out.print(mat[a][b]+" ");
			}
			System.out.println();
		}
    }
}

public class Main {
        public static void main(String[] args) throws Throwable {
         Scanner sc=new Scanner(System.in); 
          int n=sc.nextInt();
          int m=sc.nextInt();
          int[][] mat =new int[n][m]; 
          for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                mat[i][j] = sc.nextInt();
            }
          } 
          Solution.sortCol(mat, n, m);
      
        }
}
