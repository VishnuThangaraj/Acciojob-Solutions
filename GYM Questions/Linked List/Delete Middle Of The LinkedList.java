// https://course.acciojob.com/idle?question=0e70b77f-c4b9-4500-b160-5b1c36fe5d9d

import java.util.*;
import java.io.*;

class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
    
}
class Main{
	static void printList(Node node) 
	{ 
		while (node != null) 
		{ 
			System.out.print(node.data + " "); 
			node = node.next; 
		} 
		System.out.println(); 
	}
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            for(int i=0; i<n-1; i++)
            {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
            Solution g = new Solution();
            head = g.deleteMid(head);
            printList(head); 
            t--;
        }
		sc.close();
    } 
} 
   
class Solution{
    Node deleteMid(Node head){
		if(head.next == null) return null; // single node
		
		Node previous = null;
		Node slow = head;
		Node fast = head;

		// find the middle node
		while(fast!=null && fast.next != null){
			previous = slow;
			slow = slow.next;
			fast = fast.next.next;
		}

		// remove the middle node
		previous.next = slow.next;
		
		return head;
    }
}
