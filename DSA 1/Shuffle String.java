import java.util.*;

// https://course.acciojob.com/idle?question=ac357ab6-b52a-4e37-ae2e-7afac866afb7

public class Main {
    
    static void shuffleString(int[] indices, String s) {
		String result = "";
       for(int i=0;i<s.length();i++){
		   for(int j=0;j<indices.length;j++){
			   if(indices[j]==i){
				   char letter = s.charAt(j);
				   result+=letter;
				   //System.out.println(result+" ");
				   break;
			   }
		   }
	   }
		System.out.println(result);
    }    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        String str = sc.next();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        shuffleString(arr, str);
        sc.close();
    }
}
