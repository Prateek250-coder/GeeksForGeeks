// User function Template for Java

class Solution {
    public int firstNonRepeating(int[] arr) {
        // Complete the function
        int ans=0;
        HashMap<Integer,Integer>map= new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i])==1){
                ans=arr[i];
                break;
            }
        }
        return ans;
    }
}
