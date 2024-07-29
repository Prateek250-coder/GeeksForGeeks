//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int arr[][] = new int[n][m];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            int ans = new Solution().rowWithMax1s(arr);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java


// User function Template for Java

class Solution {
    public int rowWithMax1s(int arr[][]) {
        // code here
        int idx = -1, m = arr.length, n = arr[0].length;
        int r = 0, c = n-1;
        while(r<m && c>=0){
            if(arr[r][c]==1){
                idx = r;
                c--;
            }else{
                r++;
            }
        }
        
        return idx;
    }
}