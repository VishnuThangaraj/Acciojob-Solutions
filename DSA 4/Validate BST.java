import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

//https://course.acciojob.com/idle?question=3b992182-31dd-4aaa-a4fd-914a6a9669ff

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
    static Node treeBuilder(String str){  
        if(str.length()==0 || str.charAt(0)=='-'){
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
            if(!currVal.equals("-1")) {
                currNode.left = new Node(Integer.parseInt(currVal));
                queue.add(currNode.left);
            }
            i++;
            if(i >= ip.length)
                break;
            currVal = ip[i];
            if(!currVal.equals("-1")) {
                currNode.right = new Node(Integer.parseInt(currVal));
                queue.add(currNode.right);
            }
            i++;
        }
        
        return root;
    }
    static void printInorder(Node root){
        if(root == null)
            return;
        printInorder(root.left);
        System.out.print(root.data+" ");
        printInorder(root.right);
    }
    
  public static void main (String[] args) throws IOException{
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          int t=Integer.parseInt(br.readLine());
          while(t > 0){
              String s = br.readLine();
            Node root = treeBuilder(s);
              Solution g = new Solution();
              if(g.isBST(root))
              System.out.println("true");
          else
              System.out.println("false");
                t--;
        }
    }
  
}

class Solution{
	
    boolean isBST(Node node){
       // Your Code Here
       //helper function
		return isValid(node,null, null);
    }

	boolean isValid(Node node,Integer min, Integer max){
		if(node == null){
			return true;
		}

		//check the current node with min and max 
		if(min != null && node.data <= min){
			return false; //invalid BST
		}
		if(max != null && node.data >= max){
			return false; //invalid BST
		}

		//search for left and right nodes
		return isValid(node.left,min,node.data) && isValid(node.right,node.data,max);
	}
}
