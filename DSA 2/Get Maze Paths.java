import java.io.*;
import java.util.*;

// https://course.acciojob.com/idle?question=2a53222b-7c53-4c9f-af17-549b086a742e

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        ArrayList<String> paths = getMazePaths("",n - 1, m - 1);
        System.out.println(paths);
    }

    public static ArrayList<String> getMazePaths(String path, int row, int column) {
		if(row==0 && column==0){
		   ArrayList<String> currentPath = new ArrayList<>(); //store the path and return to previous call
		   currentPath.add(path);
		   return currentPath; //return to previous call
	   }
		ArrayList<String> allPath = new ArrayList<>(); //contains all current path
		
		if(column>0){
			//moves until it reaches the border
				allPath.addAll(getMazePaths(path+"h",row,column-1));
		}
		if(row>0){
			//moves until it reaches the border
				allPath.addAll(getMazePaths(path+"v",row-1,column));
		}

		return allPath;
    }
}


                        
                        
                        
                        
                        
                                

                        
                                
