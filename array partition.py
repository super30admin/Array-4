#TC: O(nlogn)
#SC: O(1)
class Solution(object):
    def arrayPairSum(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        nums.sort()
        res=0
        for i in range(0,len(nums),+2):
            res=res+nums[i]
        return res