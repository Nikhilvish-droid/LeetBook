class Solution:
    def minOperations(self, nums: List[int], k: int) -> int:
        opr , sum = 0 , 0 
        for i in nums :
            sum +=i 
        
        while sum%k !=0 :
            sum -=1
            opr +=1
        return opr
