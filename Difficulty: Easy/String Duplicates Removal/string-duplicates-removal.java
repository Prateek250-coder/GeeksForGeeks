// User function Template for Java

class Solution {
    String removeDuplicates(String s) {
        StringBuilder sb=new StringBuilder();
        LinkedHashSet<Character>set=new LinkedHashSet<>();
        for(int i=0;i<s.length();i++){
            set.add(s.charAt(i));
        }
       for(char ch:set){
           sb.append(ch);
       }
        return sb.toString();
    }
}
