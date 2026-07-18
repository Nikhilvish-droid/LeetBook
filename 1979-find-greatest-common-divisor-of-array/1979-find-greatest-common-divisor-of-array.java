class Solution {
    public int findGCD(int[] nums) {
        int mx = nums[0], mn = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > mx) mx = nums[i];
            if(nums[i] < mn) mn = nums[i];
        }
        return gcd(mn, mx);
    }

    private int gcd(int a, int b){
        while(b != 0){
            int temp = a%b;
            a = b;
            b = temp;
        }
        return a;
    }
}