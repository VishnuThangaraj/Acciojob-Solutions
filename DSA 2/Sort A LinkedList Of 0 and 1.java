import java.util.*;

//https://course.acciojob.com/idle?question=f656f647-2a8c-4cd4-87e3-fc99ef2cf99e

class Solution {
	
    static LinkedListNode sort01(LinkedListNode head){
		LinkedListNode result = new LinkedListNode(0);
		LinkedListNode tail = result;

		while(head != null){
			if(head.data==0){
				LinkedListNode temp = new LinkedListNode(0);
				temp.next = result;
				result = temp;
			}else{
				tail.next = new LinkedListNode(1);
				tail = tail.next;
			}
			head = head.next;
		}

		return result.next;
    }
}

class LinkedListNode  {
    int data;
    LinkedListNode next;

    public LinkedListNode(int data)  {
        this.data = data;
    }
}

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedListNode head = new LinkedListNode(sc.nextInt());
        LinkedListNode a = head;
        for(int i=1;i<n;i++) {
            LinkedListNode temp = new LinkedListNode(sc.nextInt());
            a.next = temp;
            a = temp;
        }
        LinkedListNode ans = Solution.sort01(head);
        for(int i=0;i<n;i++) {
            if(i == n-1) {
                System.out.println(ans.data);
            }
            else {
                System.out.print(ans.data + " ");
            }
            ans = ans.next;
        }
    }
}
