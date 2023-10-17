import java.util.*;

//https://course.acciojob.com/idle?question=51efaeab-1411-48fc-ae36-d2d70cad0edd

class Solution {
        public int[] sumQuery(int[] arr, int[][] ranges) {
            //create a array of range-sum
			int rangeSum[] = new int[arr.length];

			//store the values in array
			for(int index=0; index<arr.length; index++){
				if(index==0){
					rangeSum[index] = arr[index];
				}else{
					//previous range + current 
					rangeSum[index] = rangeSum[index-1] + arr[index];
				}
			}

			//Array to store the result of range queries
			int result [] = new int[ranges.length];

			//iterate throught the range queries and calculate the rangeSum
			for(int index=0; index< ranges.length; index++){
				int firstNum = (ranges[index][0] == 0) ? 0 : rangeSum[(ranges[index][0])-1];
				int secondNum = rangeSum[ranges[index][1]];
				
				result[index] = secondNum - firstNum;
			}

			return result;
        }
}

public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int m;
        m = sc.nextInt();
        int[][] ranges = new int[m][2];
        for(int i = 0; i < m; i++) {
            ranges[i][0] = sc.nextInt();
            ranges[i][1] = sc.nextInt();
        }
        Solution Obj = new Solution();
        int[] ans = Obj.sumQuery(arr, ranges);
        for(int i =0; i< ans.length; i++)
            System.out.print(ans[i] + " ");
    }
}
