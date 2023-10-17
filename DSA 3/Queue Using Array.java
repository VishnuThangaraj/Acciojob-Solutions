import java.util.*;

//https://course.acciojob.com/idle?question=5e1ce738-3090-4c62-a704-6565f15593d6

class Queue {
    //array
	int[]arr ;
	int start; //starting index 
	int end; //ending index
	int size ; //current size 

	//constructor
    public Queue() {
        arr = new int[1001];
		start = 0;
		end=0;
    }

	//add element in array
    public void push(int newElement) {
        arr[end++] = newElement;
    }
	//remove the element from beginning
    public int pop() {
        return arr[start++];
    }
	//view the element in start index
    public int front() {
        return arr[start];
    }
	//size of the elements added
    public int size() {
        return end-start;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue q = new Queue();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            int op = sc.nextInt();
            if(op == 1) {
                int x = sc.nextInt();
                q.push(x);
            }
            else if(op == 2) {
                System.out.println(q.pop());
            }
            else if(op == 3)
                System.out.println(q.front());
            else if(op == 4)
                System.out.println(q.size());
        }
    }
}
