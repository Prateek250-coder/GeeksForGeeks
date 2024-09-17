//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        //Reading total number of testcases
        int t= sc.nextInt();
        
        while(t-- >0)
        {
            //reading the string
            String st = sc.next();
            
            //calling ispar method of Paranthesis class 
            //and printing "balanced" if it returns true
            //else printing "not balanced"
            if(new Solution().ispar(st) == true)
                System.out.println("balanced");
            else
                System.out.println("not balanced");
        
        }
    }
}
// } Driver Code Ends





class Solution {
    // Function to check if brackets are balanced or not.
    static boolean ispar(String x) {
        // Stack to store opening brackets
        Stack<Character> stack = new Stack<>();
        
        // Traverse each character in the string
        for (int i = 0; i < x.length(); i++) {
            char ch = x.charAt(i);
            
            // If it's an opening bracket, push it onto the stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // If it's a closing bracket
            else if (ch == ')' || ch == '}' || ch == ']') {
                // If the stack is empty or the top of the stack doesn't match the current closing bracket
                if (stack.isEmpty()) {
                    return false; // Not balanced
                }
                char top = stack.pop();
                // Check for matching pairs
                if ((ch == ')' && top != '(') || 
                    (ch == '}' && top != '{') || 
                    (ch == ']' && top != '[')) {
                    return false; // Not balanced
                }
            }
        }
        
        // If the stack is empty at the end, it means all brackets are balanced
        return stack.isEmpty();
    }
}

