import java.util.*;
import java.io.*;
import java.lang.*;

// https://course.acciojob.com/idle?question=1130ab43-b03e-4002-8f9a-877ecd02cbd0

@SuppressWarnings("unchecked")
class Solution{
	static class Pair{
		int start;
		int dest;
		int weight;
		//constructor
		Pair(int start, int dest, int weight){
			this.start = start;
			this.dest = dest;
			this.weight = weight;
		}
	}

	public static void DFS(ArrayList<ArrayList<Pair>> graph, boolean[]visited, ArrayList<Integer> result,int[] min, int weight, int source){
		if (visited[source] || weight > min[0]){
			return; // already visited
		}
		// reached the destination
		if (source == graph.size()-1){
			if(weight < min[0]){ // current path is smaller than minimum
				min[0] = weight;
				result.clear();
			}
			result.add(weight);
		}
		//mark as visited
		visited[source] = true;

		for(Pair current : graph.get(source)){
			DFS(graph,visited,result,min,weight+current.weight,current.dest);
		}

		// backtracking
		visited[source] = false;
	}
	
    public static int countPaths(int n, int[][] roads){
        ArrayList<ArrayList<Pair>> graph = new ArrayList<>();

		for(int i=0; i<n; i++) graph.add(new ArrayList<Pair>());
		//create the graph
		for(int[] node : roads){
			int st = node[0];
			int dest = node[1];
			int wt = node[2];
			graph.get(st).add(new Pair (st,dest,wt));
			graph.get(dest).add(new Pair (dest,st,wt));
		}

		boolean[]visited = new boolean[graph.size()];
		ArrayList<Integer> result = new ArrayList<>();
		int[]min = {Integer.MAX_VALUE};
		
		DFS(graph, visited, result, min, 0, 0);

		return result.size();
    }
}
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] edges = new int[m][3];
        for(int i = 0 ; i < m ; ++i){
            edges[i][0] = sc.nextInt();
            edges[i][1] = sc.nextInt();
            edges[i][2] = sc.nextInt();

        }
        System.out.print(Solution.countPaths(n,edges));
    }
}
