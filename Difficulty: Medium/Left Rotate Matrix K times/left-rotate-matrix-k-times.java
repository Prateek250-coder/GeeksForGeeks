//{ Driver Code Starts
// Initial Template for java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            int n = Integer.parseInt(S[0]);
            int m = Integer.parseInt(S[1]);
            int k = Integer.parseInt(S[2]);
            int mat[][] = new int[n][m];
            for (int i = 0; i < n; i++) {
                String S1[] = read.readLine().split(" ");
                for (int j = 0; j < m; j++) {
                    mat[i][j] = Integer.parseInt(S1[j]);
                }
            }
            Solution ob = new Solution();
            int ans[][] = ob.rotateMatrix(k, mat);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) System.out.print(ans[i][j] + " ");
                System.out.println();
            }
        }
    }
}

// } Driver Code Ends



// User function template for java

class Solution {
    int[][] rotateMatrix(int k, int m[][]) {
        // code here
        int r = m.length;
        int c = m[0].length;
        
        int k2 = 0; 
        if ( k > c ) {
            k2 = k % c;
        }
        else {
            k2 = k;
        }
        for ( int i=0; i<r; i++ ) {
            
            int [] t1 = new int [ c ];
            int k3 = 0;
            
            for ( int j=0; j<c; j++ ) {
                t1[k3++] = m[i][j];
            }
            
            k3 = k2;
            for ( int j=0; j<c; j++ ) {
                m[i][j] = t1[ k3%c ];
                k3++;
            }
            
        }
        return m;
    }
}