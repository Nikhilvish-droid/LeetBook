class Solution {
    public int addDigits(int num) {
    
        while(num >= 10){
            int temp = num;
            int digitsum = 0;
            while(temp > 0){
                digitsum += temp%10;
                temp = temp/10;
            }
            num = digitsum;
        }
        return num;
    }
}