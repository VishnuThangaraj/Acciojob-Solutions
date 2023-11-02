import java.util.*;

// https://course.acciojob.com/idle?question=b58d2387-3593-41c2-8830-e4fc3ae6a8a8

public class Main {
    static void timeConversion(String s) {
        String[]time=new String[4];
		int i=0,j=0,ind=0;

		while(j<s.length()){
			char letter = s.charAt(j);
			if(letter == ':' || letter == 'A' || letter == 'P'){
				String word = s.substring(i,j);
				time[ind]=word;
				i=j+1;ind++;
			}else if(letter == 'M'){
				String word = s.substring(i-1,j+1);
				time[ind]=word;
			}
			j++;
		}
		
		int h=Integer.parseInt(time[0]);
		// System.out.print(h);
		if(time[3].equals("AM")){
			if(h==12){
				System.out.print("00:"+time[1]+":"+time[2]);
			}else{
				System.out.print(time[0]+":"+time[1]+":"+time[2]);
			}
		}else{
			if(h==12){
				System.out.print(time[0]+":"+time[1]+":"+time[2]);
			}else{
				h+=12;
				System.out.print(h+":"+time[1]+":"+time[2]);
			}
		}
		
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        timeConversion(str);
        sc.close();
    }
}
