//{ Driver Code Starts
import java.io.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine(); // Use lowercase 's'

            Solution ob = new Solution();
            if (ob.isPalindrome(s)) // Check palindrome
                System.out.println("true");
            else
                System.out.println("false");
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    boolean isPalindrome(String s) {
        int n = s.length();
        StringBuilder s1 = new StringBuilder();

        // Reverse the string
        for (int i = n - 1; i >= 0; i--) {
            s1.append(s.charAt(i));
        }

        // Direct return by comparing strings
        return s1.toString().equals(s);
    }
}
