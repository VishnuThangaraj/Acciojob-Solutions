import java.io.*;
import java.util.*;

// https://course.acciojob.com/idle?question=2043dd77-9c0e-40e0-ba3e-71241af644cc

class Solution
{
	public static int numRescueBoats(int[] people, int limit) {
		// sort the array before proceeding with two pointers
		Arrays.sort(people);

		int first = 0, second = people.length-1;
		int boats = 0; // boats required

		while(first <= second){
			boats++; // increase the count of boats
			if(people[first] + people[second] <= limit){
				first++;
			}
			second--;
		}
		return boats;
	}
}
public class Main {
	

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++)
		{
			nums[i] = sc.nextInt();
		}
		System.out.println(Solution.numRescueBoats(nums, k));
	}

}
