import java.io.*;
import java.util.*;

// https://course.acciojob.com/idle?question=2b6f51da-cb55-412f-a0b5-47724e221ca3

class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        ArrayList<ArrayList<Integer>> Edges = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < M; i++) {
            ArrayList<Integer> e = new ArrayList<Integer>();
            e.add(sc.nextInt());
            e.add(sc.nextInt());
            Edges.add(e);
        }
        int U=sc.nextInt();
        int V=sc.nextInt();
        Solution ob = new Solution();
        if (ob.check(N, M, Edges,U,V)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        sc.close();
    }

}

class Solution {

	boolean DFS(ArrayList<ArrayList<Integer>> graph, boolean[]visited, boolean[]path, int source, int dest){
		if(source == dest){
			return true; //got the destination
		}
		path[source] = true;
		visited[source] = true;

		boolean gotPath = false;
		for(int nodes : graph.get(source)){
			if(!visited[nodes]){
				gotPath = DFS(graph,visited,path,nodes,dest);
				if(gotPath) return true; 
			}
		}

		//backtracking
		path[source] = false;

		return false;
	}
    
    boolean check(int N, int M, ArrayList<ArrayList<Integer>> Edges,int U,int V) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
		boolean[]visited = new boolean[N];
		boolean[]path = new boolean[N];

		// create the graph
		for(int i=0; i<N; i++) graph.add(new ArrayList<Integer>());

		for(ArrayList<Integer> edge : Edges){
			int u = edge.get(0);
			int v = edge.get(1);
			graph.get(u-1).add(v-1);
			graph.get(v-1).add(u-1);
		}

		// Sort all the internal arrayLists
		for(int i=0;i<N;i++) Collections.sort(graph.get(i));

		boolean got = DFS(graph,visited,path,U-1,V-1);

		return got;
    }
}
