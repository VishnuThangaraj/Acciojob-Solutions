// https://course.acciojob.com/idle?question=4eadc20b-10c1-4015-bf6f-0d0d1f917e8f

import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
    int k = sc.nextInt();
    sc.close();
    System.out.println(findKthLargest(arr, k));
  }

  public static int findKthLargest(int[] nums, int k) {
    PriorityQueue<Integer> heap = new PriorityQueue<>();

      for(int num : nums){
          heap.offer(num);

          // remove element if size is greater than "k"
          if(heap.size() > k) heap.poll(); 
      }

      return heap.peek();
  }
}
