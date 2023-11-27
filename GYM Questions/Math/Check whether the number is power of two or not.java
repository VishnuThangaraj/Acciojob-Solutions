// https://course.acciojob.com/idle?question=4f0300b9-a314-4598-b0d1-9725812d3c1c

import java.util.*;

public class Main {

    public static boolean checkPowerofTwo(int n){
        int num = 1;
        while(true){
            if(num == n){
                break;
            }else if(num > n){
                return false;
            }
            num*=2;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if(checkPowerofTwo(n))System.out.println("true");
        else System.out.println("false");

    }
}
