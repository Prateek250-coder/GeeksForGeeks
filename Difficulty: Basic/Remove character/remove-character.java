// User function Template for Java
class Solution {
    static String removeChars(String str1, String str2) {
        // code here
        int n=str1.length();
        int m=str2.length();
        StringBuilder sb=new StringBuilder();
        HashSet<Character>set=new HashSet<>();
        for(int i=0;i<m;i++){
            set.add(str2.charAt(i));
        }
        for(int i=0;i<n;i++){
            if(!set.contains(str1.charAt(i))){
                sb.append(str1.charAt(i));
            }
        }
        return sb.toString();
        
    }
}