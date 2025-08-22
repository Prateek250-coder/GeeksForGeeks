// User function Template for Java

class Solution {
    String removeVowels(String s) {
        // code here
        s=s.toLowerCase();
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            if(s.charAt(i)!='a'&& s.charAt(i)!='e'&& s.charAt(i)!='i'&& s.charAt(i)!='o'&&s.charAt(i)!='u'){
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}