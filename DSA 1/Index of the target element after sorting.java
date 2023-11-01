import java.io.*;
import java.util.*;

// https://course.acciojob.com/idle?question=dae84631-350d-419f-b7b8-cbbc13ce1eff

public class Main {
	public static void sort(int[]arr, int n){
		for(int i=0;i<n;i++){
			int min = arr[i],ind = i;
			for(int j=i;j<n;j++){
				if(min>arr[j]){
					min = arr[j];
					ind = j;
				}
			}
			int temp = arr[i];
			arr[i]=arr[ind];
			arr[ind]=temp;
		}
	}

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[]arr = new int[n];
		for(int i=0;i<n;i++){
			int val = sc.nextInt();
			arr[i]=val;
		}
		int num = sc.nextInt();
		sc.close();

		sort(arr,n);

		for(int i=0;i<n;i++){
			if(arr[i]==num){
				System.out.print(i);
				break;
			}
		}
    }
}
