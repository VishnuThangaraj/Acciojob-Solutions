import java.util.*;

//https://course.acciojob.com/idle?question=52812c95-8480-4304-b0b2-9b73ba1ae7c8

class Node {

  int data;
  Node left, right;
}

class Solution{
	//to check the node is leaf node or not
	public static boolean isLeaf(Node node){
		if(node.left == null && node.right == null){
			return true; //its a leaf node
		}
		return false;
	}
	
	//get left view of the tree
	public static void getLeftView(Node node){
		if(isLeaf(node)){
			return;
		}
		System.out.print(node.data+" ");
		
		if(node.left != null){
			getLeftView(node.left);
		}else{
			getLeftView(node.right);
		}
	}

	//get right view of the tree
	public static void getRightView(Node node){
		if(isLeaf(node)){
			return;
		}
		if(node.right != null){
			getRightView(node.right);
		}else{
			getRightView(node.left);
		}
		System.out.print(node.data+" ");
	}

	//get bottom view of the tree
	public static void getBottomView(Node node){
		if(node != null)
		{
			getBottomView(node.left); // recursively calling the function on the left child
			
			if(node.left == null && node.right == null) // checking if the node is a leaf (no children)
				System.out.print(node.data+" ");
		
			getBottomView(node.right); // recursively calling the function on the right child
		}
		
	}
	
    static void printBoundary(Node node)
    {
        if(node == null){
			return; //empty tree
		}
		System.out.print(node.data+" ");
		if(node.left!=null){
			getLeftView(node.left);
			getBottomView(node.left);
		}
		if(node.right!=null){
			getBottomView(node.right);
			getRightView(node.right);
		}
		
    }
}
public class Main {

  static Node getNode(int data) {
    // Allocate memory
    Node newNode = new Node();

    // put in the data
    newNode.data = data;
    newNode.left = newNode.right = null;
    return newNode;
  }

  static Node LevelOrder(Node root, int data) {
    if (root == null) {
      root = getNode(data);
      return root;
    }
    if (data <= root.data) root.left =
      LevelOrder(root.left, data); else root.right =
      LevelOrder(root.right, data);
    return root;
  }

  static Node constructBst(int arr[], int n) {
    if (n == 0) return null;
    Node root = null;

    for (int i = 0; i < n; i++) root = LevelOrder(root, arr[i]);

    return root;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] tree = new int[n];
    for (int i = 0; i < n; i++) tree[i] = sc.nextInt();
    sc.close();
    Node root = constructBst(tree, n);
    Solution.printBoundary(root);
  }
}
