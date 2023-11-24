// https://course.acciojob.com/idle?question=5e1e0f68-d850-4fcb-a020-f8ee2ec9ed7b

import java.util.*;

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i++) {
            arr.add(sc.nextInt());
        }
        int ans = Solution.uniqueElement(arr);
        System.out.println(ans);
    }
}
class Solution {
    static int uniqueElement(ArrayList < Integer > arr) {
        int result = 0;

        for(int num : arr)
            result = result ^ num;

        return result;
    }
}
