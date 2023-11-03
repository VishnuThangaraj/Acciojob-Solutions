import java.io.*;
import java.util.*;

// https://course.acciojob.com/idle?question=4f933ef9-bfa1-4337-8c11-98c928b4dd05

public class Main {
    public static void minXor(int[]arr, int size){
        int result = Integer.MAX_VALUE;

        for(int i=0; i<size; i++)
            for(int j=i+1; j<size; j++)
                // Update result
                result = Math.min(result, arr[i]^arr[j]);

        System.out.println(result);
    }
    
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        
        for(int index=0; index<size; index++)
            arr[index] = sc.nextInt();

        sc.close();

        minXor(arr, size);
	}
}
