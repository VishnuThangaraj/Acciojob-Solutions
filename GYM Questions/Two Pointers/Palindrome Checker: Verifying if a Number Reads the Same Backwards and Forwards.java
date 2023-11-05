import java.util.*;

// https://course.acciojob.com/idle?question=4701f6ad-1d3d-45a2-bbfd-f5bb99270d8f

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        //Write your code here and print the required output
        int reversed = 0, copy = N;

        while(copy > 0){
            reversed = (reversed*10)+copy%10;
            copy /= 10;
        }
        

        if(reversed == N)
            System.out.println(true);
        else
            System.out.println(false);
    }
}
