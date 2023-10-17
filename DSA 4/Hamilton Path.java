import java.io.*;
import java.util.*;

// https://course.acciojob.com/idle?question=696e11ef-b9f2-4691-889a-2b22d7c97076

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
        Solution ob = new Solution();
        if (ob.check(N, M, Edges)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        sc.close();
    }

}

class Solution {

	boolean DFS(ArrayList<ArrayList<Integer>> graph, boolean[]path, ArrayList<Integer> pathSoFar, int source){
		int size = graph.size() -1;

		if(path[source]) return false;
		//mark as visited and add path
		path[source] = true;
		pathSoFar.add(source);

		//check all paths are visited or not
		if(pathSoFar.size() == size){
			return true;
		}

		//check all the neighbours
		for(int nbrs : graph.get(source)){
			boolean gotPath = DFS(graph, path, pathSoFar, nbrs);
			if(gotPath) return true;
		}

		//backtrack
		path[source] = false;
		pathSoFar.remove(pathSoFar.size()-1);

		return false; //path not found
	}
    
    boolean check(int N, int M, ArrayList<ArrayList<Integer>> Edges) {
        // create graph
		ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
		for(int i=0; i<=N; i++) graph.add(new ArrayList<Integer>());

		for(ArrayList<Integer> edge : Edges){
			int i = edge.get(0);
			int j = edge.get(1);
			graph.get(i).add(j);
			graph.get(j).add(i);
		}

		boolean[]path = new boolean[N+1];
		ArrayList<Integer> pathSoFar = new ArrayList<>();

		for(int node=1; node<=N; node++){
			boolean gotPath = DFS(graph, path, pathSoFar, node);
			if(gotPath) return true;
		}
		

		return false;
    
    }
}
