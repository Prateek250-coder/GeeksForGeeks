// User function Template for Java

class Solution {
    static int Count(String S) {
        // code here
        int n=S.length();
        int c=0;
        for(int i=0;i<n;i++){
            if(Character.isLetter(S.charAt(i))){
                c++;
            }
        }
        return c;
    }
}