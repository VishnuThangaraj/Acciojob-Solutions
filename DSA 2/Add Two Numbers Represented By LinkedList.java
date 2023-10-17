import java.util.*;
import java.io.*;

// https://course.acciojob.com/idle?question=f9ebb6a0-0789-4aea-bc82-d875b1b7ae88

public class Main {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        LinkedList a = new LinkedList();
        LinkedList b = new LinkedList();
        for(int i = 0; i < n; i++){
            a.add(input.nextInt());
        }
        for(int i = 0; i < m; i++){
            b.add(input.nextInt());
        }
        LinkedList ans = new LinkedList();
        Solution A = new Solution();
        ans.head = A.addTwoLinkedLists(a.head, b.head);
        ans.printList();

    }
}


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
    void printList()
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
}


class Solution
{
	// function to reverse the linkedlist
	public static Node reverse(Node head){
		Node previous = null;
		Node current = head;
		Node next = current.next;

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

    public static Node addTwoLinkedLists(Node head1, Node head2)
    {
        //reverse both list
		Node rev1 = reverse(head1);
		Node rev2 = reverse(head2);

		Node result = new Node(0);
		Node resultHead = result;
		int sum =0;
		int carry =0;

		while(rev1!=null && rev2!=null){
			sum = rev1.data + rev2.data + carry;
			carry = 0;
			if(sum > 9){
				carry = sum/10;
				sum%=10;
			}
			result.next = new Node(sum);
			result = result.next;
			rev1 = rev1.next;
			rev2 = rev2.next;
		}

		// if any one of the linked list is small.. perform addition on it
			if(rev1!=null){
				if(carry!=0){
					while(rev1!=null){
						sum = rev1.data+ carry;
						carry = 0;
						if(sum > 9){
							carry = sum/10;
							sum%=10;
						}
						result.next = new Node(sum);
						result = result.next;
						rev1 = rev1.next;
					}
				}else{
						result.next = rev1;
					}
				
			}else if(rev2!=null){
				if(carry!=0){
					while(rev2!=null){
						sum = rev2.data + carry;
						carry = 0;
						if(sum > 9){
							carry = sum/10;
							sum%=10;
						}
						result.next = new Node(sum);
						result = result.next;
						rev2 = rev2.next;
					}
				}else{
						result.next = rev2;
				}
			}

		// carry is remaining after the calculation
			if(carry!=0){
				result.next =  new Node(carry);
				carry = 0;
			}


		resultHead = reverse(resultHead.next);

		return resultHead;
    }
    
}
