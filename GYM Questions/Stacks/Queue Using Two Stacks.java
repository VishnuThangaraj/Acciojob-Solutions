import java.util.*;

// https://course.acciojob.com/idle?question=b2d01431-402d-4ff1-bae1-107a104d73e4

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
			Queue g = new Queue();
			
			int q = sc.nextInt();
			while(q>0)
			{
				int QueryType = sc.nextInt();
				if(QueryType == 1)
				{
					int a = sc.nextInt();
					g.enqueue(a);
				}
				else if(QueryType == 2)
				System.out.print(g.dequeue()+" ");
			q--;
			}	
			System.out.println();
				
			
			
		
	}
}


class Queue
{
    Stack<Integer> input = new Stack<Integer>(); 
    Stack<Integer> output = new Stack<Integer>(); 
    
    /*The method pop which return the element poped out of the stack*/
    int dequeue()
    {
        if(input.isEmpty()) return -1; // Empty Stack
        
        // Transfer to second stack
	    while(!input.isEmpty())
            output.push(input.pop());

        int top = output.pop();

        // Transfer the elements back to input stack
        while(!output.isEmpty())
            input.push(output.pop());

        return top;
    }
	
    /* The method push to push element into the stack */
    void enqueue(int x)
    {
	    input.push(x); // Add to stack
    }
}

