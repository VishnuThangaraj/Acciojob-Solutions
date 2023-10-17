import java.util.LinkedList;
import java.util.Queue;
import java.io.*;
import java.util.*;

//https://course.acciojob.com/idle?question=249439ec-42db-41ff-af2b-d14a69763904

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
    void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        Node root1 = buildTree(s1);
        String s2 = br.readLine();
        Node root2 = buildTree(s2);
        Solution g = new Solution();
        g.areTreesIdentical(root1, root2);
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
    public static void areTreesIdentical(Node root1, Node root2) {
        //boolean helper function
		if(identical(root1,root2)){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
    }

	public static boolean identical(Node node1, Node node2){
		if(node1 == null && node2 == null){
			return true;
		}
		//any one is null or data not matching
		if(node1 == null || node2 == null || node1.data != node2.data){
			return false;
		}

		//check for left and right sides
		return identical(node1.left,node2.left) && identical(node1.right,node2.right);
	}
}
