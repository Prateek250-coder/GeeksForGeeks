//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t =
            Integer.parseInt(scanner.nextLine().trim()); // Read number of test cases

        while (t-- > 0) {
            String line = scanner.nextLine().trim(); // Read the entire line
            String[] numsStr = line.split(" "); // Split the line into string numbers
            int[] nums = new int[numsStr.length];
            for (int i = 0; i < numsStr.length; i++) {
                nums[i] =
                    Integer.parseInt(numsStr[i]); // Convert each string to integer
            }

            int ans = new Solution().firstNonRepeating(
                nums); // Compute the result using the Solution class

            System.out.println(ans); // Print the result
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int firstNonRepeating(int[] arr) {
        int n=arr.length;
        // Complete the function
        LinkedHashMap<Integer,Integer>map=new LinkedHashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey(); 
            }
        }
        return 0;
        
    }
}

