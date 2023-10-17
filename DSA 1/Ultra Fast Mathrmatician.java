import java.util.*;

//https://course.acciojob.com/idle?question=e4aa3577-4101-4810-92d5-5a5b59b99bc4

public class Main{
  
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String A=scn.nextLine();
        String B=scn.nextLine();
        StringBuilder a= new StringBuilder(A);
        StringBuilder b= new StringBuilder(B);
        StringBuilder c=solve(a,b);
        System.out.println(c);
    }
    static StringBuilder solve(StringBuilder a, StringBuilder b)
    {
		StringBuilder result = new StringBuilder("");
        for(int i=0;i<a.length();i++){
			String cut1 = a.substring(i,i+1);
			String cut2 = b.substring(i,i+1);

			if(cut1.equals(cut2)){ //both are same add to reusult as 0
				result.append("0");
			}else{
				result.append("1"); //both are not same 
			}
		}
		return result;
    }

    
}
