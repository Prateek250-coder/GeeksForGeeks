class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int x=0;
        int n=arr.length;
        int arr1[]=new int[n];
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr1[x++]=arr[i];
                
            }
        }
        while(x<n){
            arr1[x++]=0;
            }
            for(int i=0;i<arr1.length;i++){
                arr[i]=arr1[i];
            }
            
        
    }
}