class Solution {
    public String removeChars(String s) {
        // code here
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            if(Character.isLetter(s.charAt(i))){
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
};