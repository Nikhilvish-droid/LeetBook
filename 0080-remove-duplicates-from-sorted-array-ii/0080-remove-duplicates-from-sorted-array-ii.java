class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        int curr = nums[0];
        int curridx = 1;
        int count = 1;
        for(int i = 1; i < nums.length; i++){
        
            if(nums[i] == curr){
                if(count < 2){
                    nums[curridx] = nums[i];
                    curridx++;
                    count++;
                }
            }
            else{
                nums[curridx] = nums[i];
                curridx++;
                count = 1;
                curr = nums[i];
            }
            
        }
        return curridx;

    }
}