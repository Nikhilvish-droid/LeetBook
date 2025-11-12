class Solution:
    def isPalindrome(self, x: int) -> bool:
        if x>=0:
            sum = 0
            ans=x
            while x >0:
                rem=int(x%10)
                sum = sum*10 +rem
                x=int(x//10)
            return sum==ans
        else:
            return False
