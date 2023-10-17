import java.io.*;
import java.util.*;

// https://course.acciojob.com/idle?question=90266d47-b043-4a66-b6c8-57d12147a33d

class Main
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int K=sc.nextInt();
        

        Solution obj=new Solution();
        Boolean ans=obj.solve(N,K);

        if(ans==true)
            System.out.println("YES");
        else
            System.out.println("NO");
        
    }
}

class Solution{
    
    public static Boolean solve(int n,int k)
    {
        int bitMask = 1 << k;

		if((n & bitMask) != 0) return true;

		return false;
    }
}
