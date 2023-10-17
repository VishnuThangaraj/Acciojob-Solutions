import java.util.*;

//https://course.acciojob.com/idle?question=4265d603-e34e-4d86-84e8-0ce3c938c197

class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = input.nextInt();
        }
        Solution ob =new Solution();
        long ans = ob.maxSubarraySum(a,n);
        System.out.println(ans);
    }
}
class Solution{
    public long maxSubarraySum(int a[],int n){
        long max = Integer.MIN_VALUE;

		long current = a[0];
		//iterate the array
		for(int index=1; index< a.length; index++){
			
			if(a[index] + current >= a[index]){
				current+=a[index];
			}else{
				current = a[index];
			}
			
			max = Math.max(max, current);
		}

		return max;
    }
}
