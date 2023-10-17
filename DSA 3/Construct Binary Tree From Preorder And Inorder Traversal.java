import java.util.*;
import java.io.*;

//https://course.acciojob.com/idle?question=73dc7bdc-712a-4d18-b043-4a23ff720e30

class Node{
    int data; 
    Node left, right;
    Node(int key){
        data = key;
        left = right = null;
    }
}

class Main{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node root = null;
        int inorder[] = new int[n];
        int preorder[] = new int[n];
        for(int i = 0; i < n; i++)
          preorder[i] = sc.nextInt();
        for(int i = 0; i < n; i++)
          inorder[i] = sc.nextInt();
        Solution ob = new Solution();
        root = ob.buildTree(inorder, preorder, n);
        postOrdrer(root);
        System.out.println();
    }
    
    public static void postOrdrer(Node root){
        if(root == null)
          return;
        postOrdrer(root.left);
        postOrdrer(root.right);
        System.out.print(root.data + " ");
    }
}


class Solution{
    public static Node buildTree(int inorder[], int preorder[], int n){
        if(preorder.length == 0){
			return null; //check any one inorder or preorder
		} 

		int root = preorder[0]; //root node
		int index =0;
		
		//find the root index in the inorder
		for(int ind=0; ind<inorder.length; ind++){
			if(inorder[ind] == root){
				index = ind;
				break; // root in in-order found
			}
		}

		Node node = new Node(root); //root or parent

		//find for left and right side of tree
		//make copy of the Array
		node.left = buildTree(Arrays.copyOfRange(inorder,0,index),Arrays.copyOfRange(preorder,1,index+1),n);
		node.right = buildTree(Arrays.copyOfRange(inorder,index+1,inorder.length),Arrays.copyOfRange(preorder,index+1,preorder.length),n);

		return node;
    }
}
