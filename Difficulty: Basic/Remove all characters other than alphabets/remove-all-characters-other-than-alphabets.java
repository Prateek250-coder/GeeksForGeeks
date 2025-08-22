// User function Template for Java

class Solution {
    String removeSpecialCharacter(String s) {
        // code here
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            if(Character.isLetter(s.charAt(i))){
                sb.append(s.charAt(i));
            }
        }
        int m=sb.length();
        if (m>0){
            return sb.toString();
        }
        return "-1";
        
        
    }
    
}