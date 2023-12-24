// https://course.acciojob.com/idle?question=d929410d-8057-4937-9384-8f6c8c634fea

import java.util.*;
class Solution{
    public static int[] printFirstNegativeInteger(int arr[], int n, int k){
        Deque<Integer> storage = new ArrayDeque<>(); // stores index of negative numbers
        int[] result = new int[(n-k)+1];

        for(int index=0; index<n; index++){
            if(arr[index] < 0) storage.offerLast(index);

            if(index >= k-1){
                while(!storage.isEmpty() && storage.peekFirst() < index - (k-1))
                    storage.pollFirst();

                if(storage.isEmpty()) result[index - (k-1)] = 0;
                else result[index - (k-1)] = arr[storage.peekFirst()];
            }
        }
        return result;
    }
}
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n] ; 
        for(int i = 0 ; i < n ; ++i){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int []ans = (Solution.printFirstNegativeInteger(arr, n , k ));
        for(int i = 0 ; i < ans.length ; ++i){
            System.out.print(ans[i] + " ");
        }
    }
}
