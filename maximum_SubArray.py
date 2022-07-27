# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
#
#
class Solution:
    def maxSubArray(self, nums) -> int:
        maxi = nums[0]
        currSum = nums[0]
        for i in range(1, len(nums)):
            currSum = max(nums[i], currSum+nums[i])
            maxi = max(maxi, currSum)
        return maxi


print(Solution().maxSubArray([-2,1,-3,4,-1,2,1,-5,4]))
