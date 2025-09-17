// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int sum=0;
        int original=n;
        while(n>0){
            int rev=n%10;
            sum+=Math.pow(rev,3);
             
            n=n/10;
        }
        if(sum==original){
            return true;
        }
        return false;
    }
}