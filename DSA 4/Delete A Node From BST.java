import java.util.*;
import java.io.*;

//https://course.acciojob.com/idle?question=51bd72c5-4874-4108-95b0-65900d4e5ef8

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
    BST(Node root){
        root=root;
    }
    Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.val == val)
            return root;
        if(val < root.val){
            root.left = insert(root.left, val);
        }else{
            root.right = insert(root.right, val);
        }
        return root;
    }
    void print(Node root){
        System.out.print(root.val + " ");
        if(root.left != null){
            print(root.left);
        }
        if(root.right != null){
            print(root.right);
        }
    }
}

class Solution{
	//left most node
	private int getLeft(Node node){
		if(node.left == null){
			return node.val; //leftmost node found
		}
		//move left
		return getLeft(node.left);	
	}
    public Node deleteNode(Node root, int val){
        //find the node to be deleted
		if(root == null){
			return null;
		}

		//value to be deleted found
		if(root.val == val){
			//no child nodes delete the node directly
			if(root.right == null && root.left == null){
				return null; //node deleted 
			}
			//right is empty for the deleting node
			if(root.right == null){
				return root.left;
			}
			//left is empty for the deleting node
			if(root.left == null){
				return root.right;
			}
			//has left and right nodes
			//get the leftmost node on right side (or) right-most node on the left side
			root.val = getLeft(root.right);
			root.right = deleteNode(root.right,root.val);
		}

		else if(root.val < val){
			//search right
			root.right = deleteNode(root.right,val);
		}
		else{
			//search left
			root.left = deleteNode(root.left,val);
		}

		//return current node
		return root;
    }
}

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), k = input.nextInt();
        BST t = new BST();
        for(int i = 0; i < n; i++){
            t.root = t.insert(t.root, input.nextInt());
        }
        Solution obj=new Solution();
        t.root= obj.deleteNode(t.root, k);
        t.print(t.root);
    }
}
