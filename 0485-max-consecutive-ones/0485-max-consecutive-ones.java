class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, maxans = 0;
        for(int ele : nums){
            if(ele == 1){
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