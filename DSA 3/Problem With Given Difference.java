import java.io.*;
import java.util.*;

// https://course.acciojob.com/idle?question=803b4abc-3829-4b3b-9dab-74da720ff06a

class Solution {
    public int givenDifference(int []A, int n, int B) {
        //HashSet to store the integers from array
		HashSet<Integer> storage = new HashSet<>();

		for(int value : A){
			if(value > 0){
				if(storage.contains(value-B) || storage.contains(B+value)){
					return 1; //pair found
				}
			}
			storage.add(value);
		}

		return 0; // no pairs found
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,B;
        n = sc.nextInt();
        int []mat=new int[n];
        for(int i=0;i<n;++i){
            mat[i]=sc.nextInt();
        }
        B = sc.nextInt();
        Solution Obj = new Solution();
        System.out.println(Obj.givenDifference(mat,n,B));
        System.out.println('\n');
    }
}
