class Solution:
    def minimumBoxes(self, apple: List[int], capacity: List[int]) -> int:
        app_sum = sum(apple)
        capacity.sort(reverse=True)
        count = 0

        i=0
        while app_sum > 0 :
            app_sum -=capacity[i]
            count +=1
            i +=1
        return count