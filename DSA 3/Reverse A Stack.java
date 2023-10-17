import java.util.*;
import java.io.*;
import java.lang.*;

//https://course.acciojob.com/idle?question=9f9cfe35-a122-46b0-a068-299173627020

class StackNode {
    int data;
    StackNode next;
    public StackNode(int data)
    {
        this.data = data;
        this.next = null;
    }
}
class Main
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        PrintWriter out=new PrintWriter(System.out);
        
        //taking testcases
    
        String str=br.readLine();
        int n=Integer.parseInt(str);
        
        String str1=br.readLine();
        String[] starr1=str1.split(" ");
        Stack s = new Stack();
        for(int j=0;j<n;j++)
        {
            s.push(Integer.parseInt(starr1[j]));
        }
        
        s.reverse();
        s.display();
         
        out.close();
    }
}

class Stack {
    StackNode top;
  
    
    public void push(int data)
    {
        if (this.top == null) {
            top = new StackNode(data);
            return;
        }
        StackNode s = new StackNode(data);
        s.next = this.top;
        this.top = s;
    }
    public StackNode pop()
    {
        StackNode s = this.top;
        this.top = this.top.next;
        return s;
    }
  
    
    public void display()
    {
        StackNode s = this.top;
        while (s != null) {
            System.out.print(s.data + " ");
            s = s.next;
        }
        System.out.println();
    }
  
    
    public void reverse()
    {
        //use previous, current and next node to reverse the stack(LinkedList) in O(n)
	StackNode previous = null;
		StackNode current = top;
		StackNode next = current.next;

		while(current!=null){
			current.next = previous;
			previous = current;
			current = next;
			if(next!=null){
				next = next.next;
			}
		}

		//previous will be new top after reversing
		top = previous;
    }
}
