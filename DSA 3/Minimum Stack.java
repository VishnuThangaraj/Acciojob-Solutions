import java.util.*;

//https://course.acciojob.com/idle?question=5435d3a1-ebd0-4b1c-85f8-d4b600f468b6

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int q = sc.nextInt();
			Solution g = new Solution();
			while(q>0)
			{
				int qt = sc.nextInt();
				
				if(qt == 1)
				{
					int att = sc.nextInt();
					g.push(att);
				}
				else if(qt == 2)
				{
					System.out.print(g.pop()+" ");
				}
				else if(qt == 3)
				{
					System.out.print(g.getMin()+" ");
				}
			
			q--;
			}
			System.out.println();
		T--;
		}
        sc.close();
		
	}
}

class Solution
{
	int minEle;
	Stack<Integer> s;
    
	Solution()
	{
		s = new Stack<Integer>();
	}

	//add element in stack
	void push(int x){ // O(1) constant
        s.push(x);		
    }

	//remove last added element in stack
	int pop(){ //O(1) constant
		if(s.isEmpty()){
			return -1; //no element in stack to pop
		}
        return s.pop();
	}

	//return the minimum number in stack
    int getMin(){ //O(2n) = O(n)
		if(s.isEmpty()){
			return -1; // no element in stack
		}
        
		//create a temp stack
		Stack<Integer> temp = new Stack<>();

		int min = Integer.MAX_VALUE; //to find minimum value

		while(!s.isEmpty()){
			if(s.peek() < min){
				min = s.peek();
			}
			temp.push(s.pop());
		}

		//push the elements back to original stack
		while(!temp.isEmpty()){
			s.push(temp.pop());
		}

		return min; //minimum value
	}	
}
