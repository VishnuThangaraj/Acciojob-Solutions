import java.util.*;

// https://course.acciojob.com/idle?question=911b7127-4662-4208-9549-749da1913476

public class Main {
    public static void findIndex(int key, int[] arr) {
        // iterate from back
		for(int index=arr.length-1; index>=0; index--){
			if(arr[index] == key){
				System.out.println(index);break;
			}
		}
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, key;
        n = sc.nextInt();
        key = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        findIndex(key, arr);
        sc.close();
    }
}
