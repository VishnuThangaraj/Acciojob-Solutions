import java.util.*;
import java.lang.*;
import java.io.*;

// https://course.acciojob.com/idle?question=f418b898-6922-4c8a-91f3-9cf060a62957

class Solution {
	private boolean dfs(ArrayList<Integer>[] adj, boolean[]visited,boolean[]path,int source){
		path[source] = true;
		visited[source] = true;

		//add the neighbours
		for(int nbrs : adj[source]){
			if(path[nbrs]) return true; //cycle found
			else if(!visited[nbrs]){
				boolean isCycle = dfs(adj,visited,path,nbrs);
				if(isCycle) return true;
			}
		}

		path[source] = false; //backtracking
		return false; // no cycle found
	}
public boolean isCyclic(int V, ArrayList<Integer>[] adj) {
	 // visited array
	boolean[]visited = new boolean[V];
	boolean[]path = new boolean[V];

	for(int source=0;source<V;source++){
		if(!visited[source]){
			boolean isCycle = dfs(adj,visited,path,source);
			if(isCycle) return true; //cycle found
		}
	}
	return false; // no cycle found
   }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V, E;
        V = sc.nextInt();
        E = sc.nextInt();
        ArrayList<Integer>[] adj = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < E; i++) {
            int u, v;
            u = sc.nextInt();
            v = sc.nextInt();
            adj[u].add(v);
        }
        Solution obj = new Solution();
        boolean ans = obj.isCyclic(V, adj);
        if (ans == true) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
