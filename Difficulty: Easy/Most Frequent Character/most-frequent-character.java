class Solution {
    public char getMaxOccuringChar(String s) {

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        char ch = ' ';
        int maxfrequency = 0;

        for(Map.Entry<Character, Integer> entry : map.entrySet()) {

            if(entry.getValue() > maxfrequency) {
                maxfrequency = entry.getValue();
                ch = entry.getKey();
            }

            else if(entry.getValue() == maxfrequency &&
                    entry.getKey() < ch) {

                ch = entry.getKey();
            }
        }

        return ch;
    }
}