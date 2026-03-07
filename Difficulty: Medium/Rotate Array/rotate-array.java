class Solution {
    static void rotateArr(int arr[], int d) {
        // code here
        
        int x=0;
        int n=arr.length;
         d=d%n;
        int temp[]=new int [n];
        for(int i=d;i<n;i++){
            temp[x++]=arr[i];
        }
        for(int i=0;i<d;i++){
            temp[x++]=arr[i];
        }
        for(int i=0;i<n;i++){
            arr[i]=temp[i];
        }
    }
}