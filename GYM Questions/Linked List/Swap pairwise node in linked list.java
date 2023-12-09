// https://course.acciojob.com/idle?question=df6b3864-5e94-4464-aaa8-92b9bb1df9ba

import java.util.*;

class Solution{  
	void pairWiseSwap(Node head)
	{
        if(head == null || head.next == null)
            return;

        Node previous = null;
        Node current = head;
        Node next = current.next;

        while(next != null){
            current.next = next.next;
            next.next = current;
            if(previous == null){
                head = next;
            }else{
                previous.next = next;
            }

            // Move nodes
            previous = current;
            current = previous.next;
            if (current == null) break;
            next = current.next;
        }

        Node print = head;

        while(print != null){
            System.out.print(print.data+" ");
            print = print.next;
        }
        System.out.println();
	}
}
public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            LinkedList llist= new LinkedList(); 
            int a1=sc.nextInt();
            Node head= new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < n; i++) 
            {
                int a = sc.nextInt(); 
                llist.addToTheLast(new Node(a));
            }    
			Solution A = new Solution();
	        A.pairWiseSwap(llist.head);
        }  
    }
}

class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
    
class LinkedList
{
    Node head;  
    Node tail;
    public void addToTheLast(Node node) 
    {
      if (head == null) 
      {
       head = node;
       tail = node;
      } 
      else 
      {
       tail.next = node;
       tail = node;
      }
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
