// User function template for Java
class Solution {
    static int commonSubseq(String S1, String S2) {
        // code here
        int c=0;
        HashSet<Character>set=new HashSet<>();
        for(int i=0;i<S1.length();i++){
            set.add(S1.charAt(i));
        }
        for(int i=0;i<S2.length();i++){
            if(set.contains(S2.charAt(i))){
                c++;
                
            }
        }
        if(c==0){
            return 0;
        }
        return 1;
    }
}