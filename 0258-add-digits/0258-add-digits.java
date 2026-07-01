class Solution {
    public int addDigits(int num) {
    
        if(num > 9){
            int temp = num;
            int digitsum = 0;
            while(temp > 0){
                digitsum += temp%10;
                temp /= 10;
            }
            
            if(digitsum > 9){
                digitsum = digitsum/10 + digitsum%10;
            }
            if(digitsum > 9){
                digitsum = digitsum/10 + digitsum%10;
            }

            num = digitsum;
        }
        return num;
    }
}