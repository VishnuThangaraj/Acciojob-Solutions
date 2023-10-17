import java.io.*;
import java.util.*;

//https://course.acciojob.com/idle?question=b630c0be-f168-423f-9d7a-f3c4acfc36e6

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		//get size of the node
		int size = sc.nextInt();

		BST tree = new BST(); //create object(Tree)
		
		//get the nodes
		for(int itr=0; itr<size; itr++){
			tree.insert(sc.nextInt());
		}

		tree.levelOrder(); //level order traversal
    }
}

//BINARY SEARCH TREE
class BST{
	class Node{
		int data ;
		Node left;
		Node right;

		//constructor
		Node(int value){
			this.data = value;
		}
	}

	private Node root; //root node

	//empty constructor
	BST(){
		//null
	}

	//INSERTING ELEMENTS IN BST
	public void insert(int value){
		root = insert(root,value);
	}

	//PRIVATE INSERTING FUNCTION
	public Node insert(Node node, int value){
		if(node == null){
			return new Node(value); //add new node
		}

		//smaller than current node goes to left side
		if(value < node.data){
			node.left = insert(node.left,value);
		}

		//greater than current node goes to right side
		if(value > node.data){
			node.right = insert(node.right,value);
		}

		return node;
	}

	//LEVEL ORDER TRAVERSAL
	public void levelOrder(){
		//find height first
		int height = height(root,0);

		//run loop for each level
		for(int level=1; level<=height; level++){
			currentLevel(root,level);
		}
	}

	// FUNCTION TO FIND THE HEIGHT OF THE TREE
	private int height(Node node, int value){
		if(node == null){
			return value;
		}
		return Math.max(height(node.left,value+1),height(node.right,value+1));
	}

	//FUNCTION TO PRINT THE LEVEL OF TREE
	private void currentLevel(Node node, int level){
		if(node == null){
			return ;
		}

		if(level == 1){
			System.out.print(node.data+" ");
		}

		if(level>1){
			//left 
			currentLevel(node.left,level-1);
			//right
			currentLevel(node.right,level-1);
		}
	}
}
