// https://course.acciojob.com/idle?question=9dbf5954-ceaf-4233-9de5-85b4c7af2a12

import java.util.*;

class Solution{
    public static void solve(int n, int[] arr) {
        // Two-Pointers
        int start = 0, end = n-1;
        
        int sereja = 0, dima = 0;
        boolean sere = true;

        while(start <= end){
            if(sere){
                if(arr[start] > arr[end]){
                    sereja += arr[start++];
                }else{
                    sereja += arr[end--];
                }
            }else{
               if(arr[start] > arr[end]){
                    dima += arr[start++];
                }else{
                    dima += arr[end--];
                } 
            }

            sere = !sere;
        }

        System.out.println(sereja+" "+dima);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Solution.solve(n, arr);

    }
}
