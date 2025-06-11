// User function Template for Java

class Solution {
    public static String reverseString(String s) {
        // code here
        Stack<Character> st=new Stack<>();
        int n=s.length();
        String s1="";
        for(int i=0;i<n;i++){
            st.push(s.charAt(i));
        }
        while(!st.isEmpty()){
            s1+=st.pop();
        }
        return s1;
    }
}