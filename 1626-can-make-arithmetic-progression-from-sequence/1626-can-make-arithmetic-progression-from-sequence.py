class Solution:
    def canMakeArithmeticProgression(self, arr: List[int]) -> bool:
        arr.sort()
        ans=arr[1]-arr[0]
        for i in range(len(arr)-1):
            d=arr[i+1]-arr[i]
            if d != ans :
                return False
                
        return True

            