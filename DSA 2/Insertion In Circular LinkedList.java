import java.util.*;
import java.io.*;

//https://course.acciojob.com/idle?question=f04cbc4e-9a17-4302-8430-6b9f84ecbcb5

class circularLL{
	private Node head;
	private Node tail;

	circularLL(){
		head = null;
	}

	//adding element in linked list
	public void add(int value){
		Node node = new Node(value);
		if(head==null){
			head = node;
			tail = head;
			return;
		}
		tail.next = node;
		tail = node;
		tail.next = head;
	}

	//display the linkedlist
	public void display(){
		Node temp = head;
		do{
			System.out.print(temp.value+" ");
			temp = temp.next;
		}while(temp!=head);
	}

	class Node{
		int value ;
		Node next;
		Node(int value){
			this.value = value;
		}
	}
}
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		//create linkedlist
		circularLL list = new circularLL();

		//insert data to linkedlist
		for(int i=0;i<size;i++){
			int num = sc.nextInt();
			list.add(num);
		}

		int num = sc.nextInt();
		list.add(num);
		list.display();
		sc.close();
    }
}
