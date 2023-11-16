// https://course.acciojob.com/idle?question=fc69347d-a3b9-44be-84b5-7f2129036e4c

import java.io.*;
import java.util.*;

public class Main {
    public static void printFindParticipants(int[] arr, int n, int k) {
        int count = 0;
		for(int score : arr){
			if(score >= arr[k-1] && score > 0){
				count++;
			}
		}
		System.out.println(count);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
      	int k=sc.nextInt();
      	int[] arr= new int[n];

      	for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
            
        printFindParticipants(arr,n,k);
        sc.close();
        
    }
}
