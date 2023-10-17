import java.util.LinkedList;
import java.util.Queue;
import java.io.*;
import java.util.*;

//https://course.acciojob.com/idle?question=87b0d2e6-d58a-4149-a832-70355e59043b

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
        System.out.println(g.diameter(root1));
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

    
    public static int diameter(Node root) {
        int[] range = new int[1];
		diameter(root,range);
		return range[0]+1;
    }

	//find diameter
	public static int diameter(Node node,int[]range){
		if(node == null){
			return 0;
		}

		//first left
		int Left = diameter(node.left,range);
		//then right
		int Right = diameter(node.right,range);

		//max of left+right vs range already in array
		range[0] = Math.max(range[0], Left+Right);

		return 1+Math.max(Left,Right);
	}
}
