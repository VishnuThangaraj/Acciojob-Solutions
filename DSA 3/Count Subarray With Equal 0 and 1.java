import java.util.*;

// https://course.acciojob.com/idle?question=72efea8a-6472-4705-af3d-69ada985c057

class Solution {
    static int countEqualSubarray01(int arr[], int n){
		HashMap<Integer,Integer> storage = new HashMap<>();

		int sum = 0,count = 0;

		for(int num : arr){
			// treat 0 as -1
			if(num == 0) sum+=-1;
			else sum+=num;

			if(sum == 0) count++;

			if(storage.containsKey(sum))
				count += storage.get(sum);

			// ADD/UPDATE hashMap
			storage.put(sum,storage.getOrDefault(sum,0)+1);
		}
		return count;
    }   
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
    

        int arr[] = new int[N];

        for(int i=0; i<N; i++){
            arr[i]= sc.nextInt();
        }
        
        Solution Obj = new Solution();
        System.out.println(Obj.countEqualSubarray01(arr,N));

    }
}
