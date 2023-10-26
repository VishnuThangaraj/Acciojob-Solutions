import java.util.*;

// https://course.acciojob.com/idle?question=9af07aa6-8553-4c43-bd37-83bff306832a

class Main{
	public static void main(String[] args){
		try (Scanner sc = new Scanner(System.in)) {
			int t=sc.nextInt();
			while(t>0){
				int n=sc.nextInt();
				int k=sc.nextInt();
				Solution ob =new Solution();
				String ans = ob.smallestNumber(n,k);
				System.out.println(ans);
				t--;
			}
		}
	}

}

class Solution{ 
    public String smallestNumber(int S, int D){
        if(S > (D*9))
			return "-1";

		char[] result = new char[D];
		S--;

		for(int index = D-1; index>=1; index--){
			if(S > 9){
				result[index] = '9';
				S -= 9;
			}
			else{
				result[index] = (char) ('0'+S);
				S = 0;
			}
		}

		result[0] = (char) ('0'+S+1);

		return new String(result);
    }
}
