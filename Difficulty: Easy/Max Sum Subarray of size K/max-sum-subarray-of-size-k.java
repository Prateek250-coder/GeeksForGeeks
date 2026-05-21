class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
       int sum = 0;

// first window
for(int i = 0; i < k; i++) {
    sum += arr[i];
}

int maxSum = sum;

// sliding window
for(int i = k; i < arr.length; i++) {
    
    sum = sum - arr[i - k] + arr[i];

    maxSum = Math.max(maxSum, sum);
}
return maxSum;
    }
}