class Solution {
    public static int largest(int[] arr) {
        // code here
        int a=arr[0];
        for(int i:arr){
            a=Math.max(a,i);
        }
        return a;
    }
}
