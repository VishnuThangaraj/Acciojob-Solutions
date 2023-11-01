import java.util.*;

// https://course.acciojob.com/idle?question=e56d8fb9-9b68-4cdd-a742-a8b11eb64a03

public class Main {
    static int maximum_occurrence(int arr[], int n) {
		int result = 0, count = 1, max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
			int present = arr[i];count=1;
			for(int j=i;j<arr.length;j++){
				if(present == arr[j]){
					count++;
				}
			}
			if(count > max){
				max = count;
				result = present;
			}else if(count == max){
				if(present < result){
					result = present;
				}
			}
		}
         return result;
    }
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(maximum_occurrence(arr, n));

    }
}
