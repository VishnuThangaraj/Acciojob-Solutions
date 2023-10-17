import java.util.*;

//https://course.acciojob.com/idle?question=d5a614f4-6a57-4934-bf7a-a0eeefdf846b

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        input.nextLine();
        StringBuilder str=new StringBuilder(input.nextLine());
        
        solve(str,n);

        input.close();
    }

	public static boolean checkRepeat(boolean[]repeat,int st,int end){
		for(int k=st;k<end;k++){
			if(repeat[k]==true){
				return false;
			}
		}
		return true;
	}

	static boolean checkAJ(long num,long[]AJ){
		if(num==0 || num==1){
			return false;
		}
		for(int i=0;i<AJ.length;i++){
			if(num==AJ[i]){
				return true;
			}else if(num%AJ[i]==0){
				return false;
			}
		}
		return true;
	}
	
    public static void solve(StringBuilder str,int n){
		long[]AJ = {2,3,5,7,11,13,17,19,23,29};
		int count =0;
		boolean[]repeat = new boolean[n];
		for(int l=1;l<=str.length();l++){
			for(int i=0;i<=str.length()-l;i++){
				String Snum = str.substring(i,i+l);
				long num = Long.parseLong(Snum);

				if(checkAJ(num,AJ)==true && checkRepeat(repeat,i,i+l)==true){
					count++;
					for(int v=i;v<i+l;v++){
						repeat[v]=true;
					}
				}
			}
		}
		System.out.println(count);
    }
}
