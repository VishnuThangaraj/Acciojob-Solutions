import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

// https://course.acciojob.com/idle?question=4aa994c4-b502-4fe1-bf88-786694b0e9aa

class Node {
    int data;
    Node left, right;
    public Node(int item)
    {
        data = item;
        left = right = null;
    }
}

class BinarySearchTree
{
    static Node constructBST(int[]arr,int start,int end,Node root)
    {
        if(start>end)
            return null;
        int mid=(start+end)/2;

        if(root==null)
            root=new Node(arr[mid]);

        root.left=constructBST(arr,start,mid-1, root.left);
        root.right=constructBST(arr,mid+1,end, root.right);

        return root;

    }
}

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt(); 
        }

        Arrays.sort(arr);
        Node root=null;
        BinarySearchTree bst=new BinarySearchTree();
        root=bst.constructBST(arr,0,n-1,root);
            
        Solution A = new Solution();
        ArrayList<Integer> ans=A.levelOrder(root);
        for(Integer num:ans)
            System.out.print(num+" ");

        System.out.println();

        
    }
}

class Solution
{
    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node root) 
    {
		// to store the result
        ArrayList<Integer> result = new ArrayList<>();
		if(root == null){
			return result; //empty tree
		}

		//to store the nodes of the tree
		Queue<Node> storage = new LinkedList<>();
		storage.offer(root);

		while(!storage.isEmpty()){
			int size = storage.size();

			for(int i=0; i<size; i++){
				Node parent = storage.poll();

				//add to result
				result.add(parent.data);

				//add the child nodes
				if(parent.left!=null){
					storage.offer(parent.left);
				}
				if(parent.right!=null){
					storage.offer(parent.right);
				}
			}
		}
		return result;
    }
}
