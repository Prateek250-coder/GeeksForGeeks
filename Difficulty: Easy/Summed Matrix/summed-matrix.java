//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");

            long n = Long.parseLong(S[0]);
            long q = Long.parseLong(S[1]);

            Solution ob = new Solution();
            System.out.println(ob.sumMatrix(n, q));
        }
    }
}
// } Driver Code Ends




// User function Template for Java

class Solution {
    static long sumMatrix(long n, long q) {
        // code here
        long ans=0;
      if(q>n+n){
          ans= 0L;
      }else{
          if(q==n+1){
             ans= n;
          }else if(q<n+1){
              ans= q-1;
          }else{
             ans= (n+n-q+1);
          }
      }
      
      return ans;
      
    }
}