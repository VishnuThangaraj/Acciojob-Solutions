import java.util.*;

// https://course.acciojob.com/idle?question=7091a6d4-897a-4fe8-bd41-a4ef5aee8b70

class Solution {
    static void evenNumber(int n)
    {
        if(n%2 != 0) n--;
        
        while(n >= 0){
            System.out.print(n+" ");
            n-=2; 
        }
    }
}



class Main {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			 //take input
			int n= sc.nextInt();
			Solution Obj = new Solution();
			Obj.evenNumber(n);
                        System.out.println();
    	}
		
	}
}

