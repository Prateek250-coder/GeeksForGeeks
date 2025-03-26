//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Arrays;

public class Driver {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            String s1 = br.readLine();
            String s2 = br.readLine();

            Solution obj = new Solution();

            boolean a = obj.areIsomorphic(s1, s2);
            if (a)
                System.out.println("true");
            else
                System.out.println("false");

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    // Function to check if two strings are isomorphic.
    public static boolean areIsomorphic(String s1, String s2) {
        int n=s1.length();
        int n1=s2.length();
        if(n!=n1){
            return false;
        }
        ArrayList<Integer>list=new ArrayList<>();
        ArrayList<Integer>list1=new ArrayList<>();
        LinkedHashMap<Character,Integer>map=new LinkedHashMap<>();
        LinkedHashMap<Character,Integer>map1=new LinkedHashMap<>();
       for(int i=0;i<n;i++){
           map.put(s1.charAt(i),map.getOrDefault(s1.charAt(i),0)+1);
       }
       
       for(Map.Entry<Character,Integer>entry:map.entrySet()){
           list.add(entry.getValue());
       }
            for(int i=0;i<n1;i++){
           map1.put(s2.charAt(i),map1.getOrDefault(s2.charAt(i),0)+1);
       }
       
       for(Map.Entry<Character,Integer>entryy:map1.entrySet()){
           list1.add(entryy.getValue());
       }
       return (list1.equals(list));
    }
       
       
}