// User function Template for Java
class Solution {
    static String removeChars(String str1, String str2) {
        // code here
        int n=str2.length();
        int m=str1.length();
        StringBuilder sb=new StringBuilder();
        HashSet<Character>set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(str2.charAt(i));
        }
        for(int j=0;j<m;j++){
            if(!set.contains(str1.charAt(j))){
                sb.append(str1.charAt(j));
            }
        }
        return sb.toString();
    }
}