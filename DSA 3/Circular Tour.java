import java.util.*;

//https://course.acciojob.com/idle?question=59126924-703f-403a-8af9-821d06e3c75a

public class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt(); //size of input
		int[]petrol = new int[size];
		int[]distance = new int[size];

		//receivce petrol input
		for(int i=0; i<size; i++){
			petrol[i] = sc.nextInt();
		}
		//receive distance input
		for(int i=0; i<size; i++){
			distance[i] = sc.nextInt();
		}
		sc.close();
		
			System.out.println(new Solution().tour(petrol,distance));
	}
}
class Solution
{
	int tour(int petrol[], int distance[]){ //O(n) time and O(1) constant space
		int position = 0; //position of index to be returned
		int total = 0; //total usage of petrol
		int sum = 0;
		
		//traverse throught the array
		for(int index=0; index< petrol.length; index++){
			sum += petrol[index] - distance[index];

			if(sum < 0){ //not possible to move next location if < 0
				//increase position to next index
				position = index +1;
				total+=sum;
				sum = 0; //reset the sum
			}
		}
		total+=sum;

		//if total is less than zero ... circular tour cant be done
		return total>=0 ? position : -1;
	}
}
