import java.io.*;
import java.util.*;

// https://course.acciojob.com/idle?question=ea0ba181-faaa-4ec3-89d2-c40d022b321f

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(read.readLine());
        
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        for(int i=0; i<N; i++)
        {
            String S[] = read.readLine().split(" ");
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j=0; j<N; j++)
                temp.add(Integer.parseInt(S[j]));
            adj.add(temp);
        }

        Solution ob = new Solution();
        System.out.println(ob.components(adj,N));
    }
}

class Solution {
	private static void helper(ArrayList<ArrayList<Integer>> graph, boolean[]visited, int n){
		//mark as visited
		visited[n] = true;

		ArrayList<Integer> current = graph.get(n);

		for(int nbr =0; nbr < current.size(); nbr++){
			if(n != nbr  && current.get(nbr) == 1){
				if(!visited[nbr]){
					helper(graph,visited,nbr);
				}
			}
		}
	}
    int components(ArrayList<ArrayList<Integer>> adj, int N) {
        int componentsCount = 0;

		//visited array to keep track of visited places
		boolean[]visited = new boolean[N];

		for(int source=0;source<N;source++){
			//check if visited, and apply DFS in unvisited nodes
			if(!visited[source]){
				componentsCount++;
				helper(adj,visited,source);
			}
		}
		return componentsCount;
    }
}
