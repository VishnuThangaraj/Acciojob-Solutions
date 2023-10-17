import java.util.*;

// https://course.acciojob.com/idle?question=e33091af-154f-43a1-8ee3-2d1a68f06636

class Main {
	Node head;
	Node temp;
	
	class Node {
		int data;
		Node next;
		Node(int d)
		{
			data = d;
			next = null;
		}
	}

	public void oddEvenList(Node head) {
		if (head == null) {
			System.out.println();
			return ;
		}
		// odd and even pointers 
		Node odd = head, even = head.next, evenHead = even;
		while (even != null && even.next != null) {
			odd.next = even.next;
			odd = odd.next;
			even.next = odd.next;
			even = even.next;
		}
		odd.next = evenHead;

		// reassign the head and print the list
		Node temp =head;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.next;			
		}
		System.out.println();
		return;
	}

	public void push(int new_data)
	{
		if(head == null){
			
			head = new Node(new_data);
			
			temp =head;
			
			return ;
		}
		else{
			Node new_node = new Node(new_data);

			temp.next = new_node;
			
			temp=temp.next;

			return;		
		}
		
	}

	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		Main ob = new Main();
		int t=0;
		t = sc.nextInt();
		while(t-->0){
			ob.head=null;
			int n=0;
			n=sc.nextInt();
			int tn =n;
			while(tn-->0){
				int x=0;
				x = sc.nextInt();
				ob.push(x);
			}
            ob.oddEvenList(ob.head);
		}
		sc.close();
		return;
	}
}
