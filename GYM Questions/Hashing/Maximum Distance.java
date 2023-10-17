import java.util.*;

//https://course.acciojob.com/idle?question=35cb9478-a376-4af3-bfd4-1289d43e3278

class Accio{
    static int MaximumDistance(int N,int[] arr){
        //create hashMap for values and its index
		HashMap<Integer, Integer> storage = new HashMap<>();

		int max = 0; //maximum distance between 2 repeating integer
		
		//iterate through the array
		for(int index=0; index<arr.length; index++){
			int value = arr[index];
			//check the value is already there in hashSet
			if(storage.containsKey(value)){
				//measure distance
				int distance = index - storage.get(value);
				//update max if distance is greater than max
				max = (distance > max) ? distance : max;
			}
			else{ //not present in HashMap..so add it
				storage.put(value,index);
			}
		}

		return max;
    }
}

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[]=new int[n];
        for(int i = 0; i < n; i++)
        {
            nums[i] = sc.nextInt();
        }
        Accio obj = new Accio();
        int ans=obj.MaximumDistance(n,nums);
        System.out.println(ans);
    }
}
