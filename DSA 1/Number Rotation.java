import java.util.*;

// https://course.acciojob.com/idle?question=fb272629-c1b0-4f67-8109-01cb73847595

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k;
        n = sc.nextInt();
        k = sc.nextInt();
        sc.close();

		int temp =n;
		int count = 0;
		while(temp>0){
			temp/=10;
			count++;
		}

		int dis = (int)Math.pow(10,count-1);
		int result = 0;

		if(k>0){
			for(int i=1;i<=(k%count);i++){
				result = n%10;
				n/=10;
				n+=(result*dis);
			}
		}else if(k<0){
			for(int i=(k%count);i<0;i++){
				result = n/dis;
				n-=(result*dis);
				n = (n*10)+result;
			}
		}
		
		
		System.out.println(n);
    }
}
