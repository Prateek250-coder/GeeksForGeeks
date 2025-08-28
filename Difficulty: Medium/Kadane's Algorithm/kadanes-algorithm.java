class Solution {
    int maxSubarraySum(int[] arr) {
        int n = arr.length;
        int maxSoFar = arr[0];   // Stores the best result so far
        int currentSum = arr[0]; // Stores the best result ending at current index

        for (int i = 1; i < n; i++) {
            // Either extend the previous subarray or start fresh from arr[i]
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            
            // Update the global max
            maxSoFar = Math.max(maxSoFar, currentSum);
        }

        return maxSoFar;
    }
}
