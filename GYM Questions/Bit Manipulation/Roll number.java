import java.util.*;

// https://course.acciojob.com/idle?question=0dae03f9-c4c1-4149-84eb-cf20fcfd81fe

class Solution {
    public List<Integer> rollnumber(int n) {
        List<Integer> result = new ArrayList<>();
        result.add(0);

        for(int i=1; i<=n; i++){
            for(int j=result.size()-1; j>=0; j--){
                int current = result.get(j);
                current = current + (1 << (i-1));
                result.add(current);
            }
        }
        return result;
    }
}
public class Main {
 
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
 
        Solution Obj = new Solution();
        sc.close();
          List<Integer> l= new ArrayList<>();
        l= Obj.rollnumber(n);
        for(int i=0;i<l.size();i++)
        {
            System.out.print(l.get(i));
            System.out.print(" ");
        }
    }
}
