class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        for(int i = digits.length - 1; i >= 0; i--){
            int val = digits[i] + carry;
            if(val == 10){
                digits[i] = 0;
                carry = 1;
            }
            else{
                digits[i] = val;
                carry = 0;
                break;
            }
        }
        if(carry == 1){
            int[] ans = new int[digits.length + 1];
            ans[0] = 1;
            for(int i = 1; i <= digits.length; i++){
                ans[i] = digits[i-1];
            }
            return ans;
        }
        return digits;
        
    }
}