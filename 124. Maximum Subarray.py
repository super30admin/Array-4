class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        if nums is None or len(nums) == 0:
            return 0

        rSum = nums[0]
        mx = nums[0]
        start = 0
        end = 0
        currSt = 0
        for i in range(1, len(nums)):
            # rSum = max(rSum + nums[i], nums[i])
            if nums[i] > nums[i] + rSum:
                rSum = nums[i]
                currSt = i
            else:
                rSum = rSum + nums[i]

            if rSum > mx:
                mx = rSum
                end = i
                start = currSt

        print(start, end)

        return mx

# Running Sum
# Time Complexity: O(n)
# Space Complexity: O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : No
