import java.util.*;

// https://course.acciojob.com/idle?question=878481a2-35da-4f24-85ed-13c333ca59d3

public class Main {
    public static int[] SmallestGreaterElements(int[] arr) {
        int[]result = new int[arr.length];

		for(int i=0;i<arr.length;i++){
			int value = Integer.MAX_VALUE;
			for(int j=0;j<arr.length;j++){
				if(arr[j]>arr[i] && arr[j]<value){
					value = arr[j];
				}
			}
			if(value == Integer.MAX_VALUE){
				value = -10000000;
			}
			result[i]=value;
		}
		return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int[] ans = SmallestGreaterElements(arr);
        for(int a : ans) {
            System.out.print(a + " ");
        }
    }
}
