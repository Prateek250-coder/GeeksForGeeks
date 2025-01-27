//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String arr[] = read.readLine().trim().split(" ");

            Solution ob = new Solution();
            String ans = ob.longestCommonPrefix(arr);

            if (ans.isEmpty()) {
                System.out.print("\"\"");
            } else {
                System.out.print(ans);
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    public String longestCommonPrefix(String arr[]) {
        // code here
        
        int n=arr.length;
        String s="";
        String st=arr[0];
        int count = st.length();
        for(int i=0;i<count;i++){
            int c=0;
            for(int j=0;j<n;j++){
                if(i>=arr[j].length()){
                    c=1;
                    break;
                }
                if(arr[j].charAt(i)!=st.charAt(i)){
                    c=1;
                }
            }
            if(c==0){
                s=s+arr[0].charAt(i);
            }
            else{
                break;
            }
        }
        return s;
    }
}