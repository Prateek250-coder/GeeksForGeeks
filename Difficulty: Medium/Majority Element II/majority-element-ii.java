//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        while (t-- > 0) {
            String s = sc.nextLine();
            String[] parts = s.split(" ");
            int[] nums = new int[parts.length];
            for (int i = 0; i < parts.length; i++) {
                nums[i] = Integer.parseInt(parts[i]);
            }
            Solution ob = new Solution();
            List<Integer> ans = ob.findMajority(nums);

            if (ans.size() == 0) {
                System.out.println("[]");
            } else {
                for (int i : ans) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}

// } Driver Code Ends


class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] nums) {
       ArrayList<Integer>list=new ArrayList<>();
        ArrayList<Integer>list1=new ArrayList<>();
       int n=nums.length;
       int c=n/3;
       HashMap<Integer,Integer>map=new HashMap<>();
       for(int i:nums){
           map.put(i,map.getOrDefault(i,0)+1);
       }
       HashSet<Integer>set=new HashSet<>();
       for(int i:nums){
           set.add(i);
       }
       for(int i:set){
           if(map.get(i)>c){
               list.add(i);
           }
       }
       return list;
    
    }
}
