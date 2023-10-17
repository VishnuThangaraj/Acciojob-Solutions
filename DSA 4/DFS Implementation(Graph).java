import java.util.*;

// https://course.acciojob.com/idle?question=bc51d934-d08b-4b7d-a852-2dec91e07bce

class Solution {
	private static void dfsHelper(ArrayList<ArrayList<Integer>> graph, boolean[]visited, int n){
		System.out.print(n+" ");

		//mark as visited
		visited[n] = true;

		for(int nodes : graph.get(n)){
			if(visited[nodes] == false){
				dfsHelper(graph,visited,nodes);
			}
		}
	}
    public static void DFSTraversal(List<List<Integer>> edges, int n) {
		// create arrayList of ArrayList
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

		//create Empty ArrayList of n size
		for(int i=0; i<n; i++) graph.add(new ArrayList<Integer>());

		//add nodes to ArrayList
		for(List<Integer> edge : edges){
			int u = edge.get(0);
			int v = edge.get(1);
			graph.get(u).add(v);
			graph.get(v).add(u);
		}

		// Sort all the internal arrayLists
		for(int i=0;i<n;i++) Collections.sort(graph.get(i));

		//boolean array for marking visited nodes
		boolean[]visited = new boolean[n];

		dfsHelper(graph,visited,0);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();
        List<List<Integer>> ed = new ArrayList<>();
        for (int i = 0; i < e; i++) {
            List<Integer> l = new ArrayList<>();
            l.add(sc.nextInt());
            l.add(sc.nextInt());
            ed.add(l);
        }

        Solution ob = new Solution();
        ob.DFSTraversal(ed, n);
    }
}
