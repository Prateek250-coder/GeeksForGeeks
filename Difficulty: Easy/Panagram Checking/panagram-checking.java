//{ Driver Code Starts
// Initial template for JAVA

import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends

// User function template for JAVA

class Solution {
    // Function to check if a string is Pangram or not.
    public static boolean checkPangram(String s) {
         s=s.toLowerCase();
        int n=s.length();
        Stack<Character>st=new Stack<>();
        st.push('a');
        st.push('b');
        st.push('c');
        st.push('d');
        st.push('e');
        st.push('f');
        st.push('g');
        st.push('h');
        st.push('i');
        st.push('j');
        st.push('k');
        st.push('l');
        st.push('m');
        st.push('n');
        st.push('o');
        st.push('p');
        st.push('q');
        st.push('r');
        st.push('s');
        st.push('t');
        st.push('u');
        st.push('v');
        st.push('w');
        st.push('x');
        st.push('y');
        st.push('z');
        for(int i=0;i<n;i++){
            if(st.contains(s.charAt(i))){
                st.remove((Character)s.charAt(i));
            }
        }
        if(st.isEmpty()){
            return true;
        }
        return false;
    }
}


//{ Driver Code Starts.

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String s = br.readLine().trim();

            System.out.println(new Solution().checkPangram(s) == true ? "true"
                                                                      : "false");

            System.out.println("~");
        }
    }
}
// } Driver Code Ends