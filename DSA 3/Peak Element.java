import java.util.*;

//https://course.acciojob.com/idle?question=e6a1d307-59de-4d83-b174-943c69c5b042

class Solution{
    public int findPeak(int arr[], int n)
    {
        return binarySearch(arr,0,arr.length-1);
       
    }
	//recursive binary search
	public int binarySearch(int[]A, int start, int end){
		if(start > end){
			return -1; //base condition is not necessary
		}
		
		int mid = start + (end-start)/2;
		
		if(mid == 0){
			//peak cannot be the starting 0th index
			return binarySearch(A,mid+1,end);
		}

		if(A[mid] > A[mid-1] && A[mid] > A[mid+1]){
			return mid; //element found return the index
		}

		if(A[mid] > A[mid-1]){ //search right region
			return binarySearch(A,mid+1,end);
		}
		
		return binarySearch(A,start,mid-1); //search left region	
	}
}

class Main{
	public static void main(String[] args){
		try (Scanner sc = new Scanner(System.in)) {
			int t=sc.nextInt();
			while(t>0){
				int n=sc.nextInt();
				int []A=new int[n];
				for(int i=0;i<n;i++){
					A[i]=sc.nextInt();
				}
				Solution ob =new Solution();
				int ans = ob.findPeak(A,n);
                if(ans==0){
                    if(A[ans]>A[ans+1]){
                        System.out.println("true");
                    }
                    else{
                       System.out.println("false");    
                    }
                }
                else if(ans==n-1){
                    if(A[ans]>A[ans-1]){
                        System.out.println("true");                        
                    }
                    else{
                        System.out.println("false");                        
                    }
                }
                else{
                    if(A[ans]>A[ans+1] && A[ans]>A[ans-1]){
                        System.out.println("true");
                    }
                    else{
                        System.out.println("false");                        
                    }
                }
				t--;
			}
		}
	}
}
