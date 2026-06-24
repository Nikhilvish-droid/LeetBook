class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int [] temparr = nums.clone();
        Arrays.sort(temparr);
        
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            map.putIfAbsent(temparr[i], i);
        }

        for(int i = 0; i < nums.length; i++){
            nums[i] = map.get(nums[i]);
        }

        return nums;
    }
}