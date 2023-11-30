// https://course.acciojob.com/idle?question=23338097-ffdd-415c-bdd5-7cc0cad3cf51

import java.io.*;
import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

class Main {

  public static void main(String[] args) throws IOException {
    //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();  
    int a = sc.nextInt();  
    int b = sc.nextInt();  
    int c = sc.nextInt();  
    ParkingSystem answer = new ParkingSystem(a,b,c);
    for(int i=0;i<n;i++)
    {
      int q = sc.nextInt(); 
      System.out.println(answer.addCar(q));
    }
  }
}

class ParkingSystem {
    private static int big, medium, small;
 
    public ParkingSystem(int small, int medium, int big) {
        ParkingSystem.small = small;
        ParkingSystem.medium = medium;
        ParkingSystem.big = big;
    }

    public boolean addCar(int carType) {
        if(carType == 1){ // small
            if(small == 0) return false;
            small--;
            return true;
        }else if(carType == 2){ // medium
            if(medium == 0) return false;
            medium--;
            return true;
        }else{ // big
            if(big == 0) return false;
            big--;
            return true;
        }
    }
}
