import java.util.*;

// https://course.acciojob.com/idle?question=b046ca73-173c-4bc1-a8df-61151437dcb4

class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0){
			int n=sc.nextInt();
			int []A=new int[n];
			for(int i=0;i<n;i++){
				A[i]=sc.nextInt();
			}
            Solution ob = new Solution();
			System.out.println(ob.oddsubarrsum(A, n));
			t--;
		}
        sc.close();
	}
}
class Solution{
    public long oddsubarrsum(int[] A, int n) {
        long sum = 0;

        for(int index=0; index<n; index++){
            sum += ((((index+1) * (n-index) + 1)/2) * A[index]);
        }
        
        return sum;
    }
}
