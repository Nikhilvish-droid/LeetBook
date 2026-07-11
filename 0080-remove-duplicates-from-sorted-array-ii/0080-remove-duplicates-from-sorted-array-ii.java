class Solution {
    public int removeDuplicates(int[] nums) {
        // int curr = nums[0];
        // int curridx = 1;
        // int count = 1;
        // for(int i = 1; i < nums.length; i++){
        
        //     if(nums[i] == curr){
        //         if(count < 2){
        //             nums[curridx] = nums[i];
        //             curridx++;
        //             count++;
        //         }
        //     }
        //     else{
        //         nums[curridx] = nums[i];
        //         curridx++;
        //         count = 1;
        //         curr = nums[i];
        //     }
            
        // }
        // return curridx;

        //or two pointer approach
        int k = 0;
        for(int i = 0; i < nums.length; i++){
            if(k < 2 || nums[i] != nums[k-2]){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}