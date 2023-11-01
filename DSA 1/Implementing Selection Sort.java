import java.util.*;

// https://course.acciojob.com/idle?question=90ddafa3-7d35-44c4-be3d-82da7034485c

public class Main {
    public static int[] SelectionSort(int[] arr) {
        for(int i=0;i<arr.length;i++){
			int min = arr[i], ind = i;
			for(int j=i;j<arr.length;j++){
				if(min > arr[j]){
					ind =j;
					min = arr[j];
				}
			}
			int temp = arr[i];
			arr[i]=arr[ind];
			arr[ind]=temp;
		}
		return arr;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int[] ans = SelectionSort(arr);

        for(int a : ans)
            System.out.print(a + " ");
    }
}
