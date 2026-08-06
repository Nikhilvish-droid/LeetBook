class Solution {
    public int smallestNumber(int n, int t) {
    
        if(product(n) % t == 0){
            return n;
        }

        int ans = n;
        while(product(ans)%t != 0 && ans <= 100){
            ans++;
        }

        return ans;
    }

    private int product(int n){

        if(n/10 == 0){
            return n;
        }

        int first = n%10;
        int second = n/10;

        return first*second;
    }
}