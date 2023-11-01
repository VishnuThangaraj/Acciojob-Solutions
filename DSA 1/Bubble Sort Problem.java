import java.io.*;
import java.util.*;

// https://course.acciojob.com/idle?question=3dcb9b48-c49e-418c-a0d3-8d5fdc68c799

public class Main {


    static void bubbleSort(int a[], int n)
    {
		int count = 0;
        for(int i=0;i<n-1;i++){
			for(int j=0;j<n-i-1;j++){
				if (a[j] > a[j + 1]) {
		            int temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					count++;
		        }
			}
		}
		System.out.println(count+"\n"+a[0]+"\n"+a[n-1]);
    }  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr1[] = new int[n];
        for(int i=0;i<n;i++)
            arr1[i] = sc.nextInt();
       bubbleSort(arr1, n);
    }
}
