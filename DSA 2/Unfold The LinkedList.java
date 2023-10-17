import java.io.*;
import java.util.*;

//https://course.acciojob.com/idle?question=5a9b74ab-5b0d-48ee-9f86-8ea64b016649

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
	static Node reverse(Node head){
		Node previous = null;
		Node current = head;
		Node next = head.next;

		while(current!=null){
			current.next = previous;
			previous = current;
			current = next;
			if(next!=null){
				next = next.next;
			}
		}
		return previous;
	}
    static void unfold(Node head)
    {
	     Node left = new Node(-1);
		Node right = new Node(-1);
		Node leftTail = left;
		Node rightTail = right;

		int index = 1;
		while(head!=null){
			if(index % 2 == 1){
				leftTail.next = head;
				leftTail = leftTail.next;
			}else{
				rightTail.next = head;
				rightTail = rightTail.next;
			}
			index++;
			head = head.next;
		}

		//ignore -1 in front
		left = left.next;
		right = right.next;

		//reverse the right part
		right = reverse(right);
		
		//join both
		leftTail.next = right;

		while(left!=null){
			System.out.print(left.data+" ");
			left = left.next;
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
        Solution Ob = new Solution();
        Ob.unfold(l1.head);
    }
}
