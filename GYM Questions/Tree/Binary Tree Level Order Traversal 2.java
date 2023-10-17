import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

//https://course.acciojob.com/idle?question=23641143-b9cd-45e0-b16b-80b9db53ca42

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
            //String s1 = sc.nextLine();
            

			Node root1 = buildTree(s);
            //Node root2 = buildTree(s1);
			Solution tree = new Solution();
			ArrayList<Integer>  ans = tree.reverseLevelOrder(root1);
            for(int i = 0 ; i < ans.size() ; ++i){
                System.out.print(ans.get(i)+" ");
            }
		
	}
}
  


class Solution{
    
    public ArrayList<Integer> reverseLevelOrder(Node root) 
    {
        //to store the nodes of tree
        Queue<Node> storage = new LinkedList<>();

        //to store the result
        ArrayList<Integer> result = new ArrayList<>();

        if(root == null){
            return result; //empty tree
        }

        storage.add(root); //add the root to the queue

        while(!storage.isEmpty()){
            ArrayList<Integer> current = new ArrayList<>();

            int size = storage.size(); //size of the queue

            for(int i=0;i<size;i++){
                Node parent = storage.remove();

                //add to the current
                current.add(parent.data);

                //add child nodes to queue if not null
                if(parent.left!=null){
                    storage.add(parent.left);
                }
                if(parent.right!=null){
                    storage.add(parent.right);
                }
            }
            result.addAll(0,current);
        }

        return result;
    }
    
}

