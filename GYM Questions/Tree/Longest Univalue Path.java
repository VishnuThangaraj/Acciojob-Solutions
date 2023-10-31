import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

// https://course.acciojob.com/idle?question=e14cd24c-0075-4a8c-86e9-88071ef9b23d

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}


class Main {
    static Node buildTree(String str){
       // System.out.print(str);
        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }
        String ip[] = str.split(" ");
        Node root = new Node(Integer.parseInt(ip[0]));
        Queue<Node> queue = new LinkedList<>(); 
        queue.add(root);
        int i = 1;
        while(queue.size()>0 && i < ip.length) {
            Node currNode = queue.peek();
            queue.remove();
            String currVal = ip[i];
            if(!currVal.equals("N")) {
                currNode.left = new Node(Integer.parseInt(currVal));
                queue.add(currNode.left);
            }
            i++;
            if(i >= ip.length)
                break;   
            currVal = ip[i];
            if(!currVal.equals("N")) {
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
    
	public static void main (String[] args) throws IOException{
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    Scanner sc = new Scanner(System.in);
            
			String s = sc.nextLine();
            
            //System.out.print(s);
			Node root = buildTree(s);
			Solution tree = new Solution();
			  System.out.print(tree.longestUnivaluePath(root));
            
		
	}
}
class Solution {

    static int ans;

    public static int findPath(Node root){
        if(root == null) return 0;

        // Sub-Trees
        int left = findPath(root.left);
        int right = findPath(root.right);

        int leftMax = 0, rightMax = 0;
        // check for same values
        if(root.left != null && root.left.data == root.data){
            leftMax += left + 1;
        }
        if(root.right != null && root.right.data == root.data){
            rightMax += right + 1;
        }

        // Update answer
        ans = Math.max(ans, leftMax+rightMax);
        return Math.max(leftMax, rightMax);
    }

	public static int longestUnivaluePath(Node root) {
		ans = 0;
        findPath(root);
        return ans;
	}
}
