class Solution:
    def maxArea(self, height: list[int]) -> int:
        i ,res= 0 ,0
        j = len(height)-1
        while i < j:
            res = max(res,(j-i)*min(height[i],height[j]))
            if height[i] < height[j]:
                i +=1
            else:
                j -=1
        return res