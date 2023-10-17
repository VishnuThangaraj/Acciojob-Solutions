import java.util.*;

// https://course.acciojob.com/idle?question=adb9b9f3-7409-4c5a-a694-3c43c5653fb4

class Solution {
    static int countEqualSubarray012(int arr[], int n){
		HashMap<String,Integer> storage = new HashMap<>();
        int zero = 0,one = 0,two = 0;
		int count = 0;

		String key = (one - zero)+"#"+(two-one);
		storage.put(key,1);
		for(int num : arr){
			// update the counter
			if(num == 0) zero++;
			if(num == 1) one++;
			if(num == 2) two++;

			key = (one - zero)+"#"+(two-one);

			if(storage.containsKey(key))
				count += storage.get(key);

			// add to hashmap
			storage.put(key,storage.getOrDefault(key,0)+1);
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
        System.out.println(Obj.countEqualSubarray012(arr,N));

    }
}
