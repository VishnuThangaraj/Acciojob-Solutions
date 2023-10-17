import java.util.*;

// https://course.acciojob.com/idle?question=bef05518-ca74-4dc9-b0c7-b3a3a0c4475d

class Solution 
{
    static int[] findRepeatingAndMissingNumbers(int[] nums) 
    {
        boolean[]register = new boolean[nums.length];
		int[]result = new int[2]; // for storing missing and repeated number

		//find the repeated number
		for(int rollNo : nums){
			if(register[rollNo-1] == true) result[0] = rollNo;
			else register[rollNo-1] = true; //mark as rollNo as registered
		}

		//find the missing register number
		for(int index=0; index<register.length; index++){
			if(register[index] == false) result[1] = index+1; //missing number found;
		}

		return result;
    }
}

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];
        for(int i=0;i<N;i++) {
            nums[i] = sc.nextInt();
        }
        int[] ans = Solution.findRepeatingAndMissingNumbers(nums);
        System.out.print(ans[0] + " " + ans[1] + "\n");
    }
}
