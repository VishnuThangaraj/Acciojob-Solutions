import java.util.*;

//https://course.acciojob.com/idle?question=560ab8d1-ed6f-45e0-b3be-a0d1c1d56499

class Solution {
    static void missingNumbers(int n, int arr[], int m, int brr[]) { //O(n)
        //create two hashMap and put the elements
		HashMap<Integer, Integer> first = new HashMap<>();
		HashMap<Integer, Integer> second = new HashMap<>();

		//sort the arrays before adding to hashmap
			Arrays.sort(arr);
			Arrays.sort(brr);
		
		//add first array to hashMap
		for(int index=0; index<n; index++){ //O(n)
			int current = arr[index];
			//check the number already contains in HashMap
			if(first.containsKey(current)){
				//update the occurance of the particular number
				first.put(current, first.get(current)+1);
			}
			else{ //element not found in HashMap... add it
				first.put(current, 1);
			}
		}

		//add second array to hashMap
		for(int index=0; index<m; index++){ //O(n)
			int current = brr[index];
			//check the number already contains in HashMap
			if(second.containsKey(current)){
				//update the occurance of the particular number
				second.put(current, second.get(current)+1);
			}
			else{ //element not found in HashMap... add it
				second.put(current, 1);
			}
		}

		boolean flag = false; //to check atleast one value is printedy

		//to avoid repeated values to be printed use hashSet
		HashSet<Integer> duplicate = new HashSet<>();
		
		//check for the missing numbers..iterate the second array
		for(int index=0; index<m; index++){
			int current = brr[index];
			if(first.containsKey(current)){
				if(first.get(current) == second.get(current)){
					continue; //same occurance
				}
			}
			if(!duplicate.contains(current)){
				flag = true; //atleast one nuber is printed
				System.out.print(current+" ");
				duplicate.add(current); //add to duplicates hashset
			}
			
		}

		if(!flag){ //no elements are printed
			System.out.print(-1);
		}
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }

        int m = sc.nextInt();
        int brr[] = new int[m];
        for(int i=0; i<m; i++){
            brr[i]= sc.nextInt();
        }

        Solution Obj = new Solution();
        Obj.missingNumbers(n,arr,m,brr);
    }
}
