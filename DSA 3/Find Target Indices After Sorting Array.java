import java.util.*;
import java.io.*;

//https://course.acciojob.com/idle?question=181fd699-05a1-4f9a-9618-c8a04afb3b2e

class Solution
{
    public static int[] binary(int a[], int n, int k){

		//sort the array
		Arrays.sort(a);

		//get the first occurance
		int start = binarySearch(a,k,0,a.length-1, true);

		//if there is no first occurance then there wont be a last  occurance ...so return result
		if(start == -1){
			return new int[] {-1}; 
		}

		//get the last occurance
		int end = binarySearch(a,k,0,a.length-1, false);

		//create a array to store the index
		int [] result = new int[(end-start)+1];
		int index = 0;
		
		for(int adder = start ; adder<=end; adder++){
			result[index++] = adder;
		}
		
		return result;
    }
	
	//to find the first and last occurance
	private static int binarySearch(int[]arr, int target, int start, int end, boolean first){
		if(start > end){
			return -1; // target not found
		}

		int mid = start + (end - start)/2;

		if(arr[mid] == target){ //target found
			if(first){ // for finding first occurance
				if(mid==0 || arr[mid-1] != target){
					return mid; // first occurance is found
				}else{
					//search left
					return binarySearch(arr,target,start,mid-1,first);
				}
			}
			else{ //for finding last occurance
				if(mid==arr.length-1 || arr[mid+1] != target){
					return mid; // last occurance is found
				}else{
					//search right
					return binarySearch(arr,target,mid+1,end,first);
				}
			}
		}

		//if not the target then search for the target in the array
		if(target < arr[mid]){
			//search in the left region
			return binarySearch(arr,target,start,mid-1,first);
		}

		//search in the right region
		return binarySearch(arr,target,mid+1,end,first);
	}
}

//to find the ending 
public class Main {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), k = input.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = input.nextInt();
        }
        int arr[]=Solution.binary(a,n,k);
        int le=arr.length;
        for(int i = 0; i < le; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
