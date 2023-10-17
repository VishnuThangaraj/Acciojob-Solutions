import java.util.*;

// https://course.acciojob.com/idle?question=98332447-d28d-42ee-9843-3d4d9d5ea20d

class Solution {
 
    @SuppressWarnings("unchecked")
    
    public int canFinish(int n, int[][] prerequisites) {
        // create the Graph and calculate indegree
		ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
		for(int i=0;i<n;i++) graph.add(new ArrayList<Integer>());

		int[]indegree = new int[n];

		for(int[]node : prerequisites){
			int courseA = node[0];
			int courseB = node[1];
			graph.get(courseB).add(courseA);
			indegree[courseA]++;
		}

		// ADD ALL THE COURSE TO QUEUE WHICH HAS INDEGREE AS 0
		Queue<Integer> queue = new LinkedList<>();
		for(int ind=0; ind<n; ind++)
			if(indegree[ind] == 0) queue.offer(ind);

		while(!queue.isEmpty()){
			int current = queue.poll();

			// add nbrs to queue if they have indegree 0 after reducing
			for(int nbrs : graph.get(current)){
				indegree[nbrs]--;
				if(indegree[nbrs] == 0) queue.add(nbrs);
			}
		}

		// traverse the INDEGREE array to find any nodes are left
		for(int nodes : indegree)
			if(nodes != 0) return 0;  // not possible to arrange courses

		return 1; //possible to arrange courses
		
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        int M= sc.nextInt();

        int prerequisites[][] = new int[M][2];

        for(int i=0; i<M; i++){
            for(int j=0; j<2; j++)
                prerequisites[i][j]= sc.nextInt();
        }
        
        Solution Obj = new Solution();
        System.out.println(Obj.canFinish(N,prerequisites));

    }
}
