class Solution:
    def countPartitions(self, nums: List[int]) -> int:
        count = 0 
        n = len(nums)
        tot_sum = sum(nums)
        sum_sub = 0
        for i in range(0,n-1):
            sum_sub +=nums[i]
            tot_sum -=nums[i]
            if (tot_sum-sum_sub)%2 == 0 :
                count +=1
        return count 