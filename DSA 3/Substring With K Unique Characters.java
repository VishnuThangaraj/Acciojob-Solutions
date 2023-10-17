import java.util.*;

// https://course.acciojob.com/idle?question=10944e43-a4d3-4974-9ea9-02aa61d602ee

public class Main {

    public static int longestkSubstr(int n, int k,String s){
        //to store only unique characters
        HashMap<Character,Integer> unique = new HashMap<>();

		int first = 0;
		int second = 0;
		int max = -1;

		while(first < s.length()){
			if(second < s.length() && unique.size() <= k){
				unique.put(s.charAt(second), unique.getOrDefault(s.charAt(second),0)+1);
				//update max size
				if(unique.size() == k)
					max = Math.max(max, (second - first)+1);
				second++;
			}else{
				if(unique.get(s.charAt(first)) == 1){
					unique.remove(s.charAt(first));
				}
				else{
					unique.put(s.charAt(first), unique.get(s.charAt(first))-1);
				}
				first++;	
			}
		}

		return max;
    }

    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();
        int ans = longestkSubstr(n,k,s);
        System.out.println(ans);
    }
}
