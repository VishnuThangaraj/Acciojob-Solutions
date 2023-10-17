import java.util.*;

//https://course.acciojob.com/idle?question=86402bd0-eeed-4c05-bf51-6ef08065b6c8

class Solution {
	//use arrayList to store hashSet keys
	ArrayList<Integer> storage;
	//constructor
	Solution(){
		storage = new ArrayList<>();
	}
	
	//adding to the arrayList
    public void add(int key) {
		if(storage.contains(key)){ 
			//if already present in arrayList dont add as hashSet contains unique values
			return;
		}
        storage.add(key);
    }

	//remove the element from arrayList
    public void remove(int key) {
		//removing by value instead of index
        storage.remove(Integer.valueOf(key));
    }

	//check weather the key is there in list or not
    public boolean contains(int key) {
        if(storage.contains(key)){
			return true; //key is already present in arrayList
		}
		return false;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        Solution Obj = new Solution();
        for (int i = 0; i < q; i++) {
            int choice = sc.nextInt();
            int key = sc.nextInt();
            if (choice == 1) {
                // Add
                Obj.add(key);
            } else if (choice == 2) {
                // contains
                if (Obj.contains(key)) {
                    System.out.print("True ");
                } else {
                    System.out.print("False ");
                }
            } else if (choice == 3) {
                // remove
                Obj.remove(key);
            }
        }
        System.out.println();
        sc.close();
    }
}
