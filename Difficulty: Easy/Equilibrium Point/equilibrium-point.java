class Solution {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {

        int left=0;
        int right =0;
        int n =arr.length;
        for(int i=0;i<n;i++){
            right+=arr[i];
        }
        for(int i=0;i<n;i++){
            right-=arr[i];
            if(left==right){
                return i;
            }
            left+=arr[i];
        }
        return -1;
    }
}
