import java.util.*;

// https://course.acciojob.com/idle?question=a23ee5b7-7b2e-4f66-9736-f7c2904e2158

class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}

class Main
{
	Node head;
	void printList(Node head)
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }

	public void addToTheLast(Node node) 
	{
		if (head == null) 
		{
			head = node;
		} else 
		{
		   Node temp = head;
		   while (temp.next != null)
		   temp = temp.next;

		   temp.next = node;
		}
    }

	public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Main llist = new Main();
		int a1 = sc.nextInt();
		Node head = new Node(a1);
        llist.addToTheLast(head);
        for (int i = 1; i < n; i++) 
		{
			int a = sc.nextInt(); 
			llist.addToTheLast(new Node(a));
		}
		int x = sc.nextInt();
        Node node = head;
        while(node!=null)
        {
            if(node.data == x)
            break;
            node=node.next;
        }
		Solution g = new Solution(); 
		g.deleteNode(node);
		llist.printList(llist.head);
	}
}

class Solution
{
    void deleteNode(Node node)
    {
		 Node nextNode = node.next;
        node.data = nextNode.data;
        node.next = nextNode.next;
        nextNode.next = null;
    }
}
