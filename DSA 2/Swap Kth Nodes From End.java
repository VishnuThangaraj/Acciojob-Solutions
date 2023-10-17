import java.util.*;
import java.io.*;

//https://course.acciojob.com/idle?question=bce0e6c5-34b2-4d11-a9f2-ec6e370d0196

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

class Solution{
	int getSize(Node head){
		Node slow = head;
		Node fast = head;

		int size = 0;

		while(fast!=null && fast.next!=null){
			slow = slow.next;
			fast = fast.next.next;
			size++;
		}

		//make size twice
		size*=2;
		if(fast!=null){ //odd digits need +1
			size++;
		}
		return size;
	}
	Node swapkthnode(Node head, int num, int K)
    {
        //get size first
		int size = getSize(head);

		//check swap will occur or not
		if(size%2 != 0){
			if((size/2)+1 == K){
				return head;
			}
		}else if(K>size){ //out of bound
			return head;
		}

		//for first Nth node
		Node previous1 = null;
		Node current1 = head;
		Node next1 = current1.next;

		for(int move = 1;move<K;move++){
			previous1 = current1;
			current1 = next1;
			next1 = next1.next;
		}
		
		size-=K; //for moves in from end
		
		//for last Nth node
		Node previous2 = null;
		Node current2 = head;
		Node next2 = current2.next;

		for(int move = 1;move<=size;move++){
			previous2 = current2;
			current2 = next2;
			next2 = next2.next;
		}
		
		//swapping
		if(previous2 == null){ //swap head and tail
			current1.next = next2;
			current2.next = next1;
			previous1.next = current2;
			head = current1;
		}else{
			if(previous1 != null){
				previous1.next = current2;
			}
			if(previous2 != null && current1.next != current2){
				previous2.next = current1;
			}
			current1.next = next2;

			if(next1 == current2){ //both lies nearby
				current2.next = current1;
			}else{
				current2.next = next1;
			}
			

		}
		
		Node temp = new Node(0);
		return head;
    }
}

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        LinkedList list = new LinkedList();
        for(int i = 0; i < n; i++){
            int x = input.nextInt();
            list.add(x);
        }
        Solution obj = new Solution();
		list.head = obj.swapkthnode(list.head, n, k);
		Node curr = list.head;
		while(curr != null){
			System.out.print(curr.data + " ");
			curr = curr.next;
	    }
	}
}
