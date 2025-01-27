//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = inputLine.length;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            long ans = new Solution().maxProduct(arr);
            System.out.println(ans);
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    long maxProduct(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length;
        if(n<3){
            return 0;
        }else{
        return Math.max((long)arr[0]*arr[1]*arr[n-1],(long)arr[n-1]*arr[n-2]*arr[n-3]);
        
        }
    }
}
