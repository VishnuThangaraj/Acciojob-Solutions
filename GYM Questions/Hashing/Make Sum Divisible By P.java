import java.io.*;
import java.util.*;

// https://course.acciojob.com/idle?question=7aa67433-0a18-481d-98d9-602d65779b1a

class Main{
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
        int n,q;
        n=sc.nextInt();
        q=sc.nextInt();
        int[] a= new int[n];
        for(int i=0;i<n;i++){
          a[i] = sc.nextInt();
        }
        Solution obj=new Solution();
        System.out.println(obj.minSubarray(a,n,q));		    
    }
}

class Solution
{
  public int minSubarray(int[] A,int n, int p) {
      int sum = 0;

	  // calculate the totalsum
	  for (int num : A)
		  sum += num;

	  int targetReminder = sum % p;

	  if(targetReminder == 0) // divisible by p no need to remvove elements
		  return 0;

	  // store the mod and the index in HashMap
	  HashMap<Integer, Integer> storage = new HashMap<>();
	  int result = Integer.MAX_VALUE;
	  int currentReminder = 0;
	  
	  for(int index=0; index<n; index++){
		  // update current reminder
		  currentReminder += (A[index]+p) % p;

		  //add the current reminder to map
		  storage.put(currentReminder, index);

		  int mod = (currentReminder - targetReminder+p) % p;

		  // check if mod present in hashMap
		  if(storage.containsKey(mod))
			  // update the reuslt and 
			  result = Math.min(result , index - storage.get(mod));
	  }

	  // check if possible to remove subarray 
	  if(result == Integer.MAX_VALUE || result == n)
		  return -1;

	  return result;
  }
}
