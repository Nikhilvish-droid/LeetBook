class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] ans = new int[2];
        ans[0] = lowerBound(nums, target);
        ans[1] = upperBound(nums, target);
        return ans;
    }   

    private int lowerBound(int[] nums, int target){
        int left = 0, right = nums.length - 1;
        int bound = -1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(target == nums[mid]){
                bound = mid;
            }
            if(nums[mid] >= target){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return bound ;
    }

    private int upperBound(int[] nums, int target){
        int left = 0, right = nums.length - 1;
        int bound = -1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(target == nums[mid]){
                bound = mid;
            }
            if(nums[mid] > target){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return bound;
    }
}