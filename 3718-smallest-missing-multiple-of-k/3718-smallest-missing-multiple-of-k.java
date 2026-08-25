class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n = nums.length;
        
        HashMap<Integer, Boolean> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            if(nums[i]%k == 0){
                map.put(nums[i],true);
            }
        }
        int i = k;
        while(map.getOrDefault(k, false)){
            k += i;
        }

        return k;
    }
}