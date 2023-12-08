// https://course.acciojob.com/idle?question=09fc4541-95da-4be3-8c19-875d32fe59c1

import java.util.*;

class TreeNode {
    int data;
    TreeNode left, right;
    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class Solution{
    static Integer maxSum = Integer.MIN_VALUE;

    public static int maxPath(TreeNode node){
        if(node == null) return 0;

        int left = maxPath(node.left);
        int right = maxPath(node.right);

        left = Math.max(0,left);
        right = Math.max(0,right);
        
        int newSum = node.data + left + right;
        maxSum = Math.max(newSum, maxSum);

        return node.data+Math.max(left, right);
    }

    public static int maxPathSum(TreeNode root) {
        maxPath(root);
        return maxSum;
    }

}



class Main {
    public static TreeNode buildTree(String str) {
        if (str.length() == 0 || str.charAt(0) == 'N')
            return null;

        String[] nodes = str.split(" ");
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode root = new TreeNode(Integer.parseInt(nodes[0]));
        queue.add(root);

        int i = 1;
        while (!queue.isEmpty() && i < nodes.length) {

            TreeNode currNode = queue.poll();

            String currVal = nodes[i];

            if (!currVal.equals("N")) {
                currNode.left = new TreeNode(Integer.parseInt(currVal));
                queue.add(currNode.left);
            }
            i++;
            if (i >= nodes.length)
                break;
            currVal = nodes[i];

            if (!currVal.equals("N")) {
                currNode.right = new TreeNode(Integer.parseInt(currVal));
                queue.add(currNode.right);
            }
            i++;
        }

        return root;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        TreeNode root = buildTree(s);
        int maxPath = Solution.maxPathSum(root);
        System.out.println(maxPath);
    }
}
