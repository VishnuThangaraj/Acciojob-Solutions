import java.util.*;

// https://course.acciojob.com/idle?question=7ebf8ac7-1dc3-4411-8a08-c59fe324537c

class Solution {
    public static Node mergesort(Node head){
        if(head.next == null || head == null){
			return head;
		}

		Node mid = getMid(head);
		Node left = mergesort(head); //firstHalf
		Node right = mergesort(mid); //secondHalf

		return merge(left,right);
    }
	public static Node merge(Node left, Node right){
		Node head = new Node(8);
		Node sorted = head;

		while(left!=null && right!=null){
			if(left.data < right.data){
				sorted.next = left;
				left = left.next;
			}else{
				sorted.next = right;
				right = right.next;
			}
			sorted = sorted.next;
		}

		//add remaining
		sorted.next = (left!=null) ? left : right;

		return head.next;
		
	}
	public static Node getMid(Node head){
		Node previous = head;

		Node fast = head; //two step
		Node slow = head; //one step

		while(fast != null && fast.next != null){
			previous = slow;
			slow = slow.next;
			fast = fast.next.next;
		}

		previous.next = null;
		return slow;
	}
}


class Node{
    int data;
    Node next = null;
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
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        LinkedList a = new LinkedList();
        for(int i = 0; i < n; i++){
            a.add(input.nextInt());
        }
        Solution Obj = new Solution();
        a.head = Obj.mergesort(a.head);
        Node h = a.head;
        while(h != null){
            System.out.print(h.data + " ");
            h = h.next;
        }
    }
}
