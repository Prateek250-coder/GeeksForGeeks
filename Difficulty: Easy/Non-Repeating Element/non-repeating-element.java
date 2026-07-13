class Solution {
    public int firstNonRepeating(int[] arr) {
        // code here
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
