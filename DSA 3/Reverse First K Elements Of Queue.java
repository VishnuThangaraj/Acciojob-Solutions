import java.util.*;
import java.io.*;

//https://course.acciojob.com/idle?question=a43a8fee-7bba-4cb7-9691-9172b3716b9b

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), k = input.nextInt();
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < n; i++){
            q.add(input.nextInt());
        }
        // create a deque and add till k elements
		Deque<Integer> storage = new ArrayDeque<>();

		//add the elements in q to storage(deque)
		while(!q.isEmpty()){
			if(k>0){
				//insert in the beginning for k times
				storage.addFirst(q.remove());
				k--;
			}else{
				//insert in the end after k times
				storage.addLast(q.remove());
			}
		}

		//shift all the elements from deque to q
		while(!storage.isEmpty()){
			q.add(storage.remove());
		}
		
        while(q.size() > 0){
            System.out.print(q.poll() + " ");
        }
    }
}
