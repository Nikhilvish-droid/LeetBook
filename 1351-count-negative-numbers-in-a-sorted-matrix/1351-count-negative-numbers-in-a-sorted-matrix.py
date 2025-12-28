class Solution:
    def countNegatives(self, grid: List[List[int]]) -> int:
        n = len(grid)
        m = len(grid[0])
        count = 0
        ans = []
  
        for i in range(n):
            ans.extend(grid[i])
        
        for i in range(len(ans)):
            if ans[i] < 0:
                count +=1
        return count