import java.io.*;
import java.util.*;

// https://course.acciojob.com/idle?question=938538c4-7c0f-4909-970f-4b771e2b664d

public class Main {
    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
		int size = read.nextInt();
		// get the input 
		int[] arr = new int[size];
		for(int index=0; index<size; index++)
			arr[index] = read.nextInt();

		Deque<Integer> storage = new ArrayDeque<>();
		storage.offerFirst(0);

		for(int index=1; index<size; index++){
			if(arr[storage.peekFirst()] > arr[index])
				// add at the beginning
				storage.offerFirst(index);
			else
				storage.offerLast(index);
		}

		// Print the result from Deque
		while(!storage.isEmpty())
			System.out.print(arr[storage.pollFirst()]+" ");
    }
}
