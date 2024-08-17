//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.util.function.Function;
import java.util.stream.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = Integer.parseInt(s[i + 1]);
            }
            int k = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            int[] ans = obj.topK(nums, k);
            for (int i = 0; i < ans.length; i++) System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution {
    public int[] topK(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        int res[]=new int[k];
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->{
            int num1=map.get(a);
            int num2=map.get(b);
            return num1==num2?a-b:num1-num2;
        });
        for(Map.Entry<Integer,Integer>m:map.entrySet()){
            pq.add(m.getKey());
            if(pq.size()>k){
                pq.poll();
            }
        }
        while(!pq.isEmpty()){
            res[--k]=pq.poll();
        }
        return res;
    }
}