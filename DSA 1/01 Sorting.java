// https://course.acciojob.com/idle?question=80705e86-341b-4e37-92e5-6c828e51c5be

import java.util.*;

public class Main {
	 static int[] Sorting01(int n,int[] arr){
        int i=0;
		 for(int j=0;j<arr.length;j++){
			 if(arr[j]==0){
				 int temp = arr[i];
				 arr[i]=arr[j];
				 arr[j]=temp;
				 i++;
			 }
		 }
		 return arr;
    }
	
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;++i){
            arr[i] = sc.nextInt();
        }
        int[] ans=Sorting01(n,arr);
        for(int i=0;i<n;++i){
            System.out.print(ans[i] + " ");
        }
    }
}
