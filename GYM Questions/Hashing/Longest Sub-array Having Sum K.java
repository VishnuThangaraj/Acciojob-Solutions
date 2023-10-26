import java.util.*;

// https://course.acciojob.com/idle?question=00d425f1-a20e-4549-afb2-4e1cd07ad3fd

public class Main
{
    static int subarraySum(int[] arr, int k) {
	    // store the sum and its index in HashMap
		HashMap <Integer,Integer> storage = new HashMap<>();

		int sum = 0;
		int result = 0;

		for(int index=0; index<arr.length; index++){
			sum += arr[index];

			// check if the value present in HashMap
			if(storage.containsKey(k - sum))
				result = Math.max(result, index - storage.get(k - sum));
			else if(storage.containsKey(sum - k))
				result = Math.max(result, index - storage.get(sum - k));

			if (!storage.containsKey(sum))
				storage.put(sum, index);
		}

		return result;
    }
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for(int i=0; i<t; i++)
		{
		    int n, k;
		    n=input.nextInt();
		    k=input.nextInt();
	        int arr[] = new int[n];
	        for(int j=0; j<n; j++)
	        {
	            arr[j] = input.nextInt();
	        }
	        System.out.println(subarraySum(arr,k));
		}
	}
}
