# Time Complexity : O(n*log(n)), where n is the length of the input array
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : None

# Your code here along with comments explaining your approach
class Solution(object):
    def arrayPairSum(self, nums):
        nums.sort()
        temp = 0
        # taking alternate nums, len always 2n
        for i in range(0, len(nums), 2):
            temp += nums[i]

        return temp
