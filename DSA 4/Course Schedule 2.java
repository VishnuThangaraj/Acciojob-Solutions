import java.util.*;

// https://course.acciojob.com/idle?question=6f9356f8-63d7-41b3-9967-0bcaf5d2e8b8

class Solution {
 
    @SuppressWarnings("unchecked")
    
    public int[] canFinish(int n, int[][] prerequisites) {
	    //create graph with given prerequisities
		ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
		for(int i=0; i<n; i++) graph.add(new ArrayList<Integer>());

		//to keep track of the indegree's
		int[]indegree = new int[n];

		ArrayList<Integer> courseDone = new ArrayList<>();
		
		// STEP - 1 : CALCULATE INDEGREE (INCOMING EDGES)
		for(int[]edge : prerequisites){
			int a = edge[0];
			int b = edge[1];
			graph.get(b).add(a); // b is dependent on a
			indegree[a]++;
		}

		// STEP - 2 : ADD ALL THE NODES TO QUEUE WHO ARE HAVING INDEGREE = 0
		Queue<Integer> queue = new LinkedList<>();
		for(int index=0; index<indegree.length; index++){
			if(indegree[index] == 0) queue.offer(index);
		}

		// STEP - 3 : ADD ALL THE NEIGHBOURS IF THEIR INDEGREE BECOMES 0
		while(!queue.isEmpty()){
			int current = queue.poll();
			courseDone.add(current);

			for(int node : graph.get(current)){
				indegree[node]--;
				if(indegree[node] == 0) queue.offer(node);
			}
		}

		if(courseDone.size() < n){
			//not possible to arrange the course , hence return empty array
			return new int[0];
		}

		//transfer the items in arrayList to array
		int index =0 ;
		int[] result = new int[n];
		for(int course : courseDone){
			result[index++] = course;
		}

		return result;
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
        int []ans=Obj.canFinish(N,prerequisites);
        if(ans.length==0)
            System.out.println(-1);
        else{
            for(int i=0; i<ans.length; i++){
                System.out.print(ans[i]+" ");
            }

            System.out.println("");
        }

    }
}
