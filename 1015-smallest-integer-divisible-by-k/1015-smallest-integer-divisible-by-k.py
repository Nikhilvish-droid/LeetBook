class Solution:
    def smallestRepunitDivByK(self, k: int) -> int:
        sum, l = 1, 1 
        while l <= k  :
            if sum%k ==0:
                return l
            sum = sum*10 + 1
            l +=1
        return -1