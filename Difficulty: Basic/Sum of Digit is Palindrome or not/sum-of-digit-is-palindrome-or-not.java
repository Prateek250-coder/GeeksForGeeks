//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            boolean ans = ob.isDigitSumPalindrome(N);
            if (ans)
                System.out.println("true");
            else
                System.out.println("false");

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    boolean isDigitSumPalindrome(int n) {
        int a=abc(n);
        int b=a;
        int sum=0;
        while(a>0){
          int p=a%10;
          sum=sum*10+p;
          a=a/10;
        }
        if(sum==b){
            return true;
        }else{
           return false;
        }
    }
        public static int abc(int n){
            int summ=0;
            while(n>0){
            summ=summ+(n%10);
            n=n/10;
            }
            return summ;
    }
}