import java.util.*;

// https://course.acciojob.com/idle?question=320e3d1b-7900-4e66-b6b9-46667cbdf2c4

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int array[] = new int[n];

        for(int i=0; i<n; i++){
            array[i]= sc.nextInt();
        }
        
        insertionSort(array,n);
    }
	 static void insertionSort(int arr[], int n)
    {
        for(int i=0;i<n;i++){
			int val = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>val){
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=val;
		}
		for(int s:arr){
			System.out.print(s+" ");
		}
    }
}
