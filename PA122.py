#Time Complexity - O(n)
#Space Complexity - O(1)
class Solution(object):
    def maxSubArray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        cm = nums[0]
        gm = nums[0]
        for i in range(1,len(nums)):
            cm = max(nums[i],cm + nums[i])
            if gm < cm:
                gm = cm
                
        return gm