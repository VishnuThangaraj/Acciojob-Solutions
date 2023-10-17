import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

//https://course.acciojob.com/idle?question=c1c361bd-7aa2-49e7-801d-60996615cfd1

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
    static void printInorder(Node root){
        if(root == null)
            return;
            
        printInorder(root.left);
        System.out.print(root.data+" ");
        
        printInorder(root.right);
    }
    
	public static void main (String[] args) throws IOException {
	        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	        
	        int t=Integer.parseInt(br.readLine());
	        while(t-- > 0){
	            String s= br.readLine();
	            Node root = buildTree(s);
	            
	            Solution tr=new Solution();
	            int sum=tr.findMaxSum(root);
	            System.out.println(sum);
	        }
	}
}

class Solution
{
    int findMaxSum(Node node){
       //use helper function
		int[]route = new int[1];
		route[0] = Integer.MIN_VALUE;
		findMaxSum(node,route);
		return route[0];
    }   

	int findMaxSum(Node node, int[]route){
		if(node == null){
			return 0;
		}

		int left = findMaxSum(node.left,route);
		int right = findMaxSum(node.right,route);

		//decide to take left or right or the node alone
		int takeNode = Math.max(Math.max(left,right)+node.data,node.data);

		//decide to take left and right or the take node
		int top = Math.max(takeNode,left+right+node.data);
		
		route[0]= Math.max(top,route[0]);

		return takeNode;
	}
}
