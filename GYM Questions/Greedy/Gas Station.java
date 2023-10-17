import java.util.*;

// https://course.acciojob.com/idle?question=534881ae-c8f8-4639-a07f-023ca94000d8

class Solution {
    public int canCompleteCircuit(int[] A, int[] B) {
        //check if possible to make the entire rotation
		int totalCost = 0, totalFuel = 0;
		for(int i=0; i<A.length; i++){
			totalFuel += A[i];
			totalCost += B[i];
		}

		if(totalFuel < totalCost) return -1; // not possible to make a rotation

		int startPoint = -1, tank = 0;
		
		for(int ind=0; ind<A.length; ind++){
			//update tank
			tank = (tank + A[ind]) - B[ind];
			if(tank >=0 && startPoint == -1){
				startPoint = ind; // got new startPointer
			}else if(tank < 0){
				// reset the startPointer and tank
				startPoint = -1;
				tank = 0;
			}
		}
		return startPoint;
    }
}

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];
        for (int i = 0; i < n; i++)
            A[i] = input.nextInt();
        for (int i = 0; i < n; i++)
            B[i] = input.nextInt();
        Solution Obj = new Solution();
        System.out.println(Obj.canCompleteCircuit(A, B));
        input.close();
    }
}
