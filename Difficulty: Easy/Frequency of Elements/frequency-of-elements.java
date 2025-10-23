class Solution {
    public ArrayList<ArrayList<Integer>> countFreq(int[] arr) {
        ArrayList<ArrayList<Integer>> arr1 = new ArrayList<>();
        HashMap <Integer, Integer> map =new  HashMap<>();
        for(int i :arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i: map.keySet()){
            ArrayList<Integer>arr2= new ArrayList<>();
            arr2.add(i);
            arr2.add(map.get(i));
            arr1.add(arr2);
        }
        return arr1;
    }
}