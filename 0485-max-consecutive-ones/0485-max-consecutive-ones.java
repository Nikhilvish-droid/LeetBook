class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, maxans = 0;
        for(int ele : nums){
            if(ele == 1){
                count++;
                maxans = Math.max(maxans, count);
            }
            else{
                // maxans = Math.max(maxans, count);
                count = 0;
            }
        }
        return maxans;
    }
}