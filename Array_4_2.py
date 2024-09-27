class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        result = nums[-1]
        for i in range(len(nums)-2, -1, -1):
            nums[i] = max(nums[i], nums[i] + nums[i+1])
            result = max(result, nums[i])
        return result

#TC: O(n)
#SC: O(1)
