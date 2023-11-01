import java.util.*;

// https://course.acciojob.com/idle?question=12a489cc-1cc6-4ade-86be-281ab330a2a9

class Solution {
    static void printMax(int arr[], int N, int K)
    {
         // Store the index of marks
        Deque<Integer> storage = new ArrayDeque<>();

        int index = 0;

        // add till the window size
        for(; index<K; index++){
            while(!storage.isEmpty() && arr[storage.peekLast()] <= arr[index])
                storage.pollLast();

            storage.offerLast(index);
        }

        // printing the max in window size
        for(; index<N; index++){
            System.out.print(arr[storage.peek()]+" ");

            // Remove elements out of the window range
            while(!storage.isEmpty() && storage.peekFirst() <= index-K)
                storage.pollFirst();

            while(!storage.isEmpty() && arr[storage.peekLast()] <= arr[index])
                storage.pollLast();

            storage.offerLast(index);
        }

        // Print the last window
        System.out.print(arr[storage.peek()]);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr1[] = new int[n];
        for(int i=0;i<n;i++)
            arr1[i] = sc.nextInt();
        int k = sc.nextInt();
        Solution Obj = new Solution();
        Obj.printMax(arr1, n ,k);
        System.out.println('\n');
    }
}
