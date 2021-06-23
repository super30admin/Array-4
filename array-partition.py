class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        if nums is None or len(nums) == 0: return -1
        nums.sort()
        print(nums)
        maxreturn = 0
        for idx in range(0, len(nums), 2):
            print(idx)
            maxreturn += nums[idx]
        return maxreturn

#SC(1)
    # TC(nlon)