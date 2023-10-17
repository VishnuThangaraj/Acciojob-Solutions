import java.util.*;

// https://course.acciojob.com/idle?question=357fe3fe-d5d6-4a39-abc2-9f6060497eac

class Accio {
    public int longestOnes(int[] A, int B) {
        int zero = 0;
		int max = 0;
		int left = 0;

		for(int i=0; i<A.length; i++){
			if(A[i] == 0) zero++; // increase the count of 0

			// if there is more 0..move left pointer 
			while(zero > B){
				if(A[left] == 0)
					zero--;
				left++;
			}

			// update the max
			max = Math.max(max, i- left+1);
		}

		return max;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
    	for(int i=0;i<N;i++)
	    A[i] = sc.nextInt();
        int B = sc.nextInt();
        Accio Obj = new Accio();
        System.out.println(Obj.longestOnes(A, B));
    }
}
