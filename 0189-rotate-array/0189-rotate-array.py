class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        length= len(nums)
        k= k%length
        for i  in range(k):
            nums.insert(0,nums[-1])
            nums.pop(-1)
        return nums