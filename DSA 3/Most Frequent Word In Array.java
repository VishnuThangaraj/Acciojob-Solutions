import java.io.*;
import java.util.*;

//https://course.acciojob.com/idle?question=4ba002e3-51e3-4770-abdf-94f04d3aef69

class Solution {
    public void mostFrequent(String []arr, int n) {
        // use hashmap to store the string and occurance
		HashMap<String,Integer> storage = new HashMap<>();

		//add all the elements in the hashmap
		for(int index=0; index<arr.length; index++){
			if(storage.containsKey(arr[index])){ //string already in hashMap
				//update the count of occurance of the string in hashMap
				storage.put(arr[index], storage.get(arr[index])+1);
			}
			else{ //string not present in the HashMap
				storage.put(arr[index], 1);
			}
		}

		String maxString = "";
		int occurance = 0;
		
		//traverse throught the array and find the last maximum repeated value
		for(int index=0; index<arr.length; index++){
			int current = storage.get(arr[index]);
			//if greater or equal to maximum assign as maximum
			if(current >= occurance){
				occurance = current;
				maxString = arr[index];
			}
		}

		//print the max occured string
		System.out.println(maxString);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        String []arr = new String[n];
        for(int i=0;i<n;++i){
                arr[i] = sc.next();
        }
        Solution Obj = new Solution();
        Obj.mostFrequent(arr,n);  
        System.out.println('\n');
    }
}
