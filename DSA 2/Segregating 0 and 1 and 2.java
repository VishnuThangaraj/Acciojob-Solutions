import java.io.*;
import java.util.*;

//https://course.acciojob.com/idle?question=2fbcf4ac-1f98-4124-abda-0c68a640f1e9

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
}

class Solution {
    static void unfold(Node first)
    {
     Node head = new Node(0);
		Node mid = head;
		Node tail = null;

		while(first!=null){
			if(first.data == 0){
				Node temp = new Node(0);
				temp.next = head;
				head = temp;
			}else if(first.data == 1){
				Node temp = new Node(1);
				if(tail != null){
					temp.next = tail;
				}
				mid.next = temp;
				mid = mid.next;
			}else{
				if(tail==null){
					mid.next = new Node(2);
					tail = mid.next;
				}else{
					Node temp = new Node(2);
					temp.next = tail.next;
					tail.next =temp;
				}
			}
			first = first.next;
		}

		head = head.next;

		Node temp = head;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp = temp.next;
		}System.out.println();
    }
}
public class Main {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList l1= new LinkedList();
        for(int i=0;i<n;i++){
            l1.add(sc.nextInt());
        }
        Solution Ob = new Solution();
        Ob.unfold(l1.head);
    }
}
