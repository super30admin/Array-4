#Time Complexity:O(n)
#Space Complexity:O(1)
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        if len(nums)==0:
            return 0
        curr=nums[0]								#variable to hold current sum and the maximum value
        m=nums[0]
        for i in range(1,len(nums)):				#parse through the array to find current sum and max at every point and return max after the parse
            curr=max([curr+nums[i],nums[i]])
            m=max([m,curr])
        return m