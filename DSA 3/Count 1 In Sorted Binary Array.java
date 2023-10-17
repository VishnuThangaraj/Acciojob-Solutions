import java.util.*;

//https://course.acciojob.com/idle?question=98e9bbba-6f59-4585-a38c-6f9bd3cd972a

class Solution {
    static int count1(int size, int arr[]) {
	    //lets solve using recursion
		//array , start , end
		return (binarySearch(arr,0,arr.length-1)+1); //+1 to change index to position
    }
	//recursive binary search
	static int binarySearch(int arr[], int start, int end){
		//base condition
		if(start>end){
			return -1;
		}
		int max = 0;
		int mid = end-start; //mid element

		//1 found
		if(arr[mid] == 1){
			//check its last element or the next element is not 1
			if(mid == arr.length-1 || arr[mid+1] != 1){
				return mid; //answer found return mid
			}
			//search the right half 
			return max = binarySearch(arr,mid+1,end);
		}

		//0 found
		return max = binarySearch(arr,start,mid-1); //search left
	}
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int array[] = new int[n];

        for(int i=0; i<n; i++){
            array[i]= sc.nextInt();
        }
        Solution Obj = new Solution();
        System.out.println(Obj.count1(n,array));
    }
}
