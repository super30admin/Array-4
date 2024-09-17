# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No
#
#
# // Your code here along with comments explaining your approach
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        if nums == 0 or len(nums) == 0:
            return 0
        rsum = nums[0]
        maxi = nums[0]
        for i in range(1,len(nums)):
            #Check max of running sum and the current number
            rsum = max(nums[i], rsum+nums[i])
            maxi = max(maxi,rsum)
        return maxi