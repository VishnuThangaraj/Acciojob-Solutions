import java.util.*;  

// https://course.acciojob.com/idle?question=e92bcdab-2a48-4c81-9739-9f5fd65ba961

class Solution{
    public void printSubstrings(String str){

        for(int i=0;i<str.length();i++){
            String result = "";
            for(int j=i;j<str.length();j++){
                result += str.charAt(j);
                System.out.println(result);
            }
        }
            
    }
}

public class Main   
{
public static void main(String args[])  
{  
	Scanner sc= new Scanner(System.in);
	
	String str = sc.next();
    Solution obj = new Solution();
    obj.printSubstrings(str);
    }  
}  
