import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

//https://course.acciojob.com/idle?question=19b6bff8-dded-4cc9-a13d-cda60887b20f

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
            String s1 = sc.nextLine();
            

			Node root1 = buildTree(s);
            Node root2 = buildTree(s1);
			Solution tree = new Solution();
			boolean  ans = tree.isIsomorphic(root1,root2);
            System.out.println(ans);
		
	}
}
  


class Solution{
    
    public static boolean isIsomorphic(Node root1, Node root2) {
		if(root1 == null && root2 == null){
			return true; //both trees are null and same 
		}

		if(root1 == null || root2 == null){
			return false; // only one tree becomes null
		}

		//check if values are same
		if(root1.data != root2.data){
			return false; //not same values in nodes
		}

		//check the both sides
		return (isIsomorphic(root1.left,root2.right) && isIsomorphic(root1.right,root2.left));
	}
    
}

