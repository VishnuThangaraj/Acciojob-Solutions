import java.util.*;

// https://course.acciojob.com/idle?question=e40d0a42-b09e-4fc8-9be8-2d5fb508fdad

class Solution {
    static int maxOne(int arr[], int n,int k){
        int result = 0;
		int first = 0, second = 0;
		int zeroCount = 0;

		while(first < n){
			if(second<n && zeroCount<=k){
				//update result
				result = Math.max(result, (second - first));
				if(arr[second++] == 0) zeroCount++;
			}else{
				// reduce zero
				if(arr[first++] == 0) zeroCount--;
			}
		}
		return result;
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int k= sc.nextInt();
        int array[] = new int[n];

        for(int i=0; i<n; i++){
            array[i]= sc.nextInt();
        }
        Solution Obj = new Solution();
        System.out.println(Obj.maxOne(array,n,k));
    }
}
