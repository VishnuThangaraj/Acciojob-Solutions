import java.util.LinkedList;
import java.util.Queue;
import java.io.*;
import java.util.*;

//https://course.acciojob.com/idle?question=e81eafdb-0965-4651-b3a3-ac61b70ff8da

class Solution {
    public static void isSymmetrical(Node root) {
        //using BFS to check in each level of the tree
		//create queue to store the nodes of tree
		Queue<Node> storage = new LinkedList<>();

		//ignore the root and add the nodes 
		storage.add(root.left);
		storage.add(root.right);

		while(!storage.isEmpty()){
			Node parent1 = storage.poll();
			Node parent2 = storage.poll();

			if(parent1 == null && parent2==null){
				continue;
			}else if(parent1 == null || parent2==null || parent1.data!=parent2.data){
				System.out.println("NO");
				return;
			}

			//adding of nodes to queue
			storage.offer(parent1.right);
			storage.offer(parent2.left);
			storage.offer(parent1.left);
			storage.offer(parent2.right);
		}

		System.out.println("YES");

    }
	static boolean isTreeSymmetrical(Node left, Node right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        if (left.data != right.data) {
            return false;
        }
        return isTreeSymmetrical(left.left, right.right) && isTreeSymmetrical(left.right, right.left);
    }
}
class Main {
    static Node buildTree(String str) {
        if (str.length() == 0 || str.charAt(0) == 'N') {
            return null;
        }
        String ip[] = str.split(" ");
        Node root = new Node(Integer.parseInt(ip[0]));
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;
        while (queue.size() > 0 && i < ip.length) {
            Node currNode = queue.peek();
            queue.remove();
            String currVal = ip[i];
            if (!currVal.equals("N")) {
                currNode.left = new Node(Integer.parseInt(currVal));
                queue.add(currNode.left);
            }
            i++;
            if (i >= ip.length) break;
            currVal = ip[i];
            if (!currVal.equals("N")) {
                currNode.right = new Node(Integer.parseInt(currVal));
                queue.add(currNode.right);
            }
            i++;
        }

        return root;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        Node root1 = buildTree(s1);
        Solution g = new Solution();
        g.isSymmetrical(root1);
    }
}


class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
