class Solution {
    static boolean isPrime(int n) {
        // code here
        int c=0;
        if(n==1 || n==0){
            return false;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                c++;
            }
        }
        if(c>0){
            return false;
        }
        return true;
    }
}