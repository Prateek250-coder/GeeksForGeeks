//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG{
	public static void main (String[] args) throws IOException{
    	BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
    	while((t--)!=0){
    	    String s = read.readLine();
    	    String input_line[] = read.readLine().trim().split("\\s+");
    	    int k=Integer.parseInt(input_line[0]);
            int n=Integer.parseInt(input_line[1]);
            char c=input_line[2].charAt(0);
    	    Solution obj = new Solution();
    	    System.out.println(obj.fun(s, k, n, c));
    	}
	}
}
// } Driver Code Ends


//User function Template for Java



//User function Template for Java

class Solution{
    public static int fun(String s, int k, int n, char c)
    {
        // Your code here
        int i,count=0;
        for(i=0;i<s.length();i++)
        {
            if(c==s.charAt(i))
            {
                count++;
            }
        }
        count=count*(n/s.length());
        for(i=0;i<n%s.length();i++)
        {
            
            if(c==s.charAt(i))
            {
                count++;
            }
            
        }
        return count;
    }
}