// https://course.acciojob.com/idle?question=640e3336-efe0-470c-9d7a-1bb87e588b2e

import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(), k = sc.nextInt();
    int[] lifetime = new int[k];
    for (int i = 0; i < k; i++) lifetime[i] = sc.nextInt();
    sc.close();
    System.out.println(maxRunTime(n, lifetime));
  }

    public static boolean isPossible(int[]lifetime, int n, long mid){
        int machine = n;
        long remaining = 0;

        for(int num : lifetime){
            if(num >= mid){
                machine--;
                if(machine == 0) return true;
            }else{
                remaining += num;
            }
        }

        return remaining >= mid*machine ? true : false;
    }
  public static long maxRunTime(int n, int[] lifetime) {
     long start = 1;
      long end = 0;

      for(int num : lifetime) end+=num;

      while(start <= end){
          long mid = start + (end-start)/2;

          if(isPossible(lifetime, n, mid)){
              start = mid+1;
          }else{
              end = mid -1;
          }
      }
      return end;
  }
}
