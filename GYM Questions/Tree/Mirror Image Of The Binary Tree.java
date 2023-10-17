import java.util.*;
import java.io.*;

// https://course.acciojob.com/idle?question=f27668ae-c6cb-4b8a-9b64-7fef45257748

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
        if(val > root.val){
            root.right = insert(root.right, val);
        }else{
            root.left = insert(root.left, val);
        }
        return root;
    }
    Node mirror(Node mainRoot, Node mirrorRoot){
        // create mirror node
		mirrorRoot = new Node(mainRoot.val);

		if(mainRoot.left != null)
			// copy left root to right of mirroRoot
			mirrorRoot.right = mirror(mainRoot.left, mirrorRoot.right);

		if(mainRoot.right != null)
			// copy right root to right of mirroRoot
			mirrorRoot.left = mirror(mainRoot.right, mirrorRoot.left);

		return mirrorRoot;
    }
}

public class Main {
    public static void traversal(BST t, Node curr){
        if(curr == null)
            return;
        traversal(t, curr.left);
        System.out.print(curr.val + " ");
        traversal(t, curr.right);
    }
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        BST t = new BST();
        for(int i = 0; i < n; i++){
            t.root = t.insert(t.root, input.nextInt());
        }
        BST mirror = new BST();
        mirror.root = t.mirror(t.root, mirror.root);
        traversal(mirror, mirror.root);
    }
}
