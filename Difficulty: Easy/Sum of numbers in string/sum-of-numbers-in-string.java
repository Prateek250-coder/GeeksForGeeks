class Solution {
    public int findSum(String s) {
        // code here
   int sum = 0;
        int num = 0;

        for(int i = 0; i < s.length(); i++){

            if(Character.isDigit(s.charAt(i))){
                num = num * 10 + (s.charAt(i) - '0');
            }
            else{
                sum += num;
                num = 0;
            }
        }

        sum += num;   // add last number if string ends with digit
        return sum;
    }
}