class Solution:
    def numSub(self, s: str) -> int:
        tot, cnt = 0, 0
        for no in s :
            if no=="1" :
                cnt +=1
            else:
                cnt = 0
            tot =tot+cnt
        return tot%1000000007