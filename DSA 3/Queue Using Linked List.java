import java.util.*;

//https://course.acciojob.com/idle?question=b3346122-ef12-4cc2-b8aa-4b1d9fdda3ba

//create a class for Nodes in LinkedList
class Node{
	int data;
	Node next;

	//constructor for creating Node
	Node(int value){
		this.data = value;
	}
}
class Queue {
    Node head;

	//constructor
	Queue(){
		this.head = null;
	}

	//add element in the linkedlist
    public void push(int value) { //O(n)
		Node added = new Node(value); //new node
		
        if(head == null){
			head = added;
			return;
		}

		//reach the end and add the new node
		Node traverse = head;

		while(traverse.next!=null){
			traverse = traverse.next;
		}

		traverse.next = added; //new node added at the end
		
    }

	//remove the element in the front
    public int pop() { //O(1) constant
        if(head == null){
			return -1; // nothing to pop from empty linked list
		}
		int removedValue = head.data;
		head = head.next; //move head

		return removedValue;
    }

	//view the element in the front 
    public int front() { //O(1) constant
        if(head == null){
			return -1; // nothing to view from empty linked list
		}

		return head.data; //front data
    }

	//size of the linkedlist
    public int getSize() { //O(n)
        //traverse through the linked list and calculate size
		//fast and slow pointer methods can be used for better time complexity
		int size = 0;
		
		Node traverse = head;

		while(traverse!=null){
			traverse = traverse.next;
			size++;
		}

		return size;
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
                System.out.println(q.getSize());
        }
    }
}
