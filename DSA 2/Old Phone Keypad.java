import java.util.*;

// https://course.acciojob.com/idle?question=394e5cf7-8fef-4439-8d0d-3b2583176bf0

class Main {
	static ArrayList <String> keyPadCombination(String processed, String unProcessed){
		if(unProcessed.isEmpty()){
			ArrayList <String> currentProcessed= new ArrayList<>(); //contains current processed string
			currentProcessed.add(processed);
			return currentProcessed; //return arraylist with current processed string
		}
		int digit = unProcessed.charAt(0) - '0'; // make string to int to get the number
		ArrayList <String> processedStorage= new ArrayList<>(); //new arratList to store all processed string in iterations

		//check the digit
		if(digit==0){
			processedStorage.addAll(keyPadCombination(processed+" ", unProcessed.substring(1)));
		}else if(digit <= 5 || digit == 8){
			//as those letter contains of 3 characters run for loop thrice
			for(int iteration=(digit-1)*3;iteration<digit*3;iteration++){
				char letter = (char)('A'+iteration); //get the relevent alphabet
				//call function with updates processed string
				processedStorage.addAll(keyPadCombination(processed+letter, unProcessed.substring(1)));
			}
		}else if(digit == 6){
			//as those letter contains of 3 characters run for loop thrice
			for(int iteration=(digit-1)*3;iteration<=digit*3;iteration++){
				char letter = (char)('A'+iteration); //get the relevent alphabet
				//call function with updates processed string
				processedStorage.addAll(keyPadCombination(processed+letter, unProcessed.substring(1)));
			}
		}else if(digit == 7){
			//as those letter contains of 3 characters run for loop thrice
			for(int iteration=((digit-1)*3)+1;iteration<digit*3;iteration++){
				char letter = (char)('A'+iteration); //get the relevent alphabet
				//call function with updates processed string
				processedStorage.addAll(keyPadCombination(processed+letter, unProcessed.substring(1)));
			}
		}else{ //if digit is 9
			//as those letter contains of 3 characters run for loop thrice
			for(int iteration=((digit-1)*3);iteration<(digit*3)-1;iteration++){
				char letter = (char)('A'+iteration); //get the relevent alphabet
				//call function with updates processed string
				processedStorage.addAll(keyPadCombination(processed+letter, unProcessed.substring(1)));
			}
		}
		return processedStorage;
	}
	
    static ArrayList <String> OldPhone(int n, int[] keys){
		String unProcessed = ""; //to add and store elements in array
		for(int elements:keys){
			unProcessed+=Integer.toString(elements);
		}
		return keyPadCombination("",unProcessed);
    }
	
	public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] keys = new int[n];
        for(int i=0;i<n;++i){
            keys[i] = sc.nextInt();
        }
        ArrayList <String> ans=OldPhone(n,keys);
        for(String i:ans) System.out.print(i+" ");
    }
}
