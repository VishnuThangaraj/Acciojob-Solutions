// https://course.acciojob.com/idle?question=545f1050-ce80-4621-9247-9aebb10afa1d

import java.util.*;

class Solution {
    public static int removeDuplicates(int[] arr) {
        int size = arr.length, result = size;
        int duplicates = -2;

        // Two-Pointers
        int first = 0, second = 0;
        
        while(first < size){
            while(second < size && arr[second] == arr[first]){
                duplicates++;
                second++;
            }
            if(duplicates > 0){
                result -= duplicates;
            }
            first = second;
            duplicates = -2; 
        }
        return result;
    }
}

public class Main{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        Solution Obj = new Solution();
        System.out.println(Obj.removeDuplicates(arr));
    }
}
