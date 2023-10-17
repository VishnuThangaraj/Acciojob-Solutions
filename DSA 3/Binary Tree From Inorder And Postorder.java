import java.util.*;

//https://course.acciojob.com/idle?question=fead3653-183f-4eac-94cc-fee94b777e16

class Node {
    int data;
    Node left;
    Node right;

    Node(int value) {
        data = value;
        left = null;
        right = null;
    }
}

class Main {
    public void preOrder(Node root) {
        if (root == null) return;

        System.out.print(root.data + " ");
        preOrder(root.left);

        preOrder(root.right);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Main ip = new Main();
        int T = 1;
        while (T > 0) {
            int n = sc.nextInt();
            int[] inorder = new int[n];
            int[] postorder = new int[n];
            for (int i = 0; i < n; i++) postorder[i] = sc.nextInt();
            for (int i = 0; i < n; i++) inorder[i] = sc.nextInt();
            Solution g = new Solution();
            Node root = g.buildTree(inorder, postorder, n);
            ip.preOrder(root);
            System.out.println();

            T--;
        }
        sc.close();
    }
}

class Solution {
    Node buildTree(int in[], int post[], int n){
        if(post.length==0){
			return null; //if any of the array become 0 (in or post)
		}

		int root = post[post.length-1];
		int index=0;

		//find the root in 
		for(int ind =0 ; ind<in.length; ind++){
			if(in[ind] == root){
				index = ind;
				break; //parent / root node index found
			}
		}

		//create the node
		Node node = new Node(root);

		//find the left and right of the current node
		node.left = buildTree(Arrays.copyOfRange(in,0,index),Arrays.copyOfRange(post,0,index),n);
		node.right = buildTree(Arrays.copyOfRange(in,index+1,in.length),Arrays.copyOfRange(post,index,post.length-1),n);

		return node;
    }
}
