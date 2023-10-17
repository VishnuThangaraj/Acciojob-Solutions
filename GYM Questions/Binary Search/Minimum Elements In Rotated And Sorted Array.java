import java.util.*;

// https://course.acciojob.com/idle?question=40320548-b41f-4d11-aeca-9716ed073c7e

class Accio{
    static int MinElement(int n,int[] arr){
        // use binary search to find the minimum element
		int start = 0, end = arr.length-1;

		while(start <= end){
			int mid = start + (end - start)/2;

			// minimum element found
			if(arr[mid-1] > arr[mid]) return arr[mid];

			// check if the range is sorted
			if(arr[start] < arr[end]) return arr[start];

			if(arr[start] > arr[mid]){
				// search left
				end = mid-1;
			}else{
				// search right region
				start = mid+1;
			}
		}
		return -1;
    }
}

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;++i){
            arr[i] = sc.nextInt();
        }
        Accio obj = new Accio();
        int ans = obj.MinElement(n,arr);
        System.out.println(ans);
    }
}
