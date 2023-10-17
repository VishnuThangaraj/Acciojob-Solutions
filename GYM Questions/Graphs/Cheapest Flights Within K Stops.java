import java.io.*;
import java.util.*;

// https://course.acciojob.com/idle?question=07f39ba2-d302-49aa-8b8d-527038e4f2d5

class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();
        int arr[][] = new int[e][3];
        for (int i = 0; i < e; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
            arr[i][2] = sc.nextInt();
        }
        int src = sc.nextInt();
        int dst = sc.nextInt();
        int k = sc.nextInt();
        Solution Obj = new Solution();
        int ans = Obj.findCheapestPrice(n, arr, src, dst, k);
        System.out.println(ans);
        sc.close();
    }
}

class Solution {
	class Pair{
		int source;
		int dest;
		int price;
		//constructor
		Pair(int source, int dest, int price){
			this.source = source;
			this.dest = dest;
			this.price = price;
		}
	}
	public void DFS(ArrayList<ArrayList<Pair>> graph, boolean[]visited, int[] min, int src, int dest, int stops, int price){
		if(visited[src] || price > min[0]) return; //already visited or high price
		
		if(src == dest && stops >=0){
			min[0] = price;
		}

		if(stops <= 0) return ; // no more stops to make route

		//mark as visited
		visited[src] = true;

		for(Pair current : graph.get(src)){
			DFS(graph, visited, min, current.dest, dest, stops-1, price+current.price);
		}

		//backtracking
		visited[src] = false;
	}
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        //create the Directed graph
		ArrayList<ArrayList<Pair>> graph = new ArrayList<>();
		//populate the graph
		for(int i=0;i<n;i++) graph.add(new ArrayList<Pair>());

		for(int[]location : flights){
			// array will be like [start, destination, price]
			int start = location[0];
			int dest = location[1];
			int price = location[2];
			graph.get(start).add(new Pair(start, dest, price));
		}

		int price = 0;
		boolean[]visited = new boolean[n];

		int[] min = {Integer.MAX_VALUE};
		DFS(graph, visited, min, src, dst, k+1, 0);

		return min[0];
    }
}
