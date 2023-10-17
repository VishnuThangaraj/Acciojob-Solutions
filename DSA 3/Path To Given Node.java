import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

//https://course.acciojob.com/idle?question=a6cd9b9f-b898-4093-bcd6-de49aff55f4b

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}


class Main {
    static Node buildTree(String str){
        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }
        String ip[] = str.split(" ");
        Node root = new Node(Integer.parseInt(ip[0]));
        Queue<Node> queue = new LinkedList<>(); 
        queue.add(root);
        int i = 1;
        while(queue.size()>0 && i < ip.length) {
            Node currNode = queue.peek();
            queue.remove();
            String currVal = ip[i];
            if(!currVal.equals("N")) {
                currNode.left = new Node(Integer.parseInt(currVal));
                queue.add(currNode.left);
            }
            i++;
            if(i >= ip.length)
                break;   
            currVal = ip[i];
            if(!currVal.equals("N")) {
                currNode.right = new Node(Integer.parseInt(currVal));
                queue.add(currNode.right);
            }
            i++;
        }
        return root;
    }

    
	public static void main (String[] args) throws IOException{
            Scanner sc = new Scanner(System.in);
            int n=sc.nextInt();
            sc.nextLine();
			String s = sc.nextLine();
            int b=sc.nextInt();
			Node root = buildTree(s);
			Solution tree = new Solution();
			ArrayList<Integer> ans=tree.solve(root,b);
            for(int i=0;i<ans.size();i++)
            System.out.print(ans.get(i)+" ");

            System.out.println();

            sc.close();			
	}
}
  


class Solution{
    
   public ArrayList<Integer> solve(Node root,int b)
	{
		ArrayList<Integer> result = new ArrayList<>();
        // lets use helper function
		routeToN(root,b,result,new ArrayList<Integer>());
		
        return result;
    }

	public void routeToN(Node node,int target,ArrayList<Integer> result,ArrayList<Integer> current){
		if(node == null){
			return;
		}

		current.add(node.data); //add present node to current
		
		if(node.data == target){
			result.addAll(new ArrayList<>(current));
			return;
		}

		routeToN(node.left,target,result,current); //left
		routeToN(node.right,target,result,current); //right
		
		current.remove(current.size()-1);
	}
}
