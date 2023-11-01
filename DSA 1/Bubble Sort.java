import java.util.*;

// https://course.acciojob.com/idle?question=04c51a0a-2136-40da-8738-c391d6a9ef8f

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int arr[] = new int[N];

        // Input of array
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // bubble sort in descending order
        bubbleSort(N, arr);
        // printing array elements
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }

    }
	public static void swap(int[]arr,int j){
		int temp = arr[j+1];
		arr[j+1] = arr[j];
		arr[j] = temp;
	}

    public static void bubbleSort(int N, int[] arr) {
        for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<N-i-1;j++){
				if(arr[j]>arr[j+1]){
					swap(arr,j);
				}
			}
		}
    }
}
