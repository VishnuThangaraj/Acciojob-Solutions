import java.util.*;

// // https://course.acciojob.com/idle?question=2ae3f1fe-8b46-4e98-b82e-a1369df2fcd2

class Solution {
	public void combination(List<List<Integer>> result, int moves, int num, List<Integer> current){
		// check the moves
		if(moves < 0)
			return;
		
		if(num == 0 && moves == 0){
			result.add(new ArrayList<>(current));
			return;
		}

		int start = 0;
		if(current.size() != 0)
			start = current.get(current.size()-1);

		for(int i=start+1; i<=9; i++){
			current.add(i);
			combination(result, moves-1, num-i, current);
			current.remove(current.size()-1); // backtracking
		}
	}
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
		List<Integer> current = new ArrayList<>();

		// find the combination
		combination(result, k, n, current);

		return result;
    }
}
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        
        Solution ob = new Solution();
        List<List<Integer>> ans = ob.combinationSum3(k,n);
        for(int i = 0 ; i < ans.size() ; ++i){
            Collections.sort(ans.get(i));
        }
        Collections.sort(ans, (o1, o2) -> {
                int m = Math.min(o1.size(), o2.size());
                for (int i = 0; i < m; i++) {
                    if (o1.get(i) == o2.get(i)){
                        continue;
                    }else{
                        return o1.get(i) - o2.get(i);
                    }
                }
                return 1;
            });
        for (int i = 0; i < ans.size (); i++)
            {
                for (int j = 0; j < ans.get(i).size (); j++)
                {
                    System.out.print(ans.get(i).get(j)+" ");
                }
                System.out.println();

            }
    }
}
