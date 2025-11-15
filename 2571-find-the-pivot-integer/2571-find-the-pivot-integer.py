class Solution:
    def pivotInteger(self, n: int) -> int:
        arr=[i for i in range(1,n+1)]
        l, ans =len(arr), arr[-1]
        sum = 0
        for i in arr :
            sum +=i
        for i in range(l-1,-1,-1) :

            if sum==ans :
                return arr[i]
            
            sum -= arr[i]
            ans += arr[i-1]

            if sum < ans :
                return -1