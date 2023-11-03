import java.util.*;
import java.io.*;

// https://course.acciojob.com/idle?question=d13a53f3-b01e-4808-b2f4-6a078e1b36cc

class Solution {
	static void mergeSort(int[] arr,int start,int end){
		if(start==end){
			return; // return if its single element
		}
		 int mid = (start+end)/2; //find the mid element to seperate into two parts
	
		mergeSort(arr,start,mid); //first half
		mergeSort(arr,mid+1,end); //second half
	
		SortIt(arr,start,mid,end); // sort the part
	}

	static void SortIt(int[]arr,int start,int mid, int end){
		int firstPointer = start; //pointing start of first half
		int secondPointer = mid+1; //pointing start of second half
		// create new array
		int[]newArr=new int[(end-start)+1];
		int newArrPointer = 0; // pointer for newly created array (newArr)

		while(firstPointer <= mid && secondPointer <=end){
			if(arr[firstPointer]<arr[secondPointer]){ //if first half element is smaller add to new array
				newArr[newArrPointer] = arr[firstPointer];
				firstPointer++;
			}else{ // if second half element is smaller add to new array
				newArr[newArrPointer] = arr[secondPointer];
				secondPointer++;
			}
			newArrPointer++; // increase newArray pointer after a element is added in the new Array
		}
		// if there is any balance unadded element in first half will be added now else skip
		while(firstPointer<=mid){
			newArr[newArrPointer] = arr[firstPointer];
				firstPointer++;newArrPointer++;
		}
		//if there is any balance unadded element in second half will be added now else skip
		while(secondPointer<=end){
			newArr[newArrPointer] = arr[secondPointer];
				secondPointer++;newArrPointer++;
		}
		//add the sorted elements of the range in default array
		for(int add=0;add<newArr.length;add++){
			arr[start+add]=newArr[add];
		}
	}
}
public class Main {
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int[] a=new int[n];
		for(int i= 0; i < n; i++)
			a[i] = input.nextInt();
		Solution Obj = new Solution();
		Obj.mergeSort(a,0,n-1);
		for (int i = 0; i < n; i++)
			System.out.print(a[i] + " ");
	}
}
