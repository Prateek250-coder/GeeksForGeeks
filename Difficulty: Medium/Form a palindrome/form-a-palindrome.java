//{ Driver Code Starts
import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            String str = read.readLine();

            Solution ob = new Solution();
            
            System.out.println(ob.countMin(str));
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java



//User function Template for Java

class Solution{
    static int countMin(String str)
    {
        int n=str.length();
        int[][] dp=new int[n][n];
        for(int i=1;i<n;i++){
            int j=0,k=i;
            while(k<n){
                if(str.charAt(j)==str.charAt(k)){
                    dp[j][k]=dp[j+1][k-1];
                } else {
                    dp[j][k]=1+Math.min(dp[j+1][k],dp[j][k-1]);
                }
                j++;k++;
            }
        }
        return dp[0][n-1];
    }
}