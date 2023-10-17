import java.io.*;
import java.util.*;

//https://course.acciojob.com/idle?question=4431095d-0428-4154-b520-cfb4da01b55a

class Stack
{
	//queue using stak
	Queue<Integer> stack;
	

	//constructor
	Stack(){
		stack = new LinkedList<>();
	}

	//add element in the last
    void push(int a) //takes O(n)
    {
		Queue<Integer> temp = new LinkedList<>();
		//create temp queue and add the element
        temp.add(a);

		//add all the elements from old queue(Stack)
		while(!stack.isEmpty()){
			temp.add(stack.remove());
		}

		//make temp as stack(OLD QUEUE)
		stack = temp;
    }

	//remove element in the front
    int pop() //takes O(1) constant
    {
        if(stack.isEmpty()){
			return -1; //no elements in queue
		}
		return stack.remove();
    }	
}
public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);    
        Stack g = new Stack();			
        int q = sc.nextInt();
        while(q>0)
        {
            int QueryType = sc.nextInt();
            if(QueryType == 1){
                int a = sc.nextInt();
                    g.push(a);
            }
            else if(QueryType == 2){
                    System.out.print(g.pop()+" ");
            }
            q--;
        }	
    }
}
