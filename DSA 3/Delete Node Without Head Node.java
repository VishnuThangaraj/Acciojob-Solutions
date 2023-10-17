import java.util.*;

//https://course.acciojob.com/idle?question=dfa09a1d-8cea-4b61-a3cf-86cb38ade333

class Node{
  int data ;
  Node next;
  Node(int d)
  {
    data = d;
    next = null;
  }
}

class Main{
  Node head;
  Node tail;
  
  void printList(Node head){
    Node tnode = head;
    while(tnode != null)
    {
      System.out.print(tnode.data+ " ");
      tnode = tnode.next;
    }
    System.out.println();
  }
  
  void addToTheLast(Node node){
    if(head == null)
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
  
  Node search_Node(Node head, int k){
    Node current = head;
    while(current != null){
      if(current.data == k)
        break;
      current = current.next;
    }
  return current;
  }
  
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      Main llist = new Main();
      int a1=sc.nextInt();
      Node head= new Node(a1);
      llist.addToTheLast(head);
      for (int i = 1; i < n; i++) {
      int a = sc.nextInt(); 
      llist.addToTheLast(new Node(a));
    }
      int k = sc.nextInt();
      Node del = llist.search_Node(llist.head,k);
      Solution g = new Solution();
      if(del != null && del.next != null)
      {
        g.deleteNode(del);
      }
      llist.printList(llist.head);
  }
}

class Solution
{
    void deleteNode(Node del)
    {
        del.data = del.next.data; //copy data of next node
		del.next = del.next.next; //skip next node
    }
}

