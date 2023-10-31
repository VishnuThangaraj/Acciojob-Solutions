import java.util.*;

class Solution {
    static void sumEvenOdd(int[] arr) {
        // Write your code here
        int even =0, odd = 0;

        for(int index=0; index<arr.length; index++){
            if(arr[index]%2== 0) even+= arr[index];
            else odd += arr[index];
        }

        // Print Result
        System.out.println("Even "+even+" Odd "+odd);
    }
}

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        
        for(int index=0;index<size; index++){
            arr[index] = sc.nextInt();
        }
        Solution.sumEvenOdd(arr);
    }
}
