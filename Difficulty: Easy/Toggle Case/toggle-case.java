class Solution {
    public String toggleCase(String s) {
        // code here
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLowerCase(ch)){
                sb.append(Character.toUpperCase(ch));
            }else if
                (Character.isUpperCase(ch)){
                sb.append(Character.toLowerCase(ch));
            }
        }
        
        return sb.toString();
    }
}
