import java.io.*;
import java.util.*;

// https://course.acciojob.com/idle?question=01b9bc4b-4bbc-42ef-bb88-b449e8d9bd1f

class Solution {
  int theChallenge(int arr[], int n, int sum)
    {
        HashSet<Integer> storage = new HashSet<>();
		int total =0;

		for(int num : arr){
			total+=num; //add the element to total
			if(storage.contains(sum - total) || storage.contains( total - sum)){
				return 1;
			}
			storage.add(total);
		}
		return 0; // no subarray found 
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
        int sum;
        sum = sc.nextInt();
        Solution Obj = new Solution();
        int result = Obj.theChallenge(arr1, n, sum);
        System.out.print(result + " ");
        System.out.println('\n');
    }
}
