class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        
        int n=s1.length();
        int m=s2.length();
        char a[]=s1.toCharArray();
        char b[]=s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        s1=new String(a);
        s2=new String(b);
        return s1.equals(s2);
        // if(s1.length()!=s2.length()){
        //     return false;
        // }
        // int c=0;
        // Stack<Character>st=new Stack<>();
        // for(int i=0;i<s1.length();i++){
        //     st.add(s1.charAt(i));
        // }
        // for(int i=0;i<s2.length();i++){
        //     if(!st.contains(s2.charAt(i))){
        //         c++;
        //     }
        // }
        // if(c==0){
        //     return true;
        // }
        // return false;
        
    }
}