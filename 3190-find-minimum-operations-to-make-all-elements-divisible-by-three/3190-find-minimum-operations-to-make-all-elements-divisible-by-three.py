class Solution:
    def minimumOperations(self, nums: List[int]) -> int:
        opr = 0
        for val in nums :
            rem = val%3
            if rem == 2:
                rem = 1
            opr += rem 
        return opr 