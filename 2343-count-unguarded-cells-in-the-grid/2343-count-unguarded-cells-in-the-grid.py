class Solution:
    def countUnguarded(self, m: int, n: int, guards: List[List[int]], walls: List[List[int]]) -> int:
        mat = [[0] * n for _ in range(m)]

        for x, y in walls:
            mat[x][y] = -1  
        for x, y in guards:
            mat[x][y] = 2  

        def watch(x, y):
            for c in range(y + 1, n):
                if mat[x][c] == -1 or mat[x][c] == 2:
                    break
                mat[x][c] = 1
            for c in range(y - 1, -1, -1):
                if mat[x][c] == -1 or mat[x][c] == 2:
                    break
                mat[x][c] = 1
            for r in range(x + 1, m):
                if mat[r][y] == -1 or mat[r][y] == 2:
                    break
                mat[r][y] = 1
            for r in range(x - 1, -1, -1):
                if mat[r][y] == -1 or mat[r][y] == 2:
                    break
                mat[r][y] = 1

        for x, y in guards:
            watch(x, y)

        ans = 0
        for r in range(m):
            for c in range(n):
                if mat[r][c] == 0:
                    ans += 1
        return ans
