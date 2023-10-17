import java.util.*;
import java.lang.*;
import java.io.*;

// https://course.acciojob.com/idle?question=7a900b84-a1ca-4b4d-865d-af1793ae8b1f

class Main
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine().trim();
        int N = S.length();
        Solution ob = new Solution();
        String[] element = br.readLine().trim().split("\\s+");
        int[] f = new int[N];
        for(int i = 0; i < N; i++){
            f[i] = Integer.parseInt(element[i]);
        }
        ArrayList<String> res  = ob.huffmanCodes(S,f,N);
        for(int i = 0; i < res.size(); i++)
        {
            System.out.print(res.get(i)+" ");
        }
        System.out.println();
    
	}
}

class Solution {
	class Node{
		char letter;
		int frequency;
		Node left;
		Node right;
		//constructor
		Node(char letter, int freq){
			this.letter = letter;
			this.frequency = freq;
		}
	}
	public void DFS(Node node, ArrayList<String> result, String Path){
		if(node.letter != '*'){
			// add the path to result
			result.add(Path);
			return;
		}

		//perferm left and right traversals
		DFS(node.left,result,Path+"0");
		DFS(node.right,result,Path+"1");
	}
    public ArrayList<String> huffmanCodes(String S, int f[], int N){
        // Create priority Queue
		PriorityQueue<Node> storage = new PriorityQueue<>( (a,b) -> {
			return a.frequency < b.frequency ? -1 : 1;
		});

		//add all the characters to priorityQueue
		for(int i=0; i<N; i++)
			storage.offer(new Node(S.charAt(i), f[i]));

		while(storage.size() > 1){
			// remove two nodes
			Node first = storage.poll();
			Node second = storage.poll();

			//create new node and add both nodes to left and right
			Node current = new Node('*', first.frequency + second.frequency);
			current.left = first;
			current.right = second;

			// add the newly created node to priorityQueue
			storage.offer(current);
		}

		Node huffmanRoot = storage.poll();

		// preform preOrder traversal and store answers in ArrayList
		ArrayList<String> result = new ArrayList<>();

		DFS(huffmanRoot, result, "");

		return result;
    }
    
}
