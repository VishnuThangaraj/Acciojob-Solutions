import java.util.*;
import java.io.*;

// https://course.acciojob.com/idle?question=cec8fd82-e5ae-4c8a-b52d-b44325b9c27d

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}
class LinkedList{
    Node head;
    void add(int data){
        Node new_node = new Node(data);
        if(head == null){
            head = new_node;
            return;
        }
        Node curr = head;
        while(curr.next != null)
            curr = curr.next;
        curr.next = new_node;
    }
}
public class Main {
    public static void reverse(Node curr){
        if(curr.next == null){
			System.out.print(curr.data+" ");
			return;
		}
		reverse(curr.next);
		System.out.print(curr.data+" ");
		return;
    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        LinkedList list = new LinkedList();
        int n = input.nextInt();
        for(int i = 0; i < n; i++){
            int x = input.nextInt();
            list.add(x);
        }
        reverse(list.head);
        System.out.println("");
    }
}
