import java.util.*;

// https://course.acciojob.com/idle?question=6503ca97-4499-45ed-a76d-af7837890720

class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        int radius = 0; // min radius required to cover houses
		int housePointer = 0;
		int heaterPointer = 0;

		// keep the pointers in range
		while(housePointer < houses.length && heaterPointer < heaters.length){
			// current heater to house 
			int distance1 = Math.abs(houses[housePointer] - heaters[heaterPointer]);
			//next heater to curren house
			int distance2 = Integer.MAX_VALUE;
			// check if next heater exists
			if(heaterPointer+1 < heaters.length){
				distance2 = Math.abs(houses[housePointer] - heaters[heaterPointer+1]);
			}
			// update the radius
			if(distance1 < distance2){
				radius = Math.max(radius, distance1);
				housePointer++;
			}else{
				radius = Math.max(radius, distance2);
				heaterPointer++;
			}
		}
		return radius;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++)
            arr2[i] = sc.nextInt();
        Solution Obj = new Solution();
        int res = Obj.findRadius(arr, arr2);
        System.out.println(res);
        sc.close();
    }
}
