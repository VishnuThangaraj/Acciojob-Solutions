import java.util.LinkedList;
import java.util.Queue;
import java.io.*;
import java.util.*;

//https://course.acciojob.com/idle?question=fa5f5548-8224-452e-8531-49dbbf53f5f5

class Main {
    static Node buildTree(String str) {
        if (str.length() == 0 || str.charAt(0) == 'N') {
            return null;
        }
        String ip[] = str.split(" ");
        Node root = new Node(Integer.parseInt(ip[0]));
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;
        while (queue.size() > 0 && i < ip.length) {
            Node currNode = queue.peek();
            queue.remove();
            String currVal = ip[i];
            if (!currVal.equals("N")) {
                currNode.left = new Node(Integer.parseInt(currVal));
                queue.add(currNode.left);
            }
            i++;
            if (i >= ip.length) break;
            currVal = ip[i];
            if (!currVal.equals("N")) {
                currNode.right = new Node(Integer.parseInt(currVal));
                queue.add(currNode.right);
            }
            i++;
        }

        return root;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        Node root1 = buildTree(s1);
        Solution g = new Solution();
        g.binaryTreeZigZagTraversal(root1);
    }
}


class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution {
    public static void binaryTreeZigZagTraversal(Node root) {
		if(root == null){
			return; //empty tree
		}
		
		//queue to store the Treenodes
		Deque<Node> storage = new LinkedList<>();
		
		//ad route to the queue
		storage.addFirst(root);
		
		//to add inreverse
		boolean reverse = false;
		
		while(!storage.isEmpty()){
		
			int size = storage.size(); //size of queue

			if(!reverse){ //add in front
				//run loop to queue size times
				for(int i=0; i<size; i++){
					Node parent = storage.pollFirst();
					System.out.print(parent.data+" ");
					//add child nodes to the queue
					if(parent.left!=null){
						storage.offerLast(parent.left);
					}
					if(parent.right!=null){
						storage.offerLast(parent.right);
					}
				}
			}else{
				//run loop to queue size times
				for(int i=0; i<size; i++){
					Node parent = storage.pollLast();
					System.out.print(parent.data+" ");
					//add child nodes to the queue
					if(parent.right!=null){
						storage.offerFirst(parent.right);
					}
					if(parent.left!=null){
						storage.offerFirst(parent.left);
					}
				}
			}

			//invert the boolean 
			reverse = !reverse;
		}
    }
}
