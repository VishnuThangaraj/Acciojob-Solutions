import java.util.*;

//https://course.acciojob.com/idle?question=ac71e808-aca8-4148-8e01-5b1c2422ed63

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
    Node constructBST(int[]arr,int start,int end,Node root)
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
        int p = sc.nextInt();
        int q = sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt(); 
        }

        Arrays.sort(arr);
        Node root=null;
        BinarySearchTree bst=new BinarySearchTree();
        root=bst.constructBST(arr,0,n-1,root);
            
        Solution Accio = new Solution();
        Node ans=Accio.LCA(root,p,q);
        System.out.println(ans.data);
        sc.close();
        
    }
}

class Solution
{
    Node LCA(Node node, int n1, int n2)
    {
        if(node == null){
			return null; //reached bottom 
		}
		
		if(node.data == n1 || node.data == n2){
			return node; //NODES WITH N1 (OR) N2 FOUND
		}

		//SEARCH LEFT AND RIGHT REGIONS
		Node left = LCA(node.left,n1,n2);
		Node right = LCA(node.right,n1,n2);

		if(left!= null && right!=null){
			return node; //LCA found
		}

		if(left!=null){
			return left;  //LCA found in left region
		}

		return right; //LCA WILL BE IN RIGHT REGION
    }
}
