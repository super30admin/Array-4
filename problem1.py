# // Time Complexity : O(nlogn)
# // Space Complexity : o(n)
# // Did this code successfully run on Leetcode : Yes

class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        if nums is None or len(nums) == 0:
            return 0

        sum = 0

        nums.sort()

        for i in range(0, len(nums), 2):
            sum = sum + nums[i]

        return sum

