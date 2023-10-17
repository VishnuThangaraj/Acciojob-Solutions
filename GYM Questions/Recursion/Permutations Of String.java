import java.util.*;

// https://course.acciojob.com/idle?question=63fadc7c-eb32-44d3-9ba6-0d3f89b14d68

class Main{
	public static void main(String[] args){
		try (Scanner sc = new Scanner(System.in)) {
			String str=sc.nextLine();
			Solution ob =new Solution();
			ob.printPermutaions(str);
		}
	}

}
class Solution {
	public void getPermutation(String source, String current, ArrayList<String> result){
		if(source.length() == 0){
			result.add(current); // possible permutation
		}

		for(int index=0; index<source.length(); index++){
			String newSource = source.substring(0,index) + source.substring(index+1);
			getPermutation(newSource, current+source.charAt(index), result);
		}
	}
    public void printPermutaions(String str) {
        ArrayList<String> result = new ArrayList<>();

		getPermutation(str,"",result);
		
		// sort the result arrayList
		Collections.sort(result);

		// print the ArrayList
		for(String permutation : result)
			System.out.println(permutation);
    }
}
