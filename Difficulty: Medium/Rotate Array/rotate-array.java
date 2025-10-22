// User function Template for Java

class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        // add your code here
        int n =arr.length;
        int arr1[]=new int[n];
        int x=0;
        d=d%n;
        for(int i=d;i<n;i++){
            arr1[x++]=arr[i];
        }
        for(int i=0;i<d;i++){
            arr1[x++]=arr[i];
        }
        for(int i=0;i<n;i++){
            arr[i]=arr1[i];
        }
    }
}