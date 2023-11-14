// https://course.acciojob.com/idle?question=b759dd60-d890-43e7-8971-7c24ee8c64fe

import java.io.*;
import java.util.*;

class Solution {

    public List<Integer> coldDrink(int arr[], int n, int k) {
        // write code here
        List<Integer> result = new ArrayList<>();
        int start = 0, end = n+n;

        //Two-Pointers
        int first = 0, second = 0;
        HashMap<Integer, Integer> storage = new HashMap<>();

        while(first < n){
            if(second < n && storage.size()<k){
                storage.put(arr[second], storage.getOrDefault(arr[second],0)+1);
                second++;
            }else{
                if(storage.get(arr[first]) == 1)
                    storage.remove(arr[first]);
                else
                    storage.put(arr[first], storage.get(arr[first])-1);

                first++;
            }

            //Update result
            if(storage.size() == k && (end-start) > (second-first)){
                start = first;
                end = second;
            }
        }

        if(start == 0 && end == n+n)
            result.add(-1);
        else{
            result.add(start);
            result.add(end-1);
        }

        return result;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Solution Obj = new Solution();
        List<Integer> ans = Obj.coldDrink(arr, n, k);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        sc.close();
    }
}
