import java.util.*;

// https://course.acciojob.com/idle?question=ddd1c6ba-a17f-4250-a86a-01ce73769455

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

		if(month==1 || month==3 || month==5 ||month==7 ||month==8 || month==10||month==12){
			System.out.println(31);
		}else if(month == 2){
			System.out.println(28);
		}else{
			System.out.println(30);
		}
    }
}
