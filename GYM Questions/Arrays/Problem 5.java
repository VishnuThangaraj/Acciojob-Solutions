// https://course.acciojob.com/idle?question=adbe9d2d-b615-43aa-95e7-58b29fee8358

import java.util.*;

class Accio{
    static int Problem5(int n,int[][] mat){
        int sum = 0;

        int index = 0;
        while(index < n){
            sum += mat[index][index];
            index++;
        }

        return sum;
    }
}

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        for(int i=0;i<n;++i){
            for(int j=0;j<n;++j){
                mat[i][j] = sc.nextInt();
            }
        }
        Accio obj = new Accio();
        int ans = obj.Problem5(n,mat);
        System.out.println(ans);
    }
}
