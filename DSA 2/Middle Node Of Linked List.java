import java.util.*;

// https://course.acciojob.com/idle?question=c6f18527-8007-4ca5-b928-b9fc2db5f28f

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
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
        llist.head = A.midpointOfLinkedList(llist.head);
        llist.printList();
        
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

class Solution
{
    static Node midpointOfLinkedList(Node head)
    {
        Node temp = head;int count =1; //count of moves

		while(temp.next!=null){
			temp = temp.next;
			count++;//increase untill u reach end
		}

		temp = head;
		for(int i=0;i<count/2;i++){
			temp = temp.next;
		}

		return temp;
    }
    
}
