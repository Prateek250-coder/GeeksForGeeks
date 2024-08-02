//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String s1 = br.readLine();
            String[] S = s1.split(" ");
            String s = S[0];
            String t = S[1];
            Solution ob = new Solution();
            int ans = ob.editDistance(s, t);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends




class Solution {
    public int editDistance(String s1, String s2) {
        // Code here
        int[][] dp=new int[s1.length()][s2.length()];
        for(int[] r:dp)Arrays.fill(r,-1);
        return helper(s1,s2,0,0,dp);
    }
    public static int helper(String s1,String s2, int i, int j,int[][] dp)
    {
        if(i>=s1.length() && j<s2.length()) return s2.length()-j;
       // if(i==s1.length() && j==s2.length()) return ;
        if(j==s2.length()) return s1.length()-i;
        if(dp[i][j]!=-1) return dp[i][j];
        //insert
        int insert=0,remove=0,replace=0;
        if(s1.charAt(i)!=s2.charAt(j)){
            
        
         insert=1+helper(s1,s2,i,j+1,dp);
        remove=1+helper(s1,s2,i+1,j,dp);
        replace=1+helper(s1,s2,i+1,j+1,dp);
        return dp[i][j]=Math.min(insert,Math.min(remove,replace));
        }
         return dp[i][j]=helper(s1,s2,i+1,j+1,dp);
        
    }
}