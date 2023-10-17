import java.io.*;
import java.util.*;
import java.util.*;

//https://course.acciojob.com/idle?question=2665b43f-7632-47bd-83ae-eaca271efc3c

class Solution{
	//check if possible to place cows
	public static boolean placeCows(int[]a, int cows, int distance){
		int placedCows = 1; int location = a[0];

		for(int index=1; index<a.length; index++){
			if(a[index] - location >= distance){
				//update placedCows and location
				placedCows++;
				location = a[index];
			}
			if(placedCows >= cows){
				//System.out.println("S");
				return true;
			}
		}

		return false; //cows cant be placed in the given distance
	}

    public static int aggressiveCows(int a[],int cows){
		//sort the Array before proceeding
		Arrays.sort(a);
		
       //binary search
		int start = 1;
		int end = a[a.length-1] - a[0];
		int answer = 0;
		
		while(start <= end){
			int mid = (start+end)/2; //get the mid
			if(placeCows(a,cows,mid)){ //can place cows
				answer = mid;
				//search right region
				start = mid+1;
			}else{
				//search left region
				end = mid-1;
			}
		}

		return answer;
    }


}

class Main {
        public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++)
		{
			nums[i] = sc.nextInt();
		}
        Solution obj=new Solution();
		System.out.println(obj.aggressiveCows(nums,k));

    }
}
