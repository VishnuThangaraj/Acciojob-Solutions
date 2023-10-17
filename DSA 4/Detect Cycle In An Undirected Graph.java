import java.io.*;
import java.util.*;

// https://course.acciojob.com/idle?question=c5f395d4-c8ed-4c3c-88e9-285a189bddca

class Solution {
	private static boolean bfs(ArrayList<ArrayList<Integer>> adj, boolean[]visited,int source){
		Queue<Integer> storage = new LinkedList<>();
		storage.offer(source);

		while(!storage.isEmpty()){
			int current = storage.poll();
			//check if visited
			if(visited[current]) return true; // cycle found
			// mark visited
			visited[current] = true;

			//add the neighbours
			for(int nbrs : adj.get(current)){
				if(!visited[nbrs]) storage.offer(nbrs);
			}
		}

		return false; // no cycle found
	}
    public static boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
       // visited array
		boolean[]visited = new boolean[V];
	
		for(int source=0;source<V;source++){
			if(!visited[source]){
				boolean isCycle = bfs(adj,visited,source);
				if(isCycle) return true; //cycle found
			}
		}
		return false; // no cycle found
    }
}

public class Main{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int N, E;
        N = sc.nextInt();
        E = sc.nextInt();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i =0; i<N; i++) adj.add(i, new ArrayList<Integer>());    
        for(int i =0; i<E; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        boolean ans = Solution.isCycle(N,adj);
        if(ans)
            System.out.println("1");
        else
            System.out.println("0");
    }
}
