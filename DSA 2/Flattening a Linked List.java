import java.util.*;

// https://course.acciojob.com/idle?question=190b12c6-5a31-436d-8821-bd29626d80ad

// Java program for flattening a Linked List
public class Main {

  /* Linked list Node*/
  static class Node {

    int data;
    Node right, down;

    Node(int data) {
      this.data = data;
      right = null;
      down = null;
    }
  }

  static Node Merge(Node l1, Node l2){
	  Node result = new Node(0);
	  Node resultHead = result;

	  //merge both list
	  while(l1 !=null && l2 != null){
		  if(l1.data < l2.data){
			  result.down = l1;
			  l1= l1.down;
		  }else{
			  result.down = l2;
			  l2 = l2.down;
		  }
		  result = result.down;  
	  }

	  //merge balance 
	  result.down = (l1==null) ? l2 : l1;
	  resultHead = resultHead.down;
	  resultHead.right = null; // elements only in bottom

	  return resultHead;
  }
	
  static Node flatten(Node root) {
    if(root == null){
		return root;
	}
	  Node current = root;
	  Node temp = flatten(root.right); 

	  return Merge(root,temp);
  }

static void printList(Node head) {
   while(head!=null){
		System.out.print(head.data+" ");
	   head = head.down;
	}System.out.println();
  }

  public static boolean isCorrect(Node claim) {
    if (claim.right != null) return false;
    Node copy = claim;
    while (copy.down != null) {
      if (copy.down.data < copy.data) return false;
      copy = copy.down;
    }
    return true;
  }

  // Driver's code
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Node ll = new Node(-1), prev1 = null, head = ll;
    for (int i = 0; i < n; i++) {
      int k = sc.nextInt();
      Node prev2 = null, copy = ll;
      while (k-- != 0) {
        int val = sc.nextInt();
        copy.data = val;
        copy.down = new Node(-1);
        prev2 = copy;
        copy = copy.down;
      }
      prev2.down = null;
      ll.right = new Node(-1);
      prev1 = ll;
      ll = ll.right;
    }
    sc.close();
    prev1.right = null;
    Node flattenedNode = flatten(head);
    printList(flattenedNode);
    if (isCorrect(flattenedNode)) System.out.println(
      "yes"
    ); else System.out.println("no");
  }
}
