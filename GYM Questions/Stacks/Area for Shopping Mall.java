// https://course.acciojob.com/idle?question=8a2b7c9a-ff77-4308-91fb-aba34f336cb3

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        sc.close();
        System.out.println(getMaxArea(arr, n));
    }

    public static int getMaxArea(int hist[], int n) {
        int prev[] = new int[n];
		int next[] = new int[n];

		Stack<Integer> storage = new Stack<>();

		for(int times=0; times<n; times++){
			while(!storage.isEmpty() && hist[storage.peek()] >= hist[times]){
				storage.pop();
			}

			if(storage.isEmpty()){
				prev[times] = -1;
			}else{
				prev[times] = storage.peek();
			}

			storage.push(times);
		}

		Stack<Integer> second = new Stack<>();

		for(int times=n-1; times>=0; times--){
			while(!second.isEmpty() && hist[second.peek()]>=hist[times]){
				second.pop();
			}

			if(second.isEmpty()){
				next[times] = n;
			}else{
				next[times] = second.peek();
			}

			second.push(times);
		}

		//calculate area
		int area = 0;
		for(int i=0;i<n;i++){
			area = Math.max(area,(next[i]-prev[i]-1)*hist[i]);
		}

		return area;
    }
}
