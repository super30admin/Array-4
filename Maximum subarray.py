#TC: O(n)
#SC: O(1)
class Solution(object):
    def maxSubArray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if nums==None or len(nums)==0:
            return 0
        max1=nums[0]
        currSum=nums[0]
        for i in range(1,len(nums)):
            if currSum+nums[i]>nums[i]:
                currSum+=nums[i]
            else:
                currSum=nums[i]
            max1=max(currSum,max1)
                
        return max1