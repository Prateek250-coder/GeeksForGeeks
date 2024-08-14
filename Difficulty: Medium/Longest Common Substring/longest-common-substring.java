//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S1 = read.readLine().trim();
            String S2 = read.readLine().trim();

            Solution ob = new Solution();
            System.out.println(ob.longestCommonSubstr(S1, S2));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestCommonSubstr(String s1, String s2) {
        // code here
        int dp[][] = new int[s1.length()+1][s2.length()+1];
        int ans=0;
        for(int i=0; i<s1.length(); i++){
            for(int j=0; j<s2.length(); j++){
                if(s1.charAt(i)==s2.charAt(j)){
                    dp[i+1][j+1] = dp[i][j]+1;
                    ans = Math.max(ans, dp[i+1][j+1]);
                }
            }
        }
        return ans;
    }
}