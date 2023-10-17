// https://course.acciojob.com/idle?question=148e79c2-27e2-4693-a07a-085cd378c302

import java.io.*;
import java.util.*;
public class Main {

static class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}
static class LinkedList{
	
    Node head;
	LinkedList(int data){
		Node node = new Node(data);
		head = node;
	}
    void add(int data ){
        Node new_node = new Node(data);
        if(head == null){
            head = new_node;
            return;
        }
        Node current = head;
        while(current.next !=null){
            current = current.next;
        }
        current.next = new_node;
    }
	void checkElement(LinkedList first, LinkedList second){
		Node one = first.head;
		Node two = second.head;
		while(one!=null && two!=null){
			if(one.data != two.data){
				System.out.println(0);
				return;
			}
			one = one.next;
			two = two.next;
		}
		System.out.println(1);
	}
}    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

		//get size;
		int size1 = sc.nextInt();
		int size2 = sc.nextInt();

		LinkedList one = new LinkedList(0);
		LinkedList two =new LinkedList(0);
		
		//add elements
		for(int i=0;i<size1;i++){
			int n =sc.nextInt();
			one.add(n);
		}
		for(int j=0;j<size2;j++){
			int n =sc.nextInt();
			two.add(n);
		}		
		if(size1 != size2){
			System.out.println(0);
			return;
		}

		one.checkElement(one,two);
    }
}
