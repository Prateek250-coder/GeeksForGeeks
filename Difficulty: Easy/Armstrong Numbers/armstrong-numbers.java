// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int temp=n;
        int count=0;
        while(temp>0){
            int rev=temp%10;
            temp=temp/10;
            count++;
        }
        int original=n;
        int sum=0;
        while(n>0){
           int rem=n%10;
           sum+=Math.pow(rem,count);
           n=n/10;
        }
        if(sum==original){
            return true;
        }
        return false;
    }
}