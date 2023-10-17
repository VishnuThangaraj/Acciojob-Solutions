import java.util.*;

// https://course.acciojob.com/idle?question=a429b9c2-b596-426b-a197-72aeb9a5bb23

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
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int l = sc.nextInt();
            int r = sc.nextInt();
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
            long ans=A.rangeSum(root,l,r);
            System.out.println(ans);
        }
    }
}

class Solution
{ 
    long rangeSum(Node root, int l, int r){ 
        if(root == null){
			return 0; //reached end
		}
		int total = 0;
		if(root.data >=l && root.data <=r){ //lies in the range
			total+= root.data;
		}
		// search in the left and right nodes
		total += rangeSum(root.left,l,r);
		total += rangeSum(root.right,l,r);

		return total;
    } 
}
