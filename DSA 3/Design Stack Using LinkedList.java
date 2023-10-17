import java.util.*;

//https://course.acciojob.com/idle?question=42e0af38-ed64-456b-b7a5-43b885320ffc

class Node {

    int data;
    Node link;

	//constructor for creating node
	Node(int value){
		this.data = value;
	}
}

class Main {
	public static void main(String[] args)
	{
		StackUsingLinkedlist obj = new StackUsingLinkedlist();
		Scanner sc = new Scanner(System.in);
        int q;
        q = sc.nextInt();
        while(q-->0){
            int x;
            x = sc.nextInt();
            if(x==1){
                int y;
                y = sc.nextInt();
                obj.push(y);
            }
            if(x==2){
                System.out.println(obj.peek());
            }
            if(x==3){
                obj.pop();
            }
            if(x==4){
                Node temp = obj.display();
                while (temp != null) {

                    System.out.print(temp.data+" ");

                    temp = temp.link;
			    }
				System.out.println();
            }
        }
	}
}

class StackUsingLinkedlist {

	Node top;
	StackUsingLinkedlist() { this.top = null; }

	//add elements in stack
	public void push(int x)
	{
		Node added = new Node(x);
		if(top == null){ //stack is empty..so make newly added as top
			top = added;
			return;
		}
		added.link = top;
		top = added; // move the top
	}

	//view the top element in stack
	public int peek()
	{
		if(top == null){
			return -1; // no elements in stack
		}

		return top.data; //return top element data
	}

	//remove top element in stack
	public void pop()
	{
		if(top == null){
			return; //nothing to pop in empty stack
		}

		top = top.link;
	}

	//return the top the driver code will print the stack
	public Node display()
	{
		return top;
	}
}
