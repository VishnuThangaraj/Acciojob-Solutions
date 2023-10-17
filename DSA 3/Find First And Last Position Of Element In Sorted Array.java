import java.util.*;

//https://course.acciojob.com/idle?question=5a206680-d1df-4e82-8196-dd13f35ba139

public class Main {
	//first Index of the target
	public static int firstIndex(int[]A, int target, int start, int end){
		if(start > end){
			return -1; //element is not found in the array
		}
		int mid = start + (end-start)/2; 

		if(A[mid] == target){ // target found
			if(mid == 0 || A[mid-1] != target){
				return mid; //target found
			}
			return firstIndex(A,target,start, mid-1); //search left half
		}

		if(A[mid] > target){
			return firstIndex(A,target,start, mid-1); //search left half
		}

		return firstIndex(A,target,mid+1, end); //search right half
	}

	//last Index of the target
	public static int lastIndex(int[]A, int target, int start, int end){
		if(start > end){
			return -1; //element is not found in the array
		}
		int mid = end-start; 

		if(A[mid] == target){ // target found
			if(mid == A.length-1 || A[mid+1] != target){
				return mid; //target found
			}
			return lastIndex(A,target,start, mid-1); //search left half
		}

		if(A[mid] > target){
			return lastIndex(A,target,start, mid-1); //search left half
		}

		return lastIndex(A,target,mid+1, end); //search right half
	}
	
    public static void findPosition(int a[], int n,int k)
    {
        //use two functions for finding first and last occurance of a element
		// array , target, start index, end index
		System.out.print(firstIndex(a,k,0,a.length-1)+" ");
		System.out.println(lastIndex(a,k,0,a.length-1));
    }
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int k= sc.nextInt();
        int array[] = new int[n];

        for(int i=0; i<n; i++){
            array[i]= sc.nextInt();
        }
        findPosition(array,n,k);
    }
}
