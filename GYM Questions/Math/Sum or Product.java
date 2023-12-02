// https://course.acciojob.com/idle?question=b21c97d5-59a0-441b-9679-5c97bc5f062e

import java.util.*;

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long q = sc.nextLong();
        long ans = Solution.sumOrProduct(n,q);
        System.out.println(ans);
    }
}

class Solution {

    static long sumOrProduct(long n, long q) {
        long result  = (q == 1) ? 0 : 1;

        for(int num=1; num<=n; num++){
            if(q == 1){
                result += num;
            }else{
                result = (result*num) % 1000000007;
            }
        }

        return result;
    }
}
