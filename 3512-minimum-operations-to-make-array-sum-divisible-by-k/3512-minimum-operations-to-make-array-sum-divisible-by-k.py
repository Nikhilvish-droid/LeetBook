class Solution:
    def minOperations(self, nums: List[int], k: int) -> int:
        opr = 0
        ans = sum(nums)
        
        while ans%k !=0 :
            ans -=1
            opr +=1
        return opr
