// https://course.acciojob.com/idle?question=eba27af6-e709-4ece-a8fc-ed3d1cdbf6d6

import java.util.*;

class Solution {

    public long maxUseful(int n, int[][] roads) {
        long result = 0, x = 1;
        long indegree[] = new long[n];

        for(int road[] : roads){
            indegree[road[0]]++;
            indegree[road[1]]++;
        }

        // Sort
        Arrays.sort(indegree);
        for(long num : indegree)
            result += num * (x++);

        return result;
    }
}

class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[m][2];
        for (int i = 0; i < m; i++) {
            int u, v;
            u = sc.nextInt();
            v = sc.nextInt();
            arr[i][0] = u;
            arr[i][1] = v;
        }
        sc.close();
        Solution Obj = new Solution();
        System.out.println(Obj.maxUseful(n, arr));
    }
}
