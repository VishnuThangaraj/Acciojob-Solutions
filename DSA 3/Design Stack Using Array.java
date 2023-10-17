import java.util.*;

//https://course.acciojob.com/idle?question=6741eaff-749d-4bef-a8c9-7c768de975a0

class Main {
    public static void main(String[] args) {
        StackUsingLinkedlist obj = new StackUsingLinkedlist();
        Scanner sc = new Scanner(System.in);
        int q;
        q = sc.nextInt();
        while (q-- > 0) {
            int x;
            x = sc.nextInt();
            if (x == 1) {
                int y;
                y = sc.nextInt();
                obj.push(y);
            }
            if (x == 2) {
                System.out.println(obj.peek());
            }
            if (x == 3) {
                obj.pop();
            }
            if (x == 4) {
                obj.display();
            }
        }
        sc.close();
    }
}

class StackUsingLinkedlist {

    ArrayList<Integer> storage;

	//constructor for initializing the value
    StackUsingLinkedlist() {
        storage = new ArrayList<>();
    }

	//adding element to the arrayList
    public void push(int x) {
        storage.add(x); 
    }

	//view the last element added
    public int peek() {
        if(storage.size() == 0){ // no elements .. so return -1
			return -1;
		}

		return storage.get(storage.size()-1); //return the last element added
    }

	//remove the value added last
    public void pop() {
        if(storage.size() == 0){ // no elements to remove.. so return without any modification
			return;
		}
		storage.remove(storage.size()-1);
    }

	//display the elements in stack(ArrayList) 
    public void display() {
        for(int index= storage.size() -1 ; index >=0 ; index--){
			//printing backwards
			System.out.print(storage.get(index)+" "); //print all the elements
		}System.out.println();
    }
}
