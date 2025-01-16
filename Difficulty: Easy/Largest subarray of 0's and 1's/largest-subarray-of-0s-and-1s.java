//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Create BufferedReader for efficient input reading
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Read number of test cases
        int T = Integer.parseInt(br.readLine());

        // Process each test case
        while (T-- > 0) {
            // Read the entire line containing the array elements
            String line = br.readLine();

            // Split the line into an array of strings, then parse them as integers
            String[] tokens = line.split("\\s+");
            int[] a = new int[tokens.length];
            for (int i = 0; i < tokens.length; i++) {
                a[i] = Integer.parseInt(tokens[i]);
            }

            // Create the Solution object
            Solution obj = new Solution();

            // Call maxLen function and print the result
            System.out.println(obj.maxLen(a));
        }
    }
}
// } Driver Code Ends


class Solution {
    public int maxLen(int[] arr) {
        // Replace 0 with -1 in the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = -1;
            }
        }

        // Initialize a HashMap to store cumulative sum and its first occurrence index
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLength = 0;
        int cumSum = 0;

        for (int i = 0; i < arr.length; i++) {
            // Update the cumulative sum
            cumSum += arr[i];

            // Check if the cumulative sum is 0
            if (cumSum == 0) {
                maxLength = i + 1;
            }

            // Check if the cumulative sum has been seen before
            if (map.containsKey(cumSum)) {
                // Calculate the length of the subarray
                int length = i - map.get(cumSum);
                maxLength = Math.max(maxLength, length);
            } else {
                // Store the cumulative sum with its index
                map.put(cumSum, i);
            }
        }

        return maxLength;
    }
}