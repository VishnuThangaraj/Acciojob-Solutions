import java.io.*;
import java.util.*;

//https://course.acciojob.com/idle?question=87e0d4e3-e18e-46bd-bccf-7c3409344674

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
    
    static void rotateRight(Node head, int n) {
		//find size
		int size = 1;
		Node temp = head;
		while(temp.next!=null){
			size++;
			temp = temp.next;
		}
	    n = n%size;
		size = size -n;
		Node temp2 = head;

		while(size>1){
			temp2 = temp2.next;
			size--;
		}		
		temp.next = head;
		head = temp2.next;
		temp2.next = null;

		//displaying
		Node printTemp = head;
		while(printTemp!=null){
			System.out.print(printTemp.data+" ");
			printTemp = printTemp.next;
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
        int k = sc.nextInt();
        Ob.rotateRight(l1.head, k);
    }
}
