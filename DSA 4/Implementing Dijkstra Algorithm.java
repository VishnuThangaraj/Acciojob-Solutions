import java.io.*;
import java.util.*;
import java.lang.*;

// https://course.acciojob.com/idle?question=92610f2e-18e2-4b4b-838c-bdebed8f07de

public class Main {
	//create a class which hold source, path-so-far and weight-so-far
	public static class Pair{
		int source;
		String psf;
		int wsf;

		//constructor
		Pair(int source, String path, int weight){
			this.source = source;
			this.psf = path;
			this.wsf = weight;
		}
	}
  public static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S){
     PriorityQueue<Pair> queue = new PriorityQueue<>( (a,b) -> {
		 return a.wsf - b.wsf; //Priorityqueue based on weight of the pairs(min)
	 });
	//add the source
	  queue.offer(new Pair(S,S+"",0));
	  boolean[]visited = new boolean[V];
	  int[]result = new int[V]; //result
	  //make all values as -1
	  for(int index=0; index<result.length; index++)
		  result[index] = -1;

	  while(!queue.isEmpty()){
		  Pair current = queue.poll();

		  if(visited[current.source]) continue;
		  //mark as visited
		  visited[current.source] = true;

		  result[current.source] = current.wsf;
		  //add the neighbours to queue
		  for(ArrayList<Integer> edge : adj.get(current.source)){
			  int nbr = edge.get(0);
			  int weight = edge.get(1);
			  //add to queue if un-visted
			  if(!visited[nbr])
				  queue.offer(new Pair(nbr,current.psf+nbr,current.wsf+weight));
		  }
		  
	  }

	  return result;
  }

  public static void main(String args[]) throws IOException {

        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
            String str[] = read.readLine().trim().split(" ");
            int V = Integer.parseInt(str[0]);
            int E = Integer.parseInt(str[1]);
    
            ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<ArrayList<ArrayList<Integer>>>();
            for(int i=0;i<V;i++)
            {
                adj.add(new ArrayList<ArrayList<Integer>>());
            }
            
            int i=0;
            while (i++<E) {
                String S[] = read.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                int w = Integer.parseInt(S[2]);
                ArrayList<Integer> t1 = new ArrayList<Integer>();
                ArrayList<Integer> t2 = new ArrayList<Integer>();
                t1.add(v);
                t1.add(w);
                t2.add(u);
                t2.add(w);
                adj.get(u).add(t1);
                adj.get(v).add(t2);
            }
            
            int S = Integer.parseInt(read.readLine());
            
            int[] ptr = dijkstra(V, adj, S);
            
            for(i=0; i<V; i++)
                System.out.print(ptr[i] + " ");
            System.out.println();
        }
    

}
