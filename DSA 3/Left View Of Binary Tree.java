import java.util.*;
import java.io.*;

//https://course.acciojob.com/idle?question=e5bc5b24-fb3f-4112-9bb0-461f44306650

class Node{
    int val;
    Node left, right;
    Node(int val){
        this.val = val;
        left = null;
        right = null;
    }
}
class BST{
    Node root = null;
    BST(){

    }
    Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(val < root.val){
            root.left = insert(root.left, val);
        }else{
            root.right = insert(root.right, val);
        }
        return root;
    }
}

public class Main {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        BST t = new BST();
        for(int i = 0; i < n; i++){
            t.root = t.insert(t.root, input.nextInt());
        }
        
        Solution Accio=new Solution();
        Accio.letfView(t.root);
    }
}

class Solution
{
    public static void letfView(Node root)
    {
        if(root == null){
            return; //empty tree
        }

        //create a queue to store the treeNodes
        Queue<Node> storage = new LinkedList<>();

        //add the root to queue
        storage.offer(root);

        while(!storage.isEmpty()){
            int queueSize = storage.size();

            //run loop to queue size times
            for(int i=0; i<queueSize; i++){
                Node parent = storage.remove();

                if(i == 0){ //left most in the current level
                    System.out.print(parent.val+" ");
                }

                //add left and right nodes to the queue
                if(parent.left!=null){
                    storage.offer(parent.left);
                }
                if(parent.right!=null){
                    storage.offer(parent.right);
                }
            }
        }
    }   
}
