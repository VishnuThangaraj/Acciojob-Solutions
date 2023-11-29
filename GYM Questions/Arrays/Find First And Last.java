// https://course.acciojob.com/idle?question=457458d6-c876-4717-96b6-9ba8559a72f4

import java.util.*;

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        Solution.findFirstAndLast(arr, n , x);
        
    
    }
}
class Solution 
{
    static void findFirstAndLast(int[] arr, int n,int x) {
       int first = -1, last = -1;

        for(int index=0; index<n; index++){
            if(arr[index] == x){
                if(first == -1){
                    first = index;
                    last = first;
                }else{
                    last = index;
                }
            }
        }

        System.out.println(first+" "+last);
    }
}
