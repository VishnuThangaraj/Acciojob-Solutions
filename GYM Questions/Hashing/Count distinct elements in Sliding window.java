import java.util.*;

// https://course.acciojob.com/idle?question=3e2e87d2-789f-4f85-9891-bfa3f2257aec

class Solution {
    public int[] countDistinct(int[] arr, int k) {
        // store the elements and its occurance
        HashMap<Integer,Integer> storage = new HashMap<>();
        int[] result = new int[(arr.length-k)+1];
        int ind = 0; // index for the result array

        int start = 0;
        for(int index=0; index<arr.length; index++){
            storage.put(arr[index], storage.getOrDefault(arr[index],0)+1);

            if(index >= k-1){
                if(index >= k){
                    if(storage.get(arr[start]) == 1){
                        storage.remove(arr[start]);
                    }else{
                        storage.put(arr[start], storage.get(arr[start])-1);
                    }
                    start++;
                }
                result[ind++] = storage.size();
            }
        }
        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k;
        n = sc.nextInt();
        k = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Solution Obj = new Solution();
        int result[] = Obj.countDistinct(arr, k);
        for (int i = 0; i < result.length; i++)
            System.out.print(result[i] + " ");
        System.out.println();
        sc.close();
    }
}
