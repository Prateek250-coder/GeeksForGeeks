//{ Driver Code Starts

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String a = sc.next ();
            String b = sc.next ();
            
            if (new Sol().commonSubseq(a, b))
                System.out.println (1);
                
            else
                System.out.println (0);
    		   
        
System.out.println("~");
}
        
    }
}

// Contributed By: Pranay Bansal


// } Driver Code Ends





class Sol
{
    Boolean commonSubseq (String a, String b)
    {
     boolean found = false;
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                if (a.charAt(i) == b.charAt(j)) {
                    found = true;
                    break;
                }
            }
            if (found) break;
        }
        return found;
    }
}