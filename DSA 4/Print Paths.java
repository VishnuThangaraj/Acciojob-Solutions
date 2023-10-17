import java.io.*;
import java.util.*;

// https://course.acciojob.com/idle?question=22e6cae8-a37e-4320-ae71-33322d382ed2

public class Main {
   static class Edge {
      int src;
      int nbr;

      Edge(int src, int nbr) {
         this.src = src;
         this.nbr = nbr;
      }
   }
	public static void dfs(ArrayList<Edge>[]graph, boolean[]visited, boolean[]paths, String path, int dest,int source ){		
		if(source == dest){ //reached the destination, print the path
			System.out.println(path+source);
			return;
		}
		
		 // mark as visited
		visited[source] = true;
		paths[source] = true;

		for(Edge a : graph[source]){
			if(!paths[a.nbr]){ //visit all the un-visited  nodes
				dfs(graph,visited,paths,path+a.src,dest,a.nbr);
			}
		}

		// backtracking visited places
		paths[source] = false;
		visited[source] = false; 
	}
	public static void printAllPath(ArrayList<Edge>[]graph , int src , int dest , int n){ 
		// use dfs and consider as dis-connected graph
		boolean[]visited = new boolean[n];
		boolean[]paths = new boolean[n];
		
		for(ArrayList<Edge> nodes : graph){
		   for(Edge a : nodes){
			   if(a.src == src) { //find the node which match the source
				   paths[a.src] = true; visited[a.src] = true;
				   dfs(graph,visited,paths,a.src+"",dest,a.nbr);
			   }
		   }
		}
	}
   
   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int vtces = Integer.parseInt(br.readLine());
      ArrayList<Edge>[] graph = new ArrayList[vtces];
      for (int i = 0; i < vtces; i++) {
         graph[i] = new ArrayList<>();
      }

      int edges = Integer.parseInt(br.readLine());
      for (int i = 0; i < edges; i++) {
         String[] parts = br.readLine().split(" ");
         int v1 = Integer.parseInt(parts[0]);
         int v2 = Integer.parseInt(parts[1]);
         graph[v1].add(new Edge(v1, v2));
      }

      int src = Integer.parseInt(br.readLine());
      int dest = Integer.parseInt(br.readLine());

      printAllPath(graph,src,dest,vtces);
   }


}
