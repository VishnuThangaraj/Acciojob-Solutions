import java.io.*;
import java.util.*;

//https://course.acciojob.com/idle?question=014a1af9-7d87-4ffb-9762-2ae93a586073

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
    public void partition(Node head, int x) {
        Node front = new Node(-1);
		Node frontH = front;
		Node back = new Node(-1);
		Node backH = back;

		while(head!=null){
			if(head.data >= x){
				back.next = new Node(head.data);
				back = back.next;
			}else{
				front.next = new Node(head.data);
				front = front.next;
			}
			head = head.next;
		}

		front.next = backH.next;

		frontH = frontH.next; //ignoring -1 in front

		//display
		while(frontH!=null){
			System.out.print(frontH.data+" ");
			frontH = frontH.next;
		}

		
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
        int x = sc.nextInt();
        Solution Ob = new Solution();
        Ob.partition(l1.head, x);
    }
}
