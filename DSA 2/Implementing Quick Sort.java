import java.util.*;
import java.io.*;

// https://course.acciojob.com/idle?question=52936fff-9a86-45e6-a952-ce5918f9035f

class Solution{
	static void quickSort(int[] arr,int start,int end){
        if(start>=end){
			return; // stops from further call if its single element
		}

		int lowIndex = start; //lesser than pivot side
		int highIndex = end; //greater than pivot side
		int mid = start + (end-start)/2; //mid point
		int pivot = arr[mid]; // pivot element ..can take first or last element as pivot also

		while(lowIndex <= highIndex){ //iterates utill the first and last pointer reach the pivot or center
			while(arr[lowIndex]<pivot){ //runs untill the condition violates as larger element is on left of the pivot
				lowIndex++;
			}
			while(arr[highIndex]>pivot){ //runs untill the condition violates as smaller element is on right of pivot
				highIndex--;
			}
			if(lowIndex<=highIndex){ //recheck to verify indexs are on its range and swap the violation
				int temp = arr[lowIndex];
				arr[lowIndex]=arr[highIndex];
				arr[highIndex]=temp;
				lowIndex++;highIndex--; 
			}
		}

		quickSort(arr,start,highIndex); //call function with first half
		quickSort(arr,lowIndex,end); //call function with second half
    }
}

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		int n;
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Solution Obj = new Solution();
		Obj.quickSort(arr,0,arr.length-1);
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
        sc.close();
    }
}
