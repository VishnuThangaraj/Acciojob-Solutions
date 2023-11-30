// https://course.acciojob.com/idle?question=392f0ea9-a685-4cb7-842f-41d9b5b06a5a

import java.util.*;

class Accio {
    public void AverageCalculator(int[]arr, int size) {
        int sum = 0;
	    for(int num : arr){
            sum += num;
        }

        System.out.println(sum/size);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[]arr = new int[size];
        for(int index=0; index<size; index++)
            arr[index] = sc.nextInt();

        sc.close();

        Accio Obj = new Accio();
        Obj.AverageCalculator(arr, size);
    }
}
