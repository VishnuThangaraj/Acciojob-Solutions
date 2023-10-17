import java.util.*;

//https://course.acciojob.com/idle?question=ca688309-71a6-4c7a-8a45-07ad8817a350

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int ans = Solution.findEquilibriumIndex(a);
        System.out.println(ans);
    }
}

class Solution {
    static int findEquilibriumIndex(int[] a) {
        //add all the elemnts in array
		int rightSum = 0;
		for(int value:a) rightSum+=value;

		int leftSum = 0;

		for(int index=0; index<a.length; index++){
			rightSum-=a[index];

			if(rightSum == leftSum) return index; //index found

			leftSum+=a[index];
		}

		return -1;
    }
}
