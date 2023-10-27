import java.util.*;
import java.io.*;

// https://course.acciojob.com/idle?question=f7984e21-28b9-4d24-a233-b3130578a438

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
    public static void inorder(Node node){
		if(node.left!=null) inorder(node.left);
       System.out.print(node.val+" ");
		if(node.right!=null) inorder(node.right);
    }
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        BST t = new BST();
        for(int i = 0; i < n; i++){
            t.root = t.insert(t.root, input.nextInt());
        }
        inorder(t.root);
    }
}
