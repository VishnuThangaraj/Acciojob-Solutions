import java.io.*;
import java.util.*;

// https://course.acciojob.com/idle?question=7d2ada34-6296-40ca-8bbf-389f729ac8c5

class Solution {

	private int empUnderMe(TreeMap<String,Integer> indirect, HashMap<String, ArrayList<String>> direct, String manager){
		if(!direct.containsKey(manager)){
			indirect.put(manager, 0); //no-one under this manager
			return 1;
		}

		int count = 0;

		for(String employe : direct.get(manager)){
			count += empUnderMe(indirect,direct,employe);
		}

		indirect.put(manager,count);
		return count+1; //+1 because inclues current as a count
	}

    public void EmpUnderManager(Map<String, String> emp)
	{
		//HashMap to store the direct reports 
		HashMap<String, ArrayList<String>> direct = new HashMap<>();

		String CEO = "";

		for(String employe : emp.keySet()){
			String manager = emp.get(employe);
			if(employe.equals(manager)){
				CEO = employe; //find the CEO
			}else{
				//update the direct reports
				ArrayList<String> report = direct.getOrDefault(manager, new ArrayList<String>());
				report.add(employe);
				direct.put(manager, report);
			}
		}

		TreeMap<String,Integer> indirect = new TreeMap<>();
		//similar to hashMap but keys will be sorted

		empUnderMe(indirect, direct, CEO);

		for(String key : indirect.keySet()){
			System.out.println(key+" "+indirect.get(key));
		}
	}
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        Map<String,String> emp = new HashMap<String, String>();
        for(int i=0;i<n;++i){
			emp.put(sc.next(),sc.next());
        }
        Solution Obj = new Solution();
        Obj.EmpUnderManager(emp); 
    }
}
