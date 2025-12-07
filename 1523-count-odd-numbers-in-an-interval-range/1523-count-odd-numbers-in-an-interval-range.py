class Solution:
    def countOdds(self, low: int, high: int) -> int:
        number = (high - low)//2

        if low%2 ==0 and high%2 ==0:
            return number        
        return number +1