import java.util.*;

// https://course.acciojob.com/idle?question=fdcb0f1a-fa9f-4531-a18f-cbf410f82c1b

public class Main{   
   
    public static void Solve(int[] nums , int k){
		// to store the elements and its occurance
		HashMap<Integer, Integer> storage = new HashMap<>();
		int result = -1;

		for(int num : nums){
			storage.put(num, storage.getOrDefault(num, 0)+1);
		}

        for(int num : nums){
            if(storage.get(num) == k) {
                result = num;break;
            }
        }

        
		System.out.println(result);
    }

	public static void main (String[] args) {
		//your code here 
		Scanner sc = new Scanner(System.in); 
		int n = sc.nextInt(); 
		int k = sc.nextInt();  

		int[] nums = new int[n]; 
		for(int i=0; i<n ;i++){
			nums[i] = sc.nextInt(); 
		} 
           
        Solve(nums , k); 
		return; 
	}
}
