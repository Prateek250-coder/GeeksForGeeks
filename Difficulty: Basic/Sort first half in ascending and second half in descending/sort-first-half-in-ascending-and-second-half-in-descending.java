// User function Template for Java

// class Solution {
//     public ArrayList<Integer> customSort(int[] arr) {
//         // your code
//         ArrayList<Integer>list=new ArrayList<>();
//         int n=arr.length;
//         int arr1[]=new int[(n/2)];
//         int arr2[]=new int[(n-n/2)];
//         int x=0;
//         int y=0;
//         for(int i=0;i<n/2;i++){
//              arr1[x++]=arr[i];
//         }
//         for(int i=n/2;i<n;i++){
//           arr2[y++]=arr[i];
//         }
//         Arrays.sort(arr1);
//         Arrays.sort(arr2);
//         for(int i=0;i<arr1.length;i++){
//             list.add(arr1[i]);
//         }
       
//         for(int i=arr2.length-1;i>0;i--){
//             list.add(arr2[i]);
//         }
        
//         return list;
//     }
// }
// }import java.util.*;

class Solution {
    public ArrayList<Integer> customSort(int[] arr) {

        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;

        int arr1[] = new int[n/2];
        int arr2[] = new int[n - n/2];

        int x = 0, y = 0;

        // first half
        for(int i = 0; i < n/2; i++){
            arr1[x++] = arr[i];
        }

        // second half
        for(int i = n/2; i < n; i++){
            arr2[y++] = arr[i];
        }

        Arrays.sort(arr1); // ascending
        Arrays.sort(arr2); // ascending

        // add first half
        for(int i = 0; i < arr1.length; i++){
            list.add(arr1[i]);
        }

        // add second half in reverse (descending)
        for(int i = arr2.length - 1; i >= 0; i--){
            list.add(arr2[i]);
        }

        return list;
    }
}
