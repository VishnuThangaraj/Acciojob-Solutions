import java.util.*;

// https://course.acciojob.com/idle?question=0310aa27-ae31-4a05-abcf-4201397be9bc

class Solution {
    public boolean CanVisitAllRooms(ArrayList<ArrayList<Integer>> rooms) {
        boolean[]visited = new boolean[rooms.size()];
		Queue<Integer> door = new LinkedList<>();
		//add all the keys of 0th room
		visited[0] = true;
		for(int key : rooms.get(0))
			door.offer(key);

		//explore the rooms with given keys
		while(!door.isEmpty()){
			int current = door.poll();
			//continue if already visited
			if(visited[current]) continue;

			//mark as visited
			visited[current] = true;

			//add all the keys from the current room
			for(int keys : rooms.get(current)){
				door.offer(keys);
			}
		}

		// CHECK IF ALL THE DOORS ARE VISITED
		for(boolean check : visited)
			if(!check) return false; // unvisited room found
			//System.out.print(check+" ");

		return true; // all rooms visited
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> r = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i < n; i++) {
            int m = sc.nextInt();
            ArrayList<Integer> temp = new ArrayList<Integer>();
            for(int j = 0; j < m; j++) {
                temp.add(sc.nextInt());
            }
            r.add(temp);
        }
	    Solution Obj = new Solution();
        if(Obj.CanVisitAllRooms(r))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
