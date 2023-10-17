import java.io.*;
import java.util.*;

// https://course.acciojob.com/idle?question=ad1abf35-aa2c-4f0f-8fa3-46b85e164e4c

public class Main {
   static class Edge {
      int src;
      int nbr;
      int wt;

      Edge(int src, int nbr, int wt) {
         this.src = src;
         this.nbr = nbr;
         this.wt = wt;
      }
   }

   static class Pair implements Comparable<Pair> {
      int wsf;
      String psf;

      Pair(int wsf, String psf){
         this.wsf = wsf;
         this.psf = psf;
      }

      public int compareTo(Pair o){
         return this.wsf - o.wsf;
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
         int wt = Integer.parseInt(parts[2]);
         graph[v1].add(new Edge(v1, v2, wt));
         graph[v2].add(new Edge(v2, v1, wt));
      }

      int src = Integer.parseInt(br.readLine());
      int dest = Integer.parseInt(br.readLine());

      int criteria = Integer.parseInt(br.readLine());
      int k = Integer.parseInt(br.readLine());

      boolean[] visited = new boolean[vtces];
      multisolver(graph, src, dest, visited, criteria, k, src + "", 0);

      System.out.println("Smallest Path = " + spath + "@" + spathwt);
      System.out.println("Just Larger Path than " + criteria + " = " + cpath + "@" + cpathwt);
      System.out.println(k + "th largest path = " + pq.peek().psf + "@" + pq.peek().wsf);
   }

   //Solution

   static String spath; // smallest path
   static Integer spathwt = Integer.MAX_VALUE; //smallest path weight
   static String cpath; //ceil path
   static Integer cpathwt = Integer.MAX_VALUE; // ceil path weight
   static PriorityQueue<Pair> pq = new PriorityQueue<>();
   public static void multisolver(ArrayList<Edge>[] graph, int src, int dest, boolean[] visited, int criteria, int k, String psf, int wsf) {
		// psf(Path so Far) | wsf(Weight so far)
	   //mark as visited 
	   visited[src] = true;
	   
		// DESTINATION REACHED
		if(src == dest){
			//update the smallest path and smallest weight of the path
			if(wsf < spathwt){ 
				spathwt = wsf;
				spath = psf;
			}
			// update the ceilPath and ceilPath weight
			if(wsf > criteria && wsf < cpathwt){
				cpathwt = wsf;
				cpath = psf;
			}
			// Kth largest path
			pq.add(new Pair(wsf,psf));
			if(pq.size()>k) pq.remove(); //remove top element is queue is larger than k
			
			visited[src] = false; //BACKTRACKING
			return;
		}
	   
	   //visit unvisited nbrs
	   for(Edge e : graph[src]){
		   int nbr = e.nbr; //neighbour
		   int weight = e.wt; //weight of the edge
		   if(!visited[nbr]){
			   multisolver(graph,nbr,dest,visited,criteria,k,psf+nbr,wsf+weight);
		   }
	   }
	   visited[src] = false; //backtracking visited node
   }
}
