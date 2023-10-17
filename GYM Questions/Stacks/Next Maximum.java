import java.util.*;

//https://course.acciojob.com/idle?question=38204b35-d0a8-4b5e-a354-9b3c1040b1ea

class Main{
	//finding next Greater element on right
	public static int[] nextMaximum(int[] A,int n){
		//create stack to store the index
		Stack<Integer> storage = new Stack<>();

		int[]result = new int[A.length];
		
		for(int index=A.length-1; index>=0; index--){
			int value = A[index];

			//remove smaller elements in stack
			while(!storage.isEmpty() && value >= A[storage.peek()]){
				storage.pop();
			}

			//stack becomes empty
			if(storage.isEmpty()){
				result[index] = -1; //no greater element is found
			}else{
				//find distance
				result[index] = storage.peek() - index;
			}
			storage.push(index); //add to stack
		}
		
		return result;

	}

	public static void main(String[] args){
		try (Scanner sc = new Scanner(System.in)) {
			int t=sc.nextInt();
			while(t>0){
				int n=sc.nextInt();
				int []A=new int[n];
				for(int i=0;i<n;i++){
					A[i]=sc.nextInt();
				}
				int[] ans = nextMaximum(A,n);
				for(int i = 0; i < n; i++)
				{
					System.out.print(ans[i] + " ");
				}
				System.out.println();
				t--;
			}
		}
	}

}
