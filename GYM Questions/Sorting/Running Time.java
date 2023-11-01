import java.io.*;
import java.util.*;

// https://course.acciojob.com/idle?question=023eeb5a-1016-4aba-a007-fbfc577f00a3

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Solution s = new Solution();
        System.out.println(s.countNumberOfInsertionSortInversions(arr));
    }
}

class Solution {
    static int countNumberOfInsertionSortInversions(int[] arr) {
        int count = 0;

        // Insertion Sort
        for(int index=0; index<arr.length; index++){
            int key = arr[index];
            int j = index-1;
            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
                count++;
            }
            arr[j+1] = key;
        }

        return count;
    }
}
