import java.io.*;
import java.util.*;

// https://course.acciojob.com/idle?question=359b69ba-d8f5-4348-9d1e-89b9d63b20e8

class Solution{
    public void coinChange(int num){
       // array of currency
		int[] currency = {500, 100, 50, 20, 10, 5, 2 ,1};
		
		for(int index=0; index<currency.length; index++){
			int money = currency[index];
			// calculate the currency required
			int required = num / money;
			if(required > 0)
				num -= required * money;
			// print the money
			System.out.println("Number of "+money+" Rupees Notes: "+required);
		}
    }
}
public class Main
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        Solution obj=new Solution();
        obj.coinChange(n);
	}
}
