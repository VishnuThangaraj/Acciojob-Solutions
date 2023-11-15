// https://course.acciojob.com/idle?question=fcaaf203-0d9f-441f-955d-7b87d2fbd28a

import java.util.*;

class Accio{
    static int MinElement(int n,int[] arr){
        // Single elemnet in the array 
        if(n == 1) return arr[0];

        int start = 0, end = n-1;

        while(start <= end){
            int mid = start + (end - start)/2;

            // Min element in end of the array
            if(mid == n-1){
                if(arr[mid] < arr[mid-1])
                    return arr[mid]; // Last Element in the array is the minimum
                else
                    end = mid-1;
            }
            else if(mid == 0){
                if(arr[mid] < arr[mid+1])
                    return arr[mid]; // First Element in the array is minimum
                else
                    start = mid+1;
            }
            else{
                if(arr[mid] < arr[mid-1] && arr[mid] < arr[mid+1])
                    return arr[mid];
                else if (arr[start] <= arr[end]) // Sorted range
                    return arr[start];
                else{ // un-sorted Range
                    if(arr[start] <= arr[mid])
                        start = mid+1;
                    else
                        end = mid-1;
                }       
            } 
        }
        return end;
    }
}

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;++i){
            arr[i] = sc.nextInt();
        }
        Accio obj = new Accio();
        int ans = obj.MinElement(n,arr);
        System.out.println(ans);
    }
}



