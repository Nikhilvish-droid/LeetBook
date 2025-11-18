class Solution:
    def isOneBitCharacter(self, bits: List[int]) -> bool:
        l= len(bits) 
        k=0
        while k < l-1:
            if bits[k]==0:
                k +=1
            else:
                k +=2
        return k == l - 1

