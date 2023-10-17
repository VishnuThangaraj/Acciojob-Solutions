import java.io.*;
import java.util.*;

// https://course.acciojob.com/idle?question=9622e528-95ed-40e3-817b-52f209455545

class Main{
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
        int n,k;
        n=sc.nextInt();
        k=sc.nextInt();
        int[] a= new int[n];
        for(int i=0;i<n;i++){
          a[i] = sc.nextInt();
        }
        Solution obj=new Solution();
        System.out.println(obj.findPairs(a,n,k));		    
    }
}

class Solution
{
    public int findPairs(int[] nums,int n, int k) {
        // store all the integers and its occurance to Hashmap
        HashMap<Integer,Integer> storage  = new HashMap<>();
        int count =0;

        for(int value : nums) storage.put(value, storage.getOrDefault(value,0)+1);

        for(int key : storage.keySet()){
            int find = key + k;
            if(find == key){
                if(storage.getOrDefault(find,0) > 1) count++; //pair found
            }else if (storage.containsKey(find)) count++;
        }

        return count;
    }
}
