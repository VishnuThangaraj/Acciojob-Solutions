import java.util.*;

// https://course.acciojob.com/idle?question=3f0008d8-5316-4ffb-a3f1-cdb5372a6590

public class Main {
    public static Scanner scn = new Scanner(System.in);

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        TreeNode(int val) {
            this.val = val;
        }
    }


    public static TreeNode CreateTree(int n,int[] postOrder) {
        if(postOrder.length == 0){
			return null; //bottom of the tree / empty tree
		}

		TreeNode root = new TreeNode(postOrder[postOrder.length-1]); //last element will be parent/root in preorder

		int index = postOrder.length-1;
		for(;index>=0; index--){
			if(postOrder[index] < postOrder[postOrder.length-1]){
				break;
			}
		}

		//child nodes
		root.left = CreateTree(n,Arrays.copyOfRange(postOrder,0,index+1));
		root.right = CreateTree(n,Arrays.copyOfRange(postOrder,index+1,postOrder.length-1));

		return root;
    }

    // input_section=================================================

    public static void display(TreeNode node) {
        if (node == null) return;
        StringBuilder sb = new StringBuilder();
        sb.append((node.left != null ? node.left.val : "."));
        sb.append("->" + node.val + "<-");
        sb.append((node.right != null ? node.right.val : "."));
        System.out.println(sb.toString());
        display(node.left);
        display(node.right);

    }

    public static void solve() {
        int n = scn.nextInt();
        int[] post = new int[n];
        for (int i = 0; i < n; i++)
            post[i] = scn.nextInt();

        TreeNode root = CreateTree(n,post);
        display(root);
    }

    public static void main(String[] args) {
        solve();
    }
}
