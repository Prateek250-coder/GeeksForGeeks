// User function Template for Java

class Solution {
    public static int findMean(int[] arr) {
        // code here
        int n=arr.length;
        int sum=0;
        int result=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        result=sum/n;
        return result;
    }
};