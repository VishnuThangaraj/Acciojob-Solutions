import java.io.*;
import java.util.*;

// https://course.acciojob.com/idle?question=c47351e9-e120-488d-a193-0fdc5ab7a56b

class Solution {
    public long pairDifference(int []A, int n, int k) {
		//HashMap to store the integers and its occurance from array
		HashMap<Integer,Integer> storage = new HashMap<>();
		int count = 0;

		for(int value : A)
			storage.put(value,storage.getOrDefault(value,0)+1);

		//iterate the hashMap to find the valid pairs
		for(int key : storage.keySet()){
			int find = key + k; 
			if(find == key){
				if(storage.get(key) > 1) count++; //pair found
			}else if(storage.containsKey(find)) count++;
		}
		return count; // returns 0, if no pairs found
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,k;
        n = sc.nextInt();
        k = sc.nextInt();
        int []mat=new int[n];
        for(int i=0;i<n;++i){
            mat[i]=sc.nextInt();
        }
        Solution Obj = new Solution();
        System.out.println(Obj.pairDifference(mat,n,k));
        System.out.println('\n');
    }
}
