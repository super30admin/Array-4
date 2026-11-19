# Time Complexity : O(N)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach
# Using 2 variables. Initialize both curr and maxnum to first element in nums array.
# Iterate over the array and get the maximum between nums[i] and sum of curr + nums[i]
# Then get the maximum between curr and maxnum
# Return maxnum

class Solution:
    def maxSubArray(self, nums: list[int]) -> int:
        curr = nums[0]
        maxnum = nums[0]
        tempindex = 0
        startindex = 0
        endindex = 0
        for i in range(1, len(nums)):
            if nums[i] > curr + nums[i]:
                curr = nums[i]
#               tempindex = i
            else:
                curr = curr + nums[i]
            if curr > maxnum:
#               startindex = tempindex
#               endindex = i
                maxnum = curr
#               print(startindex, endindex)
        return maxnum
# For getting the indices of the range
