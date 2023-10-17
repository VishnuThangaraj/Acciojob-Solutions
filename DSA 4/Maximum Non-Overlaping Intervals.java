import java.util.*;

// https://course.acciojob.com/idle?question=dda79d27-9f8c-4e00-b97c-7ed2f0346812

class Solution {
    public static int solve(List<List<Integer>> A) {
	    int count = 0; //count of non-overlaping intervals
		//sort the ArrayList based on starting point
		Collections.sort(A, (a,b) ->{
			return a.get(0) - b.get(0);
		});
		int newStart = 0;

		for(List<Integer> current : A){
			if(current.get(0) > newStart){
				//increase count and update NewStart
				count++;
				newStart = current.get(1);
			}else if(current.get(1) < newStart){
				//small interval found..update new Start
				newStart = current.get(1);
			}
		}

		return count;
	}
}
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<List<Integer>> A = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            List<Integer> interval = Arrays.asList(a, b);
            A.add(interval);
        }
        int ans = Solution.solve(A);
        System.out.println(ans);
    }
}
