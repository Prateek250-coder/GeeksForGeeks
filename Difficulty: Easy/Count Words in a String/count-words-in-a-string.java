class Solution {
    public int countWords(String s) {
        
        s = s.trim();
        
        if(s.length() == 0) {
            return 0;
        }
        
        int count = 1;
        
        for(int i = 1; i < s.length(); i++) {
            
            char curr = s.charAt(i);
            char prev = s.charAt(i - 1);
            
            if((curr == ' ' || curr == '\n' || curr == '\t') &&
               (prev != ' ' && prev != '\n' && prev != '\t')) {
                
                count++;
            }
        }
        
        return count;
    }
}