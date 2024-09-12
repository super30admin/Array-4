# Time Complexity : O(nlogn)
# Space Complexity : O(1)

class Solution(object):
    def arrayPairSum(self, nums):
        # sort array
        nums.sort()
        rtnData = 0
        # Iterate through the interval of 2 and add the min of them to the result
        for i in range(0, len(nums), 2):
            rtnData += nums[i]
        return rtnData