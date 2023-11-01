import java.util.Scanner;

// https://course.acciojob.com/idle?question=0aa20c71-6512-4796-b593-b26c0fe95ca5 

class Solution{
    static int findLengthOfSmallestSubarray(int[] a, int K) {
        int result = Integer.MAX_VALUE, sum = 0;
        // Two- Pointers
        int first = 0, second = 0;

        while(first < a.length){
            if(second < a.length && sum < K){
                sum += a[second++];
            }else{
                sum -= a[first++];
            }
            // Update result
            if( sum >= K ){
                result = Math.min(result, second-first);
            }
        }
        return result;
    }
}
public class Main{ 
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
		int K = keyboard.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = keyboard.nextInt();
        }
        keyboard.close();
        System.out.println(Solution.findLengthOfSmallestSubarray(a, K));
    }
}
