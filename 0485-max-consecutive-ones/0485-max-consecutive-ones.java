class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, maxans = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                count++;
                if(count > maxans) maxans = count;
            }
            else{
                // maxans = Math.max(maxans, count);
                count = 0;
            }
        }
        return maxans;
    }
}