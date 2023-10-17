import java.util.*;
import java.io.*;

//https://course.acciojob.com/idle?question=12a72266-1582-45fe-9d30-db3a1a0b710e

public class Main {
	//binary search
	public static int binarySearch(int[]arr,int number, int start, int end, int answer){
		if(start > end){
			return answer;
		}
		//get mid index
		int mid = (start+end) /2;

		if(arr[mid] <= number){ //a possible answer found
			//search right region
			return binarySearch(arr,number,mid+1,end,mid);
		}

		//search left region
		return binarySearch(arr,number,start, mid-1, answer);
	}
	
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		int size  = sc.nextInt();

		int number = sc.nextInt(); //number to find its floor
		int[]arr = new int[size];

		//get inputs for array
		for(int index=0;index<size; index++){
			arr[index] = sc.nextInt();
		}

		//binary search
		//array, number(floor find), start index, endINdex, possible-answer
		int answer = binarySearch(arr,number,0,arr.length-1,-1);
		//print the answer
		System.out.println(answer);
    }
}
