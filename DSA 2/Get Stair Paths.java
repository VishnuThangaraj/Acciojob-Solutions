import java.io.*;
import java.util.*;

// https://course.acciojob.com/idle?question=56fc9309-184a-4723-b8d0-839cbef69b83

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        ArrayList<String> paths = getStairPaths("",n);
        System.out.println(paths);
    }

    public static ArrayList<String> getStairPaths(String step,int target) {
        if(target==0){
			ArrayList<String> currentPair = new ArrayList<>();
			currentPair.add(step); // add the current target step and return to previous call
			return currentPair;
		}
		ArrayList<String> pairResult = new ArrayList<>();
		for(int limit=1;limit<=3 && limit<=target;limit++){
			pairResult.addAll(getStairPaths(step+limit,target-limit));
		}
		return pairResult;
    }
}                          
