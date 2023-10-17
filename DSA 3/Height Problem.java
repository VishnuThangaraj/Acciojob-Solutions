import java.util.*;

//https://course.acciojob.com/idle?question=d66b627a-f0fe-4c9a-aefb-3582a213de33

class Accio{
    static int[] HeightProblem(int n,int[] arr){
        //stacks to store the height
		Stack<Integer> storage = new Stack<>();

		//array for storing the result
		int[]result = new int[arr.length];

		//traverse throught the given array
		for(int index=0; index<arr.length; index++){
			//remove elements greater then current index
			while(!storage.isEmpty() && arr[index] <= arr[storage.peek()]){
				storage.pop();
			}

			//if stack is empty mark as -1
			if(storage.isEmpty()){
				result[index] = -1;
			}else{ //assign top item in stack to result
				result[index] = arr[storage.peek()];
			}
			//addd current index to stack
			storage.push(index);
		}

		//return the result
		return result;
    }
}

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;++i){
            arr[i] = sc.nextInt();
        }
        Accio obj = new Accio();
        int[] ans=obj.HeightProblem(n,arr);
        for(int i=0;i<n;++i){
            System.out.print(ans[i] + " ");
        }
    }
}
