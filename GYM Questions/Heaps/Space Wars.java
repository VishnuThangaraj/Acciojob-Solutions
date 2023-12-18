// https://course.acciojob.com/idle?question=4c658b0b-147c-4a72-8690-c219d7ef7c76

import java.io.*;
import java.util.*;

class Solution {
    int SpaceWars(int ships[], int n)
    {
        PriorityQueue<Integer> storage = new PriorityQueue<>((a,b)->b-a);

        for(int num : ships) storage.offer(num);

        while(storage.size() > 1){
            int first = storage.poll();
            int second = storage.poll();

            if(first == second)
                continue;
            else
                storage.offer(Math.abs(first-second));
        }

        if(storage.size() == 0) return 0;

        return storage.peek();
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
        Solution Obj = new Solution();
        System.out.print(Obj.SpaceWars(arr1, n));
    }
}
