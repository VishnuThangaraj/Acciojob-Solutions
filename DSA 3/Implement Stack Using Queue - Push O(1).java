import java.io.*;
import java.util.*;

//https://course.acciojob.com/idle?question=06476864-88f7-478c-bff1-94797c7556b1

class Stack
{
	Queue<Integer> storage;
	//constructor
	Stack(){
		storage = new LinkedList<>();
	}

	//inserting elements
    void push(int a)
    {
        storage.add(a);
    }

	//removing element added last
    int pop()
    {
		if(storage.isEmpty()){
			return -1; //queue is empty 
		}
        //create a temp queue and shift all the elements
		Queue<Integer> temp = new LinkedList<>();

		//shift all the elements from original to temp queue except last added
		while(storage.size()>1){
			temp.add(storage.remove());
		}

		int removedElement = storage.remove();

		//assing original queue as temp
		storage = temp;

		return removedElement;
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
