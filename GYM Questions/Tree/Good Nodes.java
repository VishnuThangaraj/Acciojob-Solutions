// https://course.acciojob.com/idle?question=88aa3a92-b18a-47c1-bff3-ac1491414f5b


import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

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
    
	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        Node root = buildTree(s);
        Solution tree = new Solution();
        int ans = tree.goodNodes(root);
        System.out.println(ans);  
	}
}
  


class Solution{
    int goodNodes(Node root) {
        if(root == null) return 0;
		return findGood(root, root.data, 0);
    }
    int findGood(Node node, int max, int count){
        if(node == null) return 0;

        if(node.data > max){
            return count;
        }

        return (count+1) + findGood(node.left, max, 0) + findGood(node.right, max, 0);
    }
}

