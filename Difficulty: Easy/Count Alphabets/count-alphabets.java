//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            
            String S = read.readLine();
            

            Solution ob = new Solution();
            

            
            System.out.println(ob.Count(S));
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int Count(String S)
    {
        S=S.toLowerCase();
        StringBuilder sb=new StringBuilder();
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
        for(int i=0;i<S.length();i++){
            char ch=S.charAt(i);
            if(st.contains(ch)){
                sb.append(ch);
            }
        }
        return sb.length();
    }
}