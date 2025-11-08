class Solution {
    public boolean isPalindrome(int n) {
        // code here
         int original =n;
         
         int rem=0;
      while(n>0){
        int rev=n%10;
         rem=rem*10+rev;
        n=n/10;
        
      }
      if(rem==original){
        return true;
      }
      return false;
    }
}