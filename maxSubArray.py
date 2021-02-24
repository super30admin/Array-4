# Time Complexity : O(N)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        if not nums:
            return 0
        curr = nums[0]
        mx = nums[0]
        
        for i in range(1, len(nums)):
            curr = max(curr+nums[i], nums[i])
            mx = max(mx, curr)
            
        return mx