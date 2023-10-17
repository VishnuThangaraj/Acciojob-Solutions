import java.io.*;
import java.lang.*;
import java.util.*;

// https://course.acciojob.com/idle?question=6575e0e7-62c8-4b89-a52d-e6da7e7afcef

class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}

public class Main {
    
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = sc.nextInt();
        Item arr[] = new Item[n];
        for(int i=0;i<n;i++) {
            int value = sc.nextInt();
            arr[i] = new Item(value,0);
        }
        for(int i=0;i<n;i++) {
            arr[i].weight = sc.nextInt();
        }
        double ans = (new Solution()).fractionalKnapsack(w,arr,n);
        System.out.println(String.format("%.2f",ans));
    }
}// } Driver Code Ends


/*
class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}
*/


class Solution
{
    //Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int W, Item arr[], int n){
       // sort the array based on porfit per unit (DESCENDING)
		Arrays.sort(arr, (a,b) -> {
			double profitA = (1.0 * a.value) / (1.0 * a.weight);
			double profitB = (1.0 * b.value) / (1.0 * b.weight);
			return profitB < profitA ? -1 : 1;
		});

		double totalProfit = 0.0;
		int bagCapacity = W;

		for(Item loot : arr){
			double weight = loot.weight;
			double value = loot.value;

			if(bagCapacity >= weight){
				// loot the current item completely
				bagCapacity -= weight;
				totalProfit += value;
			}else if( bagCapacity < weight){
				// loot the current item partially to fill the bag
				totalProfit += (value/weight) * bagCapacity;
				bagCapacity = 0;
				break;
			}
		}

		return totalProfit;
    }
}
