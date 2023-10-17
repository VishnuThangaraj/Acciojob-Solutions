import java.util.*;

// https://course.acciojob.com/idle?question=36a208f4-b1fd-4032-a130-b0c8791eb7a0

class Solution {
    public int BagLength(int[] bag, int k) {
		HashMap<Integer,Integer> storage = new HashMap<>();
        int bags = 0; //max bags can be acquired
		int sum = 0; //subarray-sum(Prefix)

		for(int index=0;index<bag.length; index++){
			sum += bag[index];
			int reminder = ((sum % k) + k) % k; 
			if(reminder == 0){
				bags = index+1;
			}
			if(storage.containsKey(reminder)){
				bags = Math.max(bags, index - storage.get(reminder));
			}else{
				storage.put(reminder,index);
			}
		}
		return bags;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] bag = new int[n];
        for(int i = 0; i < n; i++)
            bag[i] = sc.nextInt();
        int k = sc.nextInt();
        Solution Obj = new Solution();
        System.out.println(Obj.BagLength(bag, k));
    }
}
