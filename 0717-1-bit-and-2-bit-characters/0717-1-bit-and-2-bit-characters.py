class Solution:
    def isOneBitCharacter(self, bits: List[int]) -> bool:
        l= len(bits) 
        k=0
        while k < l-1:
            k += bits[k] +1
        return k == l - 1

