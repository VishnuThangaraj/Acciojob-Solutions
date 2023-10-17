import java.util.*;

//https://course.acciojob.com/idle?question=120fb058-e4aa-4c50-8fd9-1bc34055d0de

class Node {
    int val;
    Node next;

    Node(int d) {
        val = d;
        next = null;
    }
}

class LinkedList {
    Node head, tail;

    void push(Node new_node) {
        if (head == null && tail == null) {
            head = tail = new_node;
            return;
        }
        tail.next = new_node;
        tail = new_node;
    }

    void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

class Solution {
    public Node rearrangeList(Node head) {
		//odd and even node
        Node even = null;
		Node odd = null;
		Node resultHead = null;
		Node oddHead = null;

		while(head!=null){
			//check odd or even
			if(head.val % 2 == 0){
				Node temp = new Node(head.val);
				if(even == null){
					even = temp;
					resultHead = temp;
				}
				even.next = temp;
				even = even.next;
			}else{
				Node temp = new Node(head.val);
				if(odd == null){
					odd = temp;
					oddHead = temp;
				}
				odd.next = temp;
				odd = odd.next;
			}
			head = head.next;
		}

		if(even!=null){
			even.next = oddHead;
		}else{
			resultHead = oddHead;
		}
		
		return resultHead;
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList llist = new LinkedList();
        int h1 = sc.nextInt();
        Node head = new Node(h1);
        llist.push(head);
        for (int i = 1; i < n; i++) {
            int data = sc.nextInt();
            llist.push(new Node(data));
        }
        //llist.printList(head);
        Solution Obj = new Solution();
        head = Obj.rearrangeList(head);
        llist.printList(head);
        sc.close();
    }
}
