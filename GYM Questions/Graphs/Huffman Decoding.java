import java.util.*;

// https://course.acciojob.com/idle?question=711b273c-0dc5-48b4-9c3c-c30bac64fb02

abstract class Node implements Comparable<Node> {
    public  int frequency; 
    public  char data;
    public  Node left, right; 
    public Node(int freq) { 
      frequency = freq; 
    }
    public int compareTo(Node tree) {
        return frequency - tree.frequency;
    }
}
class HuffmanLeaf extends Node {
    
    public HuffmanLeaf(int freq, char val) {
        super(freq);
        data = val;
    }
}
class HuffmanNode extends Node {    
    public HuffmanNode(Node l, Node r) {
        super(l.frequency + r.frequency);
        left = l;
        right = r;
    }
}

class Solution {

/*  
	class Node
		public  int frequency; 
    	public  char data;
    	public  Node left, right;
    
*/ 

    static String decode(String S, Node root){
        String result = "";

		Node current = root;

		for(int ind=0; ind<S.length(); ind++){
			// move current based on the character (0,1)
			if(S.charAt(ind) == '1'){
				current = current.right;
			}else{
				current = current.left;
			}
			//check if its leafNode
			if(current.left == null){
				result += current.data;
				// reset the current
				current = root;
			}
		}

		return result;
    }
}
 
public class Main {   
    public static Node buildTree(int[] charFreqs) {    
        PriorityQueue<Node> trees = new PriorityQueue<Node>();
        for (int i = 0; i < charFreqs.length; i++)
            if (charFreqs[i] > 0)
                trees.offer(new HuffmanLeaf(charFreqs[i], (char)i)); 
        assert trees.size() > 0;       
        while (trees.size() > 1) {            
            Node a = trees.poll();
            Node b = trees.poll();            
            trees.offer(new HuffmanNode(a, b));
        }      
        return trees.poll();
    }  
    public static Map<Character,String> mapA=new HashMap<Character ,String>();  
    public static void printCodes(Node tree, StringBuffer prefix) {      
        assert tree != null;      
        if (tree instanceof HuffmanLeaf) {
            HuffmanLeaf leaf = (HuffmanLeaf)tree;      
            mapA.put(leaf.data,prefix.toString());

        } else if (tree instanceof HuffmanNode) {
            HuffmanNode node = (HuffmanNode)tree;            
            prefix.append('0');
            printCodes(node.left, prefix);
            prefix.deleteCharAt(prefix.length()-1);           
            prefix.append('1');
            printCodes(node.right, prefix);
            prefix.deleteCharAt(prefix.length()-1);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);    
        String test= input.next();          
        int[] charFreqs = new int[256];             
        for (char c : test.toCharArray())
            charFreqs[c]++;        
        Node tree = buildTree(charFreqs);        
        printCodes(tree, new StringBuffer());
        StringBuffer s = new StringBuffer();      
        for(int i = 0; i < test.length(); i++) {
          	char c = test.charAt(i);
            s.append(mapA.get(c));
        }             
        System.out.println(Solution.decode(s.toString(), tree));

    }
}
