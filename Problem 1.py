# Time Complexity : O(nlogn) where n is length of list
# Space Complexity :O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution(object):
    def arrayPairSum(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        # r=len(nums)/2
        # sum=0
        # nums.sort()
        # for i in range(0, len(nums),2):
        #     sum+=nums[i]
        # return sum

        # sort the numbers and add every 2nd element of the list
        return sum(sorted(nums)[::2])