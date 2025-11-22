class Solution:
    def minimumOperations(self, nums: List[int]) -> int:
        opr = sum(list(map(lambda x : 1 if x%3 == 2 else x%3 , nums)))
        return opr 