import java.util.*;

// https://course.acciojob.com/idle?question=990a7311-5449-47ed-8b8d-9d152e0ed3f8

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

    public static TreeNode CreateTree(int n,int[] preOrder) {
        if(preOrder.length == 0){
			return null; //bottom of the tree / empty tree
		}

		TreeNode root = new TreeNode(preOrder[0]); //first element will be parent/root in preorder

		int left = 1;
		// range till left elements in array
		for(int index=1; index<preOrder.length; index++){
			if(preOrder[index]>preOrder[0]){
				left = index;
				break;
			}
		}

		//child nodes
		root.left = CreateTree(n,Arrays.copyOfRange(preOrder,1,left));
		root.right = CreateTree(n,Arrays.copyOfRange(preOrder,left,preOrder.length));

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
        int[] pre = new int[n];
        for (int i = 0; i < n; i++)
            pre[i] = scn.nextInt();

        TreeNode root = CreateTree(n,pre);
        display(root);
    }

    public static void main(String[] args) {
        solve();
    }
}
