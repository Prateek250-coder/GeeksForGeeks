import java.util.*;

class Solution {
    public int getSecondLargest(int[] arr) {
        int n = arr.length;
        HashSet<Integer> set = new HashSet<>();
        
        // Add elements to remove duplicates
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }
        
        // If all elements are same
        if (set.size() == 1) {
            return -1;
        }
        
        // Convert set to list and sort
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        
        // Second largest is second last element
        return list.get(list.size() - 2);
    }
}
