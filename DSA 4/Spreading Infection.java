import java.io.*;
import java.util.*;

// https://course.acciojob.com/idle?question=26b8e834-7f3c-4b98-abe6-07a88ff548f1

public class Main {
   static class Edge {
      int src;
      int nbr;

      Edge(int src, int nbr) {
         this.src = src;
         this.nbr = nbr;
      }
   }

	static class Pair{
		int source;
		int time;

		//constructor
		Pair(int source,int time){
			this.source = source;
			this.time = time;
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
         graph[v2].add(new Edge(v2, v1));
      }

      int src = Integer.parseInt(br.readLine());
      int t = Integer.parseInt(br.readLine());
      
      int infectedCount = 0;
	   boolean[]affected = new boolean[vtces];

	   // use BFS
	   Queue<Pair> queue = new LinkedList<>();
	   queue.offer(new Pair(src,1));

	   while(!queue.isEmpty()){
		   Pair current = queue.poll();
		   if(affected[current.source]) continue;
		   //mark as affected
		   affected[current.source] = true;
		   
		   //increase affected count for each un-affected neighbours
		   if(current.time <= t) infectedCount++;

		   for(Edge nbrs : graph[current.source]){
			   if(affected[nbrs.nbr] == false){
				   queue.add(new Pair(nbrs.nbr, current.time+1));
			   }
		   }
	   }
	   System.out.println(infectedCount);
   }

}
