import java.io.*;
import java.util.*;

//https://course.acciojob.com/idle?question=f2b3153c-244d-4ff8-9885-deeebed127dd

class Animal {
    void walk() {
        System.out.println("I am walking");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("I am flying");
    }

	//new method
  void sing(){
	  System.out.println("I am singing");
  }
}

class Solution {
    public void solve() {
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();
    }

}

class Main {

    public static void main(String[] args) {
        Solution ob = new Solution();
        ob.solve();
    }
}
