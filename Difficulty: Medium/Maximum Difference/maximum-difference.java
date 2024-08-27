//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String input = br.readLine();
            String[] inputs = input.split(" ");
            int[] arr = new int[inputs.length];

            for (int i = 0; i < inputs.length; i++) {
                arr[i] = Integer.parseInt(inputs[i]);
            }

            Solution ob = new Solution();
            System.out.println(ob.findMaxDiff(arr));
        }
    }
}

// } Driver Code Ends


    



class Solution {
    public int findMaxDiff(int[] arr) {
        int n = arr.length;
        int[] ls = new int[n];
        int[] rs = new int[n];

      
        for(int i = 1; i < n; i++) {
        int small = arr[i];
        for(int j = i - 1; j >= 0; j--) {
            if(arr[j] < small) {
                small = arr[j];
                break;
            }
        }
        if(small == arr[i]) {
            ls[i] = 0;
        } else {
            ls[i] = small;
        }
    }

  
    for(int i = n - 2; i >= 0; i--) {
        int small = arr[i];
        for(int j = i + 1; j < n; j++) {
            if(arr[j] < small) {
                small = arr[j];
                break;
            }
        }
        if(small == arr[i]) {
            rs[i] = 0;
        } else {
            rs[i] = small;
        }
    }

       
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int ans = Math.abs(ls[i] - rs[i]);
            maxi = Math.max(maxi, ans);
        }

        return maxi;

        
    }
}