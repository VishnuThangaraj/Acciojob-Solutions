import java.util.LinkedList;
import java.util.Queue;
import java.io.*;
import java.util.*;

//https://course.acciojob.com/idle?question=a8e99a89-cde0-4f26-9570-49dff12b7624

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
        System.out.println(g.sizeOfTree(root1));
        System.out.println(g.sumOfTree(root1));
        System.out.println(g.maxOfTree(root1));
        System.out.println(g.heightOfTree(root1));
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
	// calculate the number of nodes
    public int sizeOfTree(Node root) {
		if(root == null){
			return 0;
		}
		int size = 1;

		size+= sizeOfTree(root.left);
		size+= sizeOfTree(root.right);

		return size;
    }

	//calculate the total values of each node in Tree
    public int sumOfTree(Node root) {
		if(root == null){
			return 0;
		}
		int total = root.data;

		//add value of right and left to total and make recursive call
		total+= sumOfTree(root.left);
		total+= sumOfTree(root.right);

		return total;
    }
	
	// find the maximum node in the tree
    public int maxOfTree(Node root) {
		if(root == null){
			return 0;
		}
		int total = root.data;

		//add value of right and left to total and make recursive call
		total = Math.max( total, maxOfTree(root.left));
		total = Math.max( total, maxOfTree(root.right));

		return total;
    }

	//find the height of the tree
    public int heightOfTree(Node root) {
		//helper function
		return heightOfTree(root,0);
    }

	public int heightOfTree(Node root,int height) {
		if(root == null){
			return height;
		}

		return Math.max(heightOfTree(root.left,height+1),heightOfTree(root.right,height+1));
    }
}
