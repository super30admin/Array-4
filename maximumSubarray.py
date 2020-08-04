# Time Complexity : O(n), where n is the length of the input array
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : None

# Your code here along with comments explaining your approach

# This solution keeps track of local subarray being explored and the global
# max subarray window, with the help of three pointers and a global sum
class Solution(object):
    def maxSubArray(self, nums):
        if not nums: return 0
        # 2 pointers for the subarray window
        start, end = 0, 0
        # global sum
        temp = float('-inf')
        # local sum and window start
        rSum, k = 0, 0

        for i in range(len(nums)):
            rSum += nums[i]
            # Change local window to explore
            if nums[i] > rSum:
                k = i
                rSum = nums[i]
            # Change global window
            if rSum > temp:
                start = k
                end = i
                temp = rSum

        # print nums[start], nums[end]
        return temp
