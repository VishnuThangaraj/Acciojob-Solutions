import java.util.*;

// https://course.acciojob.com/idle?question=c186837a-7716-40be-8af6-5414e7c85eb2

class Solution {
    
    public int filling(int A[],int B[],int n) {
        // check the total gas is sufficient to make a rotation
		int totalGas = 0, totalDistance = 0;
		for(int ind=0; ind<n; ind++){
			totalGas += A[ind]; // add to totalGas
			totalDistance += B[ind];
		}

		// not possible to make a rotation
		if(totalDistance > totalGas) return -1;

		int start = -1;
		int tank = 0; 
		
		for(int ind=0; ind<n; ind++){
			//update the totalGas
			tank = (tank + A[ind]) - B[ind];
			if(tank < 0){
				//reset the tank and startPoint
				tank = 0;
				start = -1;
			}else if(start == -1){
				// got new starting point
				start = ind;
			}
		}

		return start;
    }
}


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        sc.close();
        Solution Obj = new Solution();
        System.out.print(Obj.filling(a,b,n));
    }
}
