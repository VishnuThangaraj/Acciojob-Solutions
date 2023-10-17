import java.util.*;

// https://course.acciojob.com/idle?question=637e0256-975e-4348-84ed-eb8407e5e701

class Solution {

    public int seat(String s) {
        //store the position of seat in arrayList
		int count =0 ;
		ArrayList<Integer> seat = new ArrayList<>();
		int length = s.length();

		for(int ind=0; ind<length; ind++){
			if(s.charAt(ind) == 'x'){ // occupied
				seat.add(ind - count);
				count++;
			}
		}

		if(count == 0 || count == length){
			return 0; // no jumps required
		}

		int mid = (count -1)/2;
		int result = 0; 

		int mid_position = seat.get(mid);

		//move all other seats near mid
		for(int ind=0; ind<seat.size(); ind++){
			result += Math.abs(mid_position - seat.get(ind));
		}
		
		return result;
    }
}


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine(); 
        sc.close();
        Solution Obj = new Solution();
        System.out.print(Obj.seat(str));
    }
}
