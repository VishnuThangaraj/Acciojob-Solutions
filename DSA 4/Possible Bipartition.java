import java.util.*;

// https://course.acciojob.com/idle?question=717ac001-d919-4e01-ae4e-db1cbc4b8cba

class Solution {
	public class Pair{
		int source;
		int color;
		//constructor
		Pair(int source, int color){
			this.source = source;
			this.color = color;
		}
	}
   
    public int possibleBipartition(int n, int[][] dislikes) {
        // create graph
		ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
		for(int i=0;i<=n; i++) graph.add(new ArrayList<Integer>());

		for(int[]nodes : dislikes){
			int a = nodes[0];
			int b = nodes[1];
			graph.get(a).add(b);
			graph.get(b).add(a);
		}

		int[]partition = new int[n+1]; //n+1 because 1 based indexing
		

		// GRAPH MAY HAVE COMPONENTS ... TRY FOR ALL NODES
		for(int src=1;src<=n;src++){
			if(partition[src] != 0) continue;
			Queue<Pair> queue = new LinkedList<>();
			queue.offer(new Pair(src,1)); //stores source and its color

			while(!queue.isEmpty()){
				Pair current = queue.poll();
	
				//if already coloured continue
				if(partition[current.source] != 0) continue;
				partition[current.source] = current.color;
	
				int oppColor = current.color == 1 ? -1 : 1;
	
				//add the neighbours
				for(int nbrs : graph.get(current.source)){
					if(partition[nbrs] == 0) queue.add(new Pair(nbrs,oppColor));
					else if (partition[nbrs] != oppColor) return 0;
				}
			}
		}
		

		return 1; //possible to 
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        int M= sc.nextInt();

        int dislike[][] = new int[M][2];

        for(int i=0; i<M; i++){
            for(int j=0; j<2; j++)
                dislike[i][j]= sc.nextInt();
        }
        
        Solution Obj = new Solution();
        System.out.println(Obj.possibleBipartition(N,dislike));

    }
}
