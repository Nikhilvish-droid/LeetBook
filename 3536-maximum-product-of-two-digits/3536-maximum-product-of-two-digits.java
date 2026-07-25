class Solution {
    public int maxProduct(int n) {
        int first = 0, second = 0;
        if(n/100 == 0){
            first = n/10;
            second = n%10;
            return first*second;
        }
        while(n > 0){
            int rem = n%10;
            if(first < rem){
                second = first;
                first = rem;;
            }
            else if(first >= rem && rem > second){
                second = rem;
            }

            n /= 10;
        }

        return first*second;
    }
}