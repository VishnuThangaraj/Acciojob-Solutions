import java.util.*;

// https://course.acciojob.com/idle?question=81bb9cff-b3ec-48bc-b343-76acf3861410

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        printRatios(arr);
        sc.close();
    }

    public static void printRatios(int[] arr) {
        int positive = 0, negative = 0, zero = 0;

		for(int num : arr){
			if(num == 0) zero++; // zero found
			if(num < 0) negative++; // negative found
			if(num > 0) positive++; // positive found
		}
		double fraction = (1.0) / (arr.length*1.0);
		System.out.format("%.6f", ((positive*1.0)*fraction));
		System.out.println();
		System.out.format("%.6f", ((negative*1.0)*fraction));
		System.out.println();
		System.out.format("%.6f", ((zero*1.0)*fraction));
    }
}
