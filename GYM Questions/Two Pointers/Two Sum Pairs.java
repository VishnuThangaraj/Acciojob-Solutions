// https://course.acciojob.com/idle?question=6e70f2ee-6873-4373-acb9-d179d6ce555e

import java.util.*;

public class Main {

    public static List<List<Integer>> twoSum(int[] arr, int target) {
      List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr); // Sort the Array
        
        int first = 0, second = arr.length-1; //Two-Pointers

        while(first < second){
            int sum = arr[first]+arr[second];
            if(sum == target){
                List<Integer> current = new ArrayList<>();
                current.add(arr[first++]); current.add(arr[second--]);
                result.add(current);

                // move both pointers and avoid duplicates
                while(first < second && arr[first-1] == arr[first]) first++;
                while(second > first && arr[second+1] == arr[second]) second--;
            }
            else if(sum > target) second--;
            else first++;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int target = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        List<List<Integer>> res = twoSum(arr, target);
        ArrayList<String> finalResult = new ArrayList<>();
        for (List<Integer> list : res) {
            Collections.sort(list);
            String ans = "";
            for (int val : list) {
              ans += val + " ";
            }
            finalResult.add(ans);
        }
        Collections.sort(finalResult);
        for (String str : finalResult) {
            System.out.println(str);
        }
    }
}
