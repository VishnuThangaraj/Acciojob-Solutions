import java.io.*;
import java.util.*;

//https://course.acciojob.com/idle?question=e0b796ef-2562-4a35-a728-c23b93d988c1

public class Main {
    static void findSplitPoint(int arr[], int n) {
        int leftSum = 0;
		for(int num : arr) leftSum+=num;
		int rightSum = 0;

		int ind = 0;
		for(ind=arr.length-1; ind>=0; ind--){
			rightSum+=arr[ind];
			leftSum-=arr[ind];
			if(leftSum == rightSum){
				break;
			}
		}

		if(leftSum == rightSum){
			for(int i=0;i<arr.length; i++){
				if(i == ind){
					System.out.println();
				}
				System.out.print(arr[i]+" ");
			}
		}else{
			System.out.println("Not Possible");
		}
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        findSplitPoint(arr, n);

    }
}
