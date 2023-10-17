import java.util.*;
import java.io.*;

// https://course.acciojob.com/idle?question=9b2d5eac-703f-487c-8921-a9a641811594

class Graph {
    public int vertices;
    public ArrayList<Integer>[] adjList;
 
    Graph(int v) {
        this.vertices = v+1;
        adjList = new ArrayList[v+1];
        
        for (int i = 0; i <= v; i++) adjList[i] = new ArrayList<Integer>();
    }
 
    void addEdge(int v, int w) {
        adjList[v].add(w);
     
    }
 
    void BFS(int x) {
        // Queue to store the nodes
		Queue<Integer> storage = new LinkedList<>();

		//to mark the visited vertices
		boolean[] visited = new boolean[vertices];

		storage.add(x);

		while(!storage.isEmpty()){
			int current = storage.poll();

			//check if visited
			if(visited[current])  continue;
				
			System.out.print(current+" ");

			//mark as visited
			visited[current] = true;

			for(int nodes : adjList[current]){
				storage.add(nodes);
			}
		}
		
    }
}
 
public class Main {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();
        Graph g = new Graph(110);
        for(int i =0;i<e;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            g.addEdge(x,y);
        }
        g.BFS(0);
    }
}
