class Solution {
    public void rotateclockwise(int[] arr, int k) {
        int n=arr.length;
        int arr1[]=new int[n];
        k =k%n;
        int x=0;
        for(int i=n-k;i<n;i++){
            arr1[x++]=arr[i];
        }
        for(int i=0;i<n-k;i++){
            arr1[x++]=arr[i];
        }
        
        for(int i=0;i<n;i++){
            arr[i]=arr1[i];
        }
    }
}